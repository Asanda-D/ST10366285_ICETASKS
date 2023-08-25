/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1_prog6112;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
//parent class Animal
public class Animal {
    //variables
    private int IDtag;
    private String species;

   public void input() 
   {
        //create scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IDtag: ");
        IDtag = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter species: ");
        species = scanner.nextLine();
   }//end of input()

    public void output() 
    {
        //displaying user input
        System.out.println("IDtag: " + IDtag);
        System.out.println("Species: " + species);
    }//end of output()
    
}//end of base class 

