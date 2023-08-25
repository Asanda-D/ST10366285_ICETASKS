/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask1_prog6112;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class IceTask1_PROG6112 {

    /**
     * @param args the command line arguments
     */
    // Main class
    public static void main(String[] args) {
        // Instantiate two objects
        Bird brd = new Bird();
        Reptile rept = new Reptile();
        
        //input the values for the two objects
        System.out.println("Please enter the details for the bird:");
        brd.input();
        System.out.println("\nPlease enter the details for the reptile:");
        rept.input();
        
        //output the values for the two objects
        System.out.println("\nBird details:");
        brd.output();
        System.out.println("\nReptile details:");
        rept.output();
    }//end of main
    
}//end of class

