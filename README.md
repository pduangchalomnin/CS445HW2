# CS445HW2
=================================================================
#####System Requirement: 
Java 1.7 or above (apt-get install default-idk)
jUnit4 (apt-get install junit4)

=================================================================

#####Instruction to compile program:
1. Open command line
2. Head to project base directory ‘src’
3. run command ‘javac button/*.java’
4. run command ‘javac lightbulb/*.java’
5. run command ‘javac tableLamp/*.java’
6. The complied class files will be shown in the button, lightbulb, and tableLamp folder respectively.

=================================================================

#####Instruction to run program:
1. Open command line
2. Head to project base directory ‘src’
3. run command ‘java tableLamp.TableLamp’
4. The result will be shown

=================================================================

#####Instruction to use build&run script:
1. Head to folder ‘Patipat-Duangchalomnin-HW-2’ Directory
2. run command ‘sh run.sh’

=================================================================

#####Instruction to compile unit test:
1. Open command line
2. Head to project base directory ‘src’
3. Enter ‘src’ folder by using command ‘cd src’
4. run command ‘javac -cp /usr/share/java/junit4-4.11.jar:. unitTest/*.java’ (Please check your jUnit version before compile)
5. The complied class files will be shown in the unitTest folder.

=================================================================

#####Instruction to run Unit test:
1. Open command line
2. Head to project base directory ‘src’
3. run command ‘java -cp /usr/share/java/junit4-4.11.jar:. org.junit.runner.JUnitCore unitTest.TestSuit’ (Please check your jUnit version before run)
