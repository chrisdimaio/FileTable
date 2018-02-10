@ECHO OFF
DEL /Q "C:\Users\cdimaio\Dropbox\MyProjects\DataStuff\FileTable\*.class"

javac -d C:\Users\cdimaio\Dropbox\MyProjects\DataStuff\FileTable\ *.java 

DIR /B *.class

cd "C:\Users\cdimaio\Dropbox\MyProjects\DataStuff\FileTable"
java -cp C:\Users\cdimaio\Dropbox\MyProjects\DataStuff\FileTable\; FileTable %1 %2 %3 %4 %5 %6 %7 %8 %9

ECHO ON