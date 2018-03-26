# TheatreSeatAllocation
Java Program to book the Seat in a theatre

Purpose of the program -
This program is implemented to identify the seats in a theatre for different customers. Based on requirement it will try to allocate seats to the customers in the same sections of a row. Else it will print "<Name> Call to Split Party."
  
Instructions to run the program
-Main Program SeatAllocation.java
-Input params required in format <name>:<no of seats> For e.g - Hemil:10
  
File Details -
Service class
TheatreServiceImpl.Java - This file builds the theatre layout dynamically when the main program SeatAllocation is executed. Each time it is executed it can built different layout. It is internally using Java Random class to dynamically identify the maximum no of rows (max 15) and maximum no of sections for each row. 

Model classes -
Theatre.java - Contains complete details of a Theatre seat layout
SeatRow.java - Identify the row details containing the seat and section per row.
Section.java - Identify the section details containing the no of seats per section.


