/*
Potencia en CV y número de camarotes para yates de lujo.
 */
package Barco;


/**
 *
 * @author nobil
 */
public class Yates extends Barco {

    private Double cv;
    private Double cantidadCamarotes;

    public Yates() {
        super();
    }

    public Yates(Double cv, Double cantidadCamarotes, Double matricula, Double eslora, Double anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.cv = cv;
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public Double getCv() {
        return cv;
    }

    public void setCv(Double cv) {
        this.cv = cv;
    }

    public Double getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(Double cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

   

    @Override
    public String toString() {
        return "Yates{" + "cv=" + cv + ", cantidadCamarotes=" + cantidadCamarotes + super.toString() + '}';
    }

}
