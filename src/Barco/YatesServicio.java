/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barco;

/**
 *
 * @author nobil
 */
public class YatesServicio extends BarcoServicio {

     Yates y = new Yates();
    double aux;

    public double info() {
       
        double aux2 = (super.informacion()*10);
       
        return aux = aux2;
    }
    public double masInfo(){
        System.out.println("Ingese la fuerza del motor ");
        y.setCv(leer.nextDouble());
        System.out.println("Ingrese la cantidad de camarotes ");
        y.setCantidadCamarotes(leer.nextDouble());
        return  (y.getCv() + y.getCantidadCamarotes());
    }
}
