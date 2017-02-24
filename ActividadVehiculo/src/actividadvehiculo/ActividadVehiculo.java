/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadvehiculo;

import Vehiculo.Vehiculo;

/**
 *
 * @author Luisa Maria Perilla C. - 1088034091
 */
public class ActividadVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo kia = new Vehiculo();
        kia.setPlaca("BOL 118");
        kia.setModelo("Picanto LX");
        kia.setNumeroSoat("2211LpJb");
        kia.setColor("Gris Plata");
        System.out.println("              Bienvenido!!");
        System.out.println(" Placa del Vehiculo: " + kia.getPlaca() + 
                           "\n Modelo del Vehiculo: " + kia.getModelo() + 
                           "\n Numero del Soat: " + kia.getNumeroSoat() +
                           "\n Color del Vehiculo: " + kia.getColor());
        
    }
    
    
}
