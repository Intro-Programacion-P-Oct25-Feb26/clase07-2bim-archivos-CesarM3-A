/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Principal {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        boolean bandera = true;

        while (bandera) {
            cadenaFinal = "";
            System.out.println("Ingrese su nombre:");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula:");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese su marca de carro:");
            String marca = entrada.nextLine();
            System.out.println("Ingrese su placa:");
            String placa = entrada.nextLine();
            System.out.println("¿Quiere agregar más clientes (Si/No)?");
            String valor = entrada.nextLine();
            cadenaFinal = String.format("%s%s %s %s %s\n", cadenaFinal,
                    nombre,
                    cedula, marca, placa);
            if (valor.equals("No")) {
                System.out.println("\n\nYa no se ingresaran más pacientes");
                bandera = false;
            } else {
                bandera = true;
            }
            escritura04.Procesos.agregarRegistros(cadenaFinal, placa);
        }

    }
}
