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
public class Velero extends Barco {

    private Double cv;
    private Double CantidadMastiles;

    public Velero() {
        super();
    }

    public Velero(Double cv, Double CantidadMastiles, Double matricula, Double eslora, Double anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.cv = cv;
        this.CantidadMastiles = CantidadMastiles;
    }

    public Double getCv() {
        return cv;
    }

    public void setCv(Double cv) {
        this.cv = cv;
    }

    public Double getCantidadMastiles() {
        return CantidadMastiles;
    }

    public void setCantidadMastiles(Double CantidadMastiles) {
        this.CantidadMastiles = CantidadMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "cv=" + cv + ", CantidadMastiles=" + CantidadMastiles + super.toString() + '}';
    }

}
