/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrilaterop;

import java.util.Scanner;

/**
 *
 * @author fatii
 */
public class MainP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----CUADRADO-----");
        System.out.println("Ingresa el primel lado:");
        double x = sc.nextDouble();
         System.out.println("Ingresa el segundo lado:");
        double y = sc.nextDouble();
        
        double AreaC= x*y;
         System.out.println("El area del cuadrado es:"+ AreaC);
         System.out.println("----------------------------------");
    System.out.println("-----RECTANGULO-----");
     System.out.println("Ingresa la base:");
        double x2 = sc.nextDouble();
         System.out.println("Ingresa la altura:");
        double y2 = sc.nextDouble();
        
        double AreaR= x2*y2;
         System.out.println("El area del cuadrado es:"+ AreaR);
         System.out.println("----------------------------------");
    
     System.out.println("-----TRAPECIO-----");
     System.out.println("Ingresa la base mayor:");
        double x3 = sc.nextDouble();
         System.out.println("Ingresa la base menor:");
        double y3 = sc.nextDouble();
        System.out.println("Ingresa el valor de la altura:");
        double H = sc.nextDouble();
        double AreaT= (x3+y3)*H/2;
         System.out.println("El area del cuadrado es:"+ AreaT);
         System.out.println("----------------------------------"); 
    }    
}
