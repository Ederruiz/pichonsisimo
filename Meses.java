/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Meses;

import java.util.Scanner;

/**
 *
 * @author eder0
 */
public class Meses {
    public static void main(String[] args) {
        System.out.println("Dime un numero prro");
        int numero=0;
        Scanner teclado=new Scanner(System.in);
        numero=teclado.nextInt();
        switch(numero){
            case 1: System.out.println("Es enero y tiene 31 dias");
            break;
            case 2: System.out.println("Es febrero");
                System.out.println("Tienes que darme el año para calcular cuantos dias tiene.");
                int anio=0;
                anio=teclado.nextInt();
            if((anio%4==0) && (anio%100 !=0) ||	 (anio%400==0)){
                System.out.println("Tiene 29 dias");  
            }else{
                System.out.println("Tiene 28 dias.");
            }
            break;
            case 3: System.out.println("Es marzo y tiene 31 dias");
            break;
            case 4: System.out.println("Es abril y tiene 30 dias");
            break;
            case 5: System.out.println("Es mayo y tiene 31 dias");
            break;
            case 6: System.out.println("Es junio y tiene 30 dias");
            break;
            case 7: System.out.println("Es julio y tiene 31 dias");
            break;
            case 8: System.out.println("Es agosto y tiene 31 dias");
            break;
            case 9: System.out.println("Es septiembre y tiene 30 dias");
            break;
            case 10: System.out.println("Es octubre y tiene 31 dias");
            break;
            case 11: System.out.println("Es noviembre y tiene 30 dias");
            break;
            case 12: System.out.println("Es diciembre y tiene 31 dias");
            break;
            
        }
        
    }
    
}
