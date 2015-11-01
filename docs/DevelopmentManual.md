#Semester 2015 - Software Engineering - T-303-HUGB
##System Development Documentation

Team:
Atli Gudmundsson, Brynja Skuladottir, Helgi Oskarsson, Hlynur Halldorsson, Ragna Lara Ellertsdottir, Steinar Agust Steinarsson

###Introduction
This following Development Manual is for describing what is needed and how to get the Web-Application TicTacToe to build on a fresh machine. F.e what Source control client and access to source control, what Build environment and  others necessary dependencies.

###Required Software for the creation of TicTacToe game
* Github https://github.com/
* JDK8 http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html 
* Gradle http://www.gradle.org/ 
* Travis https://travis-ci.org/
* Selenium http://www.seleniumhq.org/
* Heroku https://www.heroku.com/

An Link to the project on Github
https://github.com/Heilvitar/TicTacToe

__How to install TicTacToe on Windows:__

Download Github + Git shell for windows here: https://windows.github.com/  
Clone this repo  https://github.com/Heilvitar/TicTacToe/   
> 
```shell
 $ git clone https://github.com/Heilvitar/TicTacToe/ 
```  

Download Gradle from this link: http://gradle.org/downloads

__How to setup Gradle on Windows:__  
Extract and Move the gradle zip file to  
>  _C:\Program Files_ 

Open Git Shell and  create a new file __gradle.properties__ in .gradle that is located in the root of TicTacToe and add the following line  

> 
```shell
org.gradle.daemon=true: echo "org.gradle.daemon=true" > ~/.gradle/gradle.properties. //(This will improve the performance subsequent builds)
```

If the shell cannot find System Java Compiler make sure you have the right JDK installed.  
For more information go to this link:  
https://docs.gradle.org/current/userguide/userguide.html

__How to install on  Linux:__

open the terminal and execute   
>
```shell
$ sudo apt-get install git (If you have yum installed then yum install git)
```

Clone this repo  https://github.com/Heilvitar/TicTacToe/ with this command:  
> 
```shell 
$ git clone https://github.com/Heilvitar/TicTacToe/ 
```  

__Download Gradle for Linux:__

Create a symlink that will allow you to upgrade Gradle without changing any configuration. Execute this in the terminal:

```shell
ln -s ~/opt/packages/gradle/gradle-2.3/ ~/opt/gradle
```
open the **.pofile_ file** and paste this at the bottom:

```shell
# Gradle
if [ -d "$HOME/opt/gradle" ];
     then export GRADLE_HOME="$HOME/opt/gradle"
    PATH="$PATH:$GRADLE_HOME/bin"
fi
```
Source and test Gradle with this command:
```shell
$ source ~/.profile
$ which gradle
$ gradle -version
```  

_For more information got to this site:_
https://docs.gradle.org/current/userguide/installation.html
_and_
http://codetutr.com/2013/03/23/how-to-install-gradle/

### Build Environment

Short description for use of each environment
- Integration Server: QStack from Advania (using SSH)
- Programming Language:  Java
- Tests -  JUnit and Selenium IDE:
-  - JUnit for unit testing and Selenium  for functional testing
- Gradle: To enable automatic build scripts
- Continuous Integration Server - Travis
- - for continouos delivery and also performs all unit and end-to-end tests, and finally builds the application.
- Version Control Server: GitHub
- Staging/Production Environment: Heroku
- - Heroku is a cloud platform based on a managed container system, with integrated data services and a powerful ecosystem, for deploying and running modern apps.- Gradle: To enable automatic build  

###Staging and Production
After the web application has been built and pushed on to Github, Travis receives the code. Travis then tests it and if it passes all the tests then it deploys and runs the application on Heroku which displays the final product. 
