/*
Potencia en CV para barcos a motor.
 */
package Barco;



/**
 * public void info(){ super.informacion();
 *
 * @author nobil
 */
public class BarcoAMotor extends Barco {

    private Double cv;

    public BarcoAMotor() {
        super();
    }

    public BarcoAMotor(Double cv) {
        super();
        this.cv = cv;
    }

    public Double getCv() {
        return cv;
    }

    public void setCv(Double cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" + "cv=" + cv + super.toString() + '}';
    }

}
