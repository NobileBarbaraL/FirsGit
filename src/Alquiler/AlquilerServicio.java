/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alquiler;

import Barco.BarcoMotorServicio;
import Barco.VeleroServicio;
import Barco.YatesServicio;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nobil
 */
public class AlquilerServicio {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alquiler a = new Alquiler();

    public void Informate() {

        System.out.println("Ingrese su nombre por favor ");
        a.setNombre(leer.next());
        System.out.println("Ingrese su dni por favor ");
        a.setDni(leer.nextLong());
        Date fechaActual = new Date();
        System.out.println(sdf.format(fechaActual));
        a.setFechaActual(fechaActual);
        System.out.println("Ingrese dia de devolucion por favor ");
        Integer dia = leer.nextInt();
        System.out.println("Ingrese el mes de la devolucion por favor ");
        Integer mes = leer.nextInt();
        System.out.println("Ingrese el año de la devolucion por favor ");
        Integer anio = leer.nextInt();
        System.out.println("Ingrese posicion de amarre por favor ");
        a.setPosicionAmarre(leer.nextInt());
        a.setFechaDevolucion(new Date(anio - 1900, mes - 1, dia));
        double aux;
        aux = (double) a.getFechaDevolucion().getTime() - (double) a.getFechaActual().getTime();
        aux = aux / 86400000;
        System.out.println("Ingrese que tipo de barco desea alquilar (barco a motor 1, yates 2, velero 3");
        Integer aux2 = leer.nextInt();
        switch (aux2) {
            case 1:
                double aux3;
                double aux4;
                BarcoMotorServicio bam = new BarcoMotorServicio();
               // System.out.println("precio a pagar del barco a motor (modulo), sin sumarlelos dias " + (aux + bam.info()));
                aux3 = bam.info();
                aux4 = bam.masInfo();
                aux = aux * (aux3 + aux4);
                System.out.println("El precio para alquilar un barco a motor es " + aux + " pesos Argentinos ");
                break;
            case 2:
                YatesServicio y = new YatesServicio();
               // System.out.println("precio a pagar del yate (modulo), sin sumarle los dias " + y.info());
                aux3 = y.info();
                aux4 = y.masInfo();
                aux = aux * ( aux3 + aux4);
                System.out.println("El precio para alquilar un yate es " + aux + " pesos Argentinos");
                break;
            case 3:
                VeleroServicio v = new VeleroServicio();
               // System.out.println("precio a pagar del velero (modulo), sin sumarle los dias " + v.info());
               aux3 = v.info();
                aux4 = v.masInfo();
                aux = aux * (aux3 + aux4);
                System.out.println("El precio para alquilar un velero es  " + aux + "pesos Argentinos");
                break;
        }

    }

//    public double calcularDias() {
//        double aux;
//        aux = (double) a.getFechaDevolucion().getTime() - (double) a.getFechaActual().getTime();
//        aux = aux / 86400000;
//        /* el divisor es la cantidad de milisegundos que hay en el dia. (1000*60*60*24)*/
//        return aux;
//    }
//
//    public void montoAlquiler(double cantidadDias) {
//        double aux;

        // aux = cantidadDias * (barc.getEslora()*10);
    }

/*Calendar calendario = new GregorianCalendar();
Integer anio = calendario.get(Calendar.YEAR);
        Integer mes = calendario.get(Calendar.MONTH)+1;
        Integer dia = calendario.get(Calendar.DATE);
        System.out.println("La fecha es " + dia + "/" + mes + "/" + anio);
 */
 /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en
CV y en los yates se suma la potencia en CV y el número de camarotes.

Utilizando la herencia de forma apropiada, deberemos programar en Java, las
clases y los métodos necesarios que permitan al usuario elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler.*/
