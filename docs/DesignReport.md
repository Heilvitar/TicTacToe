#Fall Semester 2015 - Software Engineering - T-303-HUGB
##System Design Documentation
 
Team:			
Atli Gudmundsson, Brynja Skuladottir, Helgi Oskarsson, Hlynur Halldorsson, Ragna Lara Ellertsdottir, Steinar Agust Steinarsson

###Introduction 

This following design report covers the late term assignment for Software Engineering course at Reykjavík University. We developed the game Tic Tac Toe as a web-application which runs in a web browser. Game logic was programmed in Java. We will make short description of how the game works, for other system details look at other reports which are included in the project.

- Development Manual: What software is required and how to get the project to build on a fresh machine.

- Administration Manual: How to set the project up and run it on a fresh machine.
The method used to code was Test driven development. A test was written, commited and the function written and commited with proper refactoring. 

###Coding Princeples 

Test-driven development (TDD) was used when coding  the TicTacToe web application. Feature Branch Workflow was used in development process. Master branch only includes initialization of the project. From master new Development branch was created.  A new branch was created from dev for every independent feature and unit tests were created as TDD requires. The standard programing naming convention was used.

###Description Game

The idea of the game TicTacToe is very simple. The game board in TicTacToe is a 3x3 grid and the players (both humans) take turns by pressing a cell, giving that sell a symbol, x or o. The player succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.

![](pics/TicTacToe_Diagram.png?raw=true)

###Class Diagram 
This following class diagram describes the structure of the web application by showing the classes, their attributes, methods, and the relationship among objects.

![](pics/Class_Diagram.png?raw=true)

The application construction contains three classes, Player, Board and Game. Player represents one player and contains the symbol that the player uses. Board class simply represents the game board. The class contains information about symbols in every cell and how many cells are occupied. The board cass has no game logic. 
A new game is initialized by creating incident of the Game class. The Game class contains two players, a game board and all the game logic.

###User Interface

The user interface is a 3x3 grid where players take turns by clicking a cell and a icon appears in that cell. Player1 always has the first turn. There is a text above the grid that shows the status of the game, which player's turn it is, if somebody won or if it is a tie.

![](pics/UI_Sketch.png?raw=true)

