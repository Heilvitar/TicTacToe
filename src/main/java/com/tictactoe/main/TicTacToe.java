package com.tictactoe.main;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
import org.json.simple.JSONObject;

public class TicTacToe implements SparkApplication{
    Game currentGame = null;
    public static void main(String[] args) {
	/*The public folder includes html, css, javascript and images */
	staticFileLocation("/public");
	SparkApplication ticTacToe = new TicTacToe();
	String portNumber = System.getenv("PORT");
	if(portNumber != null){
		setPort(Integer.parseInt(portNumber));
		ticTacToe.init();
	}
    }

    public void init(){
	/*Recieves a post ajax request to start a new game */
	post("/newGame", (req, res) -> {
		res.status(200);
		newGame();
		return res;
	});
	/*Each time a column is clicked*/
        post("/clickColumn", (req, res) -> {
		/*Get row and column to compare*/
		int r = Integer.parseInt(req.queryParams("id").substring(0, 1));
		int c = Integer.parseInt(req.queryParams("id").substring(1, 2));
                res.status(200);
		/*Create a new jsonobject so data can be parsed for the client*/
		JSONObject response = new JSONObject();
		if(currentGame.inputFromPlayer(r, c)){
			response.put("success", "1");
			if(currentGame.checkWin()){
				response.put("won", Character.toString(currentGame.getCurrentPlayer().getSymbol()));
			}
			else if(currentGame.checkTie()){
				response.put("won", "t");
			}
			response.put("player", Character.toString(currentGame.getCurrentPlayer().getSymbol()));
			currentGame.changePlayersTurn();
		}
		else{
			response.put("success", "0");
		}
                return response.toJSONString();
        });
    }

    public void newGame(){
	currentGame = new Game();
    }
}
