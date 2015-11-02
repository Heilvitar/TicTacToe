#Fall Semester - Software Engineering - T-303-HUGB 
##System Administration Manual 

Atli Gudmundsson, Brynja Skuladottir, Helgi Oskarsson, Hlynur Halldorsson, Ragna Lara Ellertssdottir, Steinar August Steinarsson 

###Introduction
This following Administration Manual describes how to set the web application TicTacToe up and get it to run, also on a fresh machine. Follow next steps on How to install and run the program on clients machine (in case of simple desktop program) and how to deploy, run and maintain in case of client/server or web application.

### Instruction for running TicTacToe locally on your computer:

#### Windows

__Required__
- JDK http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Download the project from  https://github.com/Heilvitar/TicTacToe/archive/v1.0.zip to your local computer and extract the zip file
- open command prompt and navigate the folder
- Run the application at the root of the TicTacToe folder and run this command in cmd  

  ```shell  
  set PORT=4567  
  gradlew run  
  ```  

- Your app should be running now on http://localhost:4567

__Required__

- JDK http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- Download the project from  https://github.com/Heilvitar/TicTacToe/archive/v1.0.zip to your local computer and extract the zip file
- Open the terminal and navigate the folder location. 
- Run the application at the root of the TicTacToe folder and run this command in terminal  

```shell
  $   export PORT=4567
  $   ./gradlew run
  ```

- Your app should be running now on http://localhost:4567


### Through web-application:
Open a browser e.t.c Chrome and got to https://thawing-harbor-6879.herokuapp.com/ to play the game TicTacToe


