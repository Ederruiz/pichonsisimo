/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saludo;

import java.util.Scanner;

/**
 *
 * @author eder0
 */
public class Saludo {
    public static void main(String[] args) {
        System.out.println("Hola buen dia estimado señor. \n¿Podria decirme su nombre?");
        String nombre;
        Scanner prrito=new Scanner(System.in);
        nombre=prrito.next();
        System.out.println("¿Me podria dar sus apellidos?");
        String apellido;
        apellido=prrito.next();
        System.out.println("Asi que su nombre es:"+nombre+" "+apellido+"\nUn gusto conocerlo.");
        
    }
    
}
