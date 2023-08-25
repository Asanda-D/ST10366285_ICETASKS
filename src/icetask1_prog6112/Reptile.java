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
//Reptile class derived from base class Animal
public class Reptile extends Animal{
    //variable
    private double bloodTemp; 
    
    @Override
    public void input() //input method to read user entry
    {
        super.input();//call the base class input method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the blood temperature: ");
        bloodTemp = scanner.nextDouble();
        
    }//end of input()
    
    @Override
    public void output() //output method to display user entry
    {
        super.output();//call the base class output method
        System.out.println("Blood temperature: " + bloodTemp);
    }//end of output()
    
}//end of Reptile class

