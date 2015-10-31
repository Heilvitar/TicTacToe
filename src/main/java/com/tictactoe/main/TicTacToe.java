package com.tictactoe.main;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TicTacToe implements SparkApplication{
    public static void main(String[] args) {
	staticFileLocation("/public");
	SparkApplication ticTacToe = new TicTacToe();
	String portNumber = System.getenv("PORT");
	if(portNumber != null){
		setPort(Integer.parseInt(portNumber));
		ticTacToe.init();
	}
    }

    public void init(){
	post("/function", (req, res) -> {
		System.out.println("working");
		res.status(200);
		return res;
	});	
        post("/clickColumn", (req, res) -> {
                System.out.println("id is: " + req.queryParams("id"));
                res.status(200);
                return res;
        });
    }
}
