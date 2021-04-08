/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1clase;

import java.util.Scanner;

/**
 *
 * @author nachovelagomez
 */
public class Ejercicio1Clase {

    
    public static void main(String[] args) {
        System.out.println("¿Cómo quieres crear la cuenta");
        System.out.println("Pulsa 1 para cuenta + DNI, Pulsa 2 para cuenta con saldo, Pulsa 3 para Saldo inciaial, limite descubierto y dni");
        Scanner leer = new Scanner (System.in);
        int opcionseleccionada = leer.nextInt(); 
        //Hay que poner después de un nextInt, next double... para que me cambie de línea. 
        leer.nextLine();
       
        
        if (opcionseleccionada == 1){
            System.out.println("TU NOMBRE");
            String nombre = leer.nextLine();
            System.out.println("TU DNI");
            String DNI = leer.nextLine();
            
            CuentaCorriente cuenta = new CuentaCorriente(nombre,DNI);
            cuenta.ingresarDinero(1000);
            System.out.println(cuenta.getSaldo());
        } else if (opcionseleccionada ==2){
            
        } else if (opcionseleccionada ==3){
            
        } 
        
    }
    
}
