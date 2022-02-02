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
public class VeleroServicio extends BarcoServicio {

    Velero v = new Velero();
    double aux;
    
    public double info() {
         double aux2 = (super.informacion()*10);
        
        return aux = aux2;
    }
    public double masInfo(){
        System.out.println("Ingrese a fuerza del motor ");
        v.setCv(leer.nextDouble());
        System.out.println("Ingrese la cantidad de mastiles ");
        v.setCantidadMastiles(leer.nextDouble());
        return aux = v.getCv() + v.getCantidadMastiles();
    }
}
