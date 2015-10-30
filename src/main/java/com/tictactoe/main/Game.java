package com.tictactoe.main;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class Game implements SparkApplication{
    public static void main(String[] args) {
	staticFileLocation("/public");
	SparkApplication game = new Game();
	String portNumber = System.getenv("PORT");
	if(portNumber != null);{
		setPort(Integer.parseInt(portNumber));	
	}
	game.init();
    }

    public void init(){
    	System.out.println("Hello");
    }
}
