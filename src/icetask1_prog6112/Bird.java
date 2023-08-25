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
//Bird class derived from base class Animal
public class Bird extends Animal{
    //variable
    private int colour;

    @Override
public void input() //input method to read user entry
    {
        super.input();//call the base class input method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather colour number: "
                + "\n1-grey, "
                + "\n2-white, "
                + "\n3-black ");
        colour = scanner.nextInt();
    }

    
 //output method to display user entry
    @Override
  public void output() 
  {
    super.output(); //call the base class output method
    //switch case to make it simpler for user 
    System.out.print("Colour: ");
    switch (colour) {
      case 1:
        System.out.println("grey");
        break;
      case 2:
        System.out.println("white");
        break;
      case 3:
        System.out.println("black");
        break;
      default:
        System.out.println("invalid");
    }//end of switch case
    
  }//end of output()
  
}//end of Bird class
