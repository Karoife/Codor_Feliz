/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codor_feliz_2;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase describe lo que se precisa para generar la clase de codorniz además hereda que es observable para poder correrlo en hilos
 * @author joser
 */
//El uso de hilos está basado en este video https://www.youtube.com/watch?v=I2W7NKs6oAM&t=1s&ab_channel=DiscoDurodeRoer
public class Codornices extends Observable implements Runnable {
    private String nombre;
    private int edad;
    private String especie;
    private float peso;
    private String numID;
    private String nombreDueno;
    //Constructor de la clase
    public Codornices(String nombre, int edad, String especie, float peso, String numID, String nombreDueno){
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.peso = peso;
        this.numID = numID;
        this.nombreDueno = nombreDueno; 
    }
    
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    //Variables de la clase codorniz
    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }
//Necesatrio ciuandop es observable, el porcentaje representa que tanto ha copmpletado de la carrera
    @Override
    public void run() {
        int porcentaje = 0;
        int numA;
        try{
            while (porcentaje < 100){
                numA = numAleatorio(1,15); //+ edad*10;//* (int) (93.56/peso) - edad/2;
                porcentaje += numA;
                this.setChanged();
                this.notifyObservers(porcentaje);
                this.clearChanged();
                Thread.sleep(1000);
            }
        }catch (InterruptedException ex) {
                //Logger.getLogger(Codornices.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        
    }
    public static int numAleatorio(int min, int max){
        int nume = (int) Math.floor(Math.random() * (max-min+1) +min);
        return nume;
    }
    
}
