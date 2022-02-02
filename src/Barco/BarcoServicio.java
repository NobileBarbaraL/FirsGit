/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barco;

import java.util.Scanner;

/**
 *
 * @author nobil
 */
public class BarcoServicio extends Barco {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public double informacion() {
        Barco b = new Barco();
        System.out.println("Ingrese el número de la matricula de su barco ");
        b.setMatricula(leer.nextDouble());
        System.out.println("Ingrese el numero de eslora de su barco ");
        b.setEslora(leer.nextDouble());
        System.out.println("Ingrese el año de fabricación de su barco ");
        b.setAnioDeFabricacion(leer.nextDouble());
        return b.getEslora();
    }

}
