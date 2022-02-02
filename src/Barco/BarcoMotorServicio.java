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
public class BarcoMotorServicio extends BarcoServicio {

    BarcoAMotor bar = new BarcoAMotor();
    double aux;

    public double info() {
         double aux2 = (super.informacion()*10);
         return aux = aux2;
    }
    public double masInfo(){
        System.out.println("Ingrese la fuerza del motor  de tu barco a motor ");
        bar.setCv(leer.nextDouble());
        return bar.getCv();
    }
}
