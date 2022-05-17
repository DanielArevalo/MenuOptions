/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuoptions;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Calculadora {
    public static void menuCalculadora(boolean salir)  {
        Scanner sc = new Scanner(System.in);
        while(!salir) {
            System.out.println("Este es el menu de la calculadora");
            sc.next();
        }
        
    }
    
    public static int Sumar (int num[]) {
        //la idea es que segun los numeros que tenga el usuario usted los pueda sumar
        return 0;
    }
}
