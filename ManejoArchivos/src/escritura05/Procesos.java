/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

/**
 *
 * @author ASUS
 */
public class Procesos {

    public static void agregarRegistros(String valor, String placa) {
        try {
            String letra = placa.substring(0, 1);
            if (letra.equals("L")) {
                FileOutputStream fos = new FileOutputStream("data/L.txt", true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);
                salida.format("%s", valor);
                salida.close();
            } else if (letra.equals("G")) {
                FileOutputStream fos = new FileOutputStream("data/G.txt", true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);

                salida.format("%s", valor);
                salida.close();
            } else if (placa.equals("P")) {
                FileOutputStream fos = new FileOutputStream("data/P.txt", true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);

                salida.format("%s", valor);
                salida.close();
            } else {
                FileOutputStream fos = new FileOutputStream("data/Variadas.txt", true); // true = append
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);

                salida.format("%s", valor);
                salida.close();
            }

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    }
}
