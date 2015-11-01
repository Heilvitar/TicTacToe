#Fall Semester 2015 - Software Engineering - T-303-HUGB
##System Design Documentation
 
Team:			
Atli Gudmundsson, Brynja Skuladottir, Helgi Oskarsson, Hlynur Halldorsson, Ragna Lara Ellertsdottir, Steinar Agust Steinarsson

###Introduction 

This following design report covers the late term assignment for Software Engineering course at Reykjavík University. We developed the game Tic Tac Toe as a web-application which runs in a web browser. Game logic was programmed in Java. We will make short description of how the game works, for other system details look at other reports which are included in the project.

- Development Manual: What software is required and how to get the project to build on a fresh machine.

- Administration Manual: How to set the project up and run it on a fresh machine.
The method used to code was Test driven development. A test was written, commited and the function written and commited with proper refactoring. 

###Description Game

The idea of the game TicTacToe is very simple. The game board in TicTacToe is a 3x3 grid and the players (both humans) take turns by pressing a cell, giving that sell a symbol, x or o. The player succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.


###Class Diagram 
This following class diagram describes the structure of the web application by showing the classes, their attributes, methods, and the relationship among objects.

![](pics/Class_Diagram.png?raw=true)

The application is constructed mainly of three classes, Player, Board and Game. Player represents one player and contains the symbol that the player uses. Board class simply 

