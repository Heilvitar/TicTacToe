#Semester 2015 - Software Engineering - T-303-HUGB
##System Development Documentation

Team:
Atli Gudmundsson, Brynja Skuladottir, Helgi Oskarsson, Hlynur Halldorsson, Ragna Lara Ellertsdottir, Steinar Agust Steinarsson

###Introduction
This following Development Manual is for describing what is needed and how to get the Web-Application TicTacToe to build on a fresh machine. F.e what Source control client and access to source control, what Build environment and  others necessary dependencies.

###Required Software for the creation of the TicTacToe game
* Github https://github.com/
* JDK8 http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html 
* Gradle http://www.gradle.org/ 
* Travis https://travis-ci.org/
* Selenium http://www.seleniumhq.org/
* Heroku https://www.heroku.com/

An Link to the project on Github
https://github.com/Heilvitar/TicTacToe

__How to install on windows:__

- Download Github + Git shell for windows here  https://windows.github.com/
- Clone this repo  https://github.com/Heilvitar/TicTacToe/ 
- $ git clone https://github.com/Heilvitar/TicTacToe/
- Download Gradle from this link: http://gradle.org/downloads 

__How to setup Gradle on Windows:__

* Extract and Move the gradle zip file to C:\Program Files 
* Open Git Shell and  create a new file gradle.properties in .gradle that is located in the root of TicTacToe and add the following line org.gradle.daemon=true: echo "org.gradle.daemon=true" > ~/.gradle/gradle.properties. (This will improve the performance subsequent builds) 
* If the shell cannot find System Java Compiler make sure you have the right JDK installed. For more information go to this link: https://docs.gradle.org/current/userguide/userguide.html

__How to install on  Linux:__

open the terminal and execute 

>$ sudo apt-get install git (If you have yum installed then yum install git)

Clone this repo  https://github.com/Heilvitar/TicTacToe/ with this command:
> $ git clone https://github.com/Heilvitar/TicTacToe/

__Download Gradle for Linux:__

Execute this in the terminal:

>$ mkdir -p ~/opt/packages/gradle && cd $_
$ wget https://services.gradle.org/distributions/gradle-2.3-bin.zip  
$ unzip gradle-2.3-bin.zip

__Install and setup Gradle on Linux:__

Create a symlink that will allow you to upgrade Gradle without changing any configuration. Execute this in the terminal:
> ln -s ~/opt/packages/gradle/gradle-2.3/ ~/opt/gradle

open the _.pofile_ file and paste this at the bottom:
> $ # Gradle  
`if` [ -d "$HOME/opt/gradle" ];  
     then export GRADLE_HOME="$HOME/opt/gradle"
    PATH="$PATH:$GRADLE_HOME/bin"  
`fi`

ource and test Gradle with this command:
> $ source ~/.profile  
 $ which gradle  
$ gradle -version

_For more information got to this site:_
https://docs.gradle.org/current/userguide/installation.html 
_and_  
http://codetutr.com/2013/03/23/how-to-install-gradle/


###Build Environment  
- Integration Server:  QStack from Advania, connected with SSH  
- Version Control Server: GitHub  
- Integration Server: QStack from Advania, using SSH  
- Continuous Integration: Server -> Travis, for continouos delivery and also performs all unit and end-to-end tests, and finally builds the application.  
- Staging/Production Environment: Heroku, Heroku is a cloud platform based on a managed container system, with integrated data services and a powerful ecosystem, for deploying and running modern apps.  
- Programming Language: Java  
- Test -  JUnit and Selenium IDE:  Junit for unit tests and Selenium  for functional test, it  GUI Build Scripts 
- Gradle: To enable automatic build  

###Staging and Production
After the web application has been built and pushed on to Github, Travis receives the code. Travis then tests it and if it passes all the tests then it deploys and runs the application on Heroku which displays the final product. 
