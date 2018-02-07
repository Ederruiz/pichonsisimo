/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuEdad;

import java.util.Scanner;

/**
 *
 * @author eder0
 */
public class EdadPerron {
    public static void main(String[] args) {
        int edad=0;
        Scanner prro=new Scanner(System.in);
        System.out.println("Dame tu edad prro");
        edad=prro.nextInt();
        if(edad<10){
            System.out.println("Eres niño rata");   
        }
        else if(edad>10 && edad<=15){
            System.out.println("Pinche pajero");
        }
        else if(edad>15 && edad<=25){
            System.out.println("Estas en la edad correcta para cometer errores :v");
        }
        else if(edad>25 && edad<=30){
            System.out.println("Ya dejat de mamadas");
        }
        else if(edad>30 && edad<=40){
            System.out.println("Ya estas chavo ruco");
        }else if(edad>40 && edad<=60){
            System.out.println("Viejito");
        }
        else if(edad>60 && edad<=100){
            System.out.println("Ya merito te llega uu");
        }
        System.out.println("Tu edad es:"+edad);
        
    }
    
}
