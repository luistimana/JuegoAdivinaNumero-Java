/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoadivinanumero.java;

import java.util.Scanner;

/**
 *
 * @author Luis Timana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jugar(5);
    }
    
    static void jugar(int vidas){
        int numeroRandom = (int)(Math.random()*101);
        int numeroElegido = -1;
        
        Scanner leer = new Scanner(System.in);
        
        while(numeroElegido != numeroRandom){
            System.out.print("Ingrese un numero entre 1 y 100: ");
            numeroElegido = leer.nextInt();
            
            if(numeroRandom < numeroElegido){
                System.out.println("El numero es mas pequeño");
                vidas --;
            } else if(numeroRandom > numeroElegido){
                System.out.println("El numero es mas grande");
                vidas --;
            }
            
            if(vidas == 0){
                System.out.println("----------------------------------");
                System.out.println("|   Juego terminado, perdiste.   |");
                System.out.println("----------------------------------");
            }
            
            System.out.println("----------------------------------");
            System.out.printf("|         Te quedan %d vidas       |\n", vidas);
            System.out.println("----------------------------------");
        }
        
        if(numeroElegido == numeroRandom){
            System.out.println("----------------------------------");
            System.out.println("|        Felicidades, ganaste.    |");
            System.out.println("----------------------------------");
        }
    }
    
}
