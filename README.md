# Fromatter
Format text for left, right and center align. The application requires two arguments, the first argument is the type of align (left, right or center) and the second arg is the width (integer).
The application asks the user for input string to format.

## How to run the application
Build the application with gradle by running gradle build in root dirctory
go to build/lib folder and open a console/terminal

run java -jar formmater.jar left 10

The program asks for input string to format: give it for example "Hello world" the output should be "Hello world          ". It aadds 10 spaces to right.
For right align it will adds spaces to left and for center it will adds half of width to left and right.
