/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no_of_years_days;

import java.util.Scanner;

/**
 *
 * @author Supreme
 */
public class No_of_years_days {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of minutes:");
    int minutes = input.nextInt();
    int year = minutes / 525600;
    int day = minutes / 1440;
    int remainingMinutes = day % 525600;
    System.out.println(minutes + " minutes is " + year + " years and "  +  remainingMinutes + " days ");
    }
    
}
