#!/bin/zsh

if ls ./*.class 1> /dev/null 2>&1; then
	rm ./*.class
	echo "Removed existing .class file"
fi 

javac ./demo.java
	
if ls ./*.class 1> /dev/null 2>&1; then
	java DemoMain
	rm ./*.class
	echo "\n>>> Executing was done >>> exit program!"
else 
	echo "Compilation failed or executable program is not found>>> exit"
fi
