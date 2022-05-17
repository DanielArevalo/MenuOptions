/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuoptions;

import java.util.Scanner;
import menuoptions.Calculadora;

/**
 *
 * @author USER
 */
public class MenuOptions {

    private static String[] options = new String[]{"calculadora matematica", "diccionario de palabras", "salir"};
    private static Calculadora cl = new Calculadora();

    public static void main(String[] args) {
        int numeros[] = new int[] {1,2,3,4} ;
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            for (int i = 0; i < options.length; i++) {
                String mensaje = String.format("%s.%s .", i, options[i]);
                System.out.println(mensaje);
            }
            String mensaje = String.format("Escoja una option");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    cl.menuCalculadora(salir);
                    break;
                case 1:
                    break;
            }
        }
    }

}
