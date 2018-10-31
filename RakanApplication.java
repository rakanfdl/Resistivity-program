/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakanapplication;
import java.util.Scanner;
/**
 *
 * @author of
 */
public class RakanApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ro = 0.0;
        double Ao = 0.0;
        double Lo = 0.0;
        
        double rw = 0.0;
        double Aw = 0.0;
        double Lw = 0.0;
        
        double a = 0.0;
        double m = 0.0;
        
        double F = 0.0;
        double Rw = 0.0;
        double Ro = 0.0;
        
        double segma = 0.0;
        
        
        boolean inCorrect = false;
        Scanner keyboard = new Scanner(System.in);
        
        while(!inCorrect) {
            System.out.println("Ro or Rw?");
            String R = keyboard.nextLine();

            if(R.equalsIgnoreCase("ro")) {
                inCorrect = true;
                System.out.println("please enter r, A, L");
                ro = keyboard.nextDouble();
                Ao = keyboard.nextDouble();
                Lo = keyboard.nextDouble();
            } else if (R.equalsIgnoreCase("rw")) {
                inCorrect = true;
                System.out.println("please enter r, A, L");
                rw = keyboard.nextDouble();
                Aw = keyboard.nextDouble();
                Lw = keyboard.nextDouble();
                
            } else {
                System.out.println("Incorrect input!");
            }
            
            if(R.equalsIgnoreCase("ro")) {
                
                System.out.println("please enter r, A, L for the Rw");
                rw = keyboard.nextDouble();
                Aw = keyboard.nextDouble();
                Lw = keyboard.nextDouble();
                
            } else if(R.equalsIgnoreCase("rw")) {
                
                System.out.println("please enter r, A, L for the Ro");
                ro = keyboard.nextDouble();
                Ao = keyboard.nextDouble();
                Lo = keyboard.nextDouble();
            }
            
        }
        
        F = (ro * Ao / Lo)/(rw * Aw / Lw);
        Ro = (ro * Ao / Lo);
        Rw = (rw * Aw / Lw);
        
        System.out.println("\nRo = " + Ro);
        System.out.println("Rw = " + Rw);
        System.out.println("The Formation Resistivity factor = " + F);
        
        
        boolean check = false;
        
        while (!check) {
            
            System.out.println("\nDo you want to find segma? yes/no");
        
            String R = keyboard.nextLine();

            if(R.equalsIgnoreCase("yes")) {
                check = true;
                System.out.println("please enter a, m");
                a = keyboard.nextDouble();
                m = keyboard.nextDouble();
                
                
            } else if(R.equalsIgnoreCase("no")) {
                check = true;
                
            } else {
                System.out.println("Incorrect input!");   
            }
        }
        double power = (Math.log10(F)-Math.log10(a))/-1*(m);
        segma = Math.pow(10, power);
        
        System.out.println("\nRo = " + Ro);
        System.out.println("Rw = " + Rw);
        System.out.println("The Formation Resistivity factor = " + F);
        System.out.println("Segma = " + segma);
        
        System.exit(0);
        
        
        
    }
    
}
