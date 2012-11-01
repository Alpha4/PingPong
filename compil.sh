#!/bin/bash

for element in src/*
	do javac -sourcepath src -classpath bin -d bin $element
done