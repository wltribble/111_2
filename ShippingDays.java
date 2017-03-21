/*
  Name: Will Tribble
  Student ID: 10540462
  Email: wltribbl@go.olemiss.edu
  Course Information: CSCI 111 - Section 01
  Program Source File Name: ShippingDays.java
  Programming Assignment: 2
  References: none
  Program Description: This program takes a start day and shipping time
      and calculates the arrival day of the week.
  Due Date: Wednesday, March 22, 2017, 11:59 p.m.

  In keeping with the honor code policies of the University of Mississippi, the School of
  Engineering, and the Department of Computer and Information Science, I affirm that I have
  neither given nor received assistance on this programming assignment. This assignment
  represents my individual, original effort.
  ... My Signature is on File.
  */

// import the input ability
import java.util.Scanner;

// set up the class and main method
public class ShippingDays {
  public static void main (String[] args) {
    // create an input object
    Scanner keyboard = new Scanner(System.in);

    // prompt user for a day of the week (and lowercase it)
    System.out.println("\nEnter a day of the week: \nSun - Sunday \n"
    + "Mon - Monday \nTue - Tuesday \nWed- Wednesday \nThu - Thursday \n"
    + "Fri - Friday \nSat - Saturday\n");
    String inputDay = keyboard.nextLine();
    inputDay.toLowerCase();


    // initialize the important and active variables
    int dayNum;
    String startDay;
    String arrivalDay;

    // if the entered input is valid...
    if (inputDay.equals("sun") || inputDay.equals("mon") || inputDay.equals("tue") || inputDay.equals("wed") || inputDay.equals("thu") || inputDay.equals("fri") || inputDay.equals("sat")) {
      // prompt user for number of shipping days
      System.out.println("\nEnter number of shipping days:");
      int shippingDays = keyboard.nextInt();

      // switch on the current day to decide its corresponding number
      switch (inputDay) {
        case "sun":
          dayNum = 0;
          startDay = "Sunday";
          break;
        case "mon":
          dayNum = 1;
          startDay = "Monday";
          break;
        case "tue":
          dayNum = 2;
          startDay = "Tuesday";
          break;
        case "wed":
          dayNum = 3;
          startDay = "Wednesday";
          break;
        case "thu":
          dayNum = 4;
          startDay = "Thursday";
          break;
        case "fri":
          dayNum = 5;
          startDay = "Friday";
          break;
        case "sat":
          dayNum = 6;
          startDay = "Saturday";
          break;
        default:
          dayNum = -1;
          startDay = "null";
          break;
      }

      // find out the arrival day of the week as a number
      int arrival = dayNum + (shippingDays % 7);
      arrival %= 7;

      // switch on the arrival number to get its day of the week
      switch (arrival) {
        case 0:
          arrivalDay = "Sunday";
          break;
        case 1:
          arrivalDay = "Monday";
          break;
        case 2:
          arrivalDay = "Tuesday";
          break;
        case 3:
          arrivalDay = "Wednesday";
          break;
        case 4:
          arrivalDay = "Thursday";
          break;
        case 5:
          arrivalDay = "Friday";
          break;
        case 6:
          arrivalDay = "Saturday";
          break;
        default:
          arrivalDay = "null";
          break;
      }

      // print out the shipping estimate
      System.out.println("\n" + shippingDays + " days from " + startDay + " is " + arrivalDay + "\n");

    } else {
      // throw an error if the input is invalid
      System.out.println("Error! Day cannot be determined\n");
    }
  }
}
