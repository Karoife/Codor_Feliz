/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codor_feliz_2;

import java.io.*;
import java.util.Date;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author joser
 */
public class Carreras {
    //private int CarreraID;
    private Date fechaHora;
    //Las 5 codornices que compiten, hacerlo así trae el problema que si son menos de 5, pero se parte por el hecho que siempre compiten 5 codornices
    //private Codornices codo1;
    //private Codornices codo2;
    //private Codornices codo3;
    //private Codornices codo4;
    //private Codornices codo5;
    
    //El tiempo lo estoy pensando en seguntos
    private long tiempo1;
    private long tiempo2;
    private long tiempo3;
    private long tiempo4;
    private long tiempo5;
    
    public Carreras(long tiempo1, long tiempo2, long tiempo3, long tiempo4, long tiempo5, Codornices codo1, Codornices codo2, Codornices codo3, Codornices codo4, Codornices codo5){
        this.tiempo1 = tiempo1;
        this.tiempo2 = tiempo2;
        this.tiempo3 = tiempo3;
        this.tiempo4 = tiempo4;
        this.tiempo5 = tiempo5;
        //Uso de colecciones
        Map <String, Codornices> codosCarrera = new HashMap <String, Codornices>();
        codosCarrera.put("Codorniz1", codo1);
        codosCarrera.put("Codorniz2", codo2);
        codosCarrera.put("Codorniz3", codo3);
        codosCarrera.put("Codorniz4", codo4);
        codosCarrera.put("Codorniz5", codo5);

        this.fechaHora = new Date();

        String dato = getID() + "\t" + codosCarrera.get("Codorniz1").getNumID() + "\t" + String.valueOf(tiempo1) + "\t" + codosCarrera.get("Codorniz2").getNumID() + "\t" + String.valueOf(tiempo2) + "\t" + codosCarrera.get("Codorniz3").getNumID() + "\t" + String.valueOf(tiempo3)  + "\t" + codosCarrera.get("Codorniz4").getNumID() + "\t" + String.valueOf(tiempo4) + "\t" + codosCarrera.get("Codorniz5").getNumID() + "\t" + String.valueOf(tiempo5) + "\t" + fechaHora.getDate()+ "\\" + fechaHora.getMonth() + "\\"+ fechaHora.getYear() + "\t" + fechaHora.getHours() + ":" + fechaHora.getMinutes() +"\n" ;
        
        EscribirCarrera(dato);
    }
    //Escribe el dato en el txt
    private void EscribirCarrera(String dato){
        FileWriter fichero = null;
        BufferedWriter bw = null;
        try{
            fichero = new FileWriter("./src/codor_feliz_2/carreras.txt", true);
            bw = new BufferedWriter(fichero);
            bw.write(dato);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "¡Error!");
        }finally{
            try{
                if (bw != null){
                    bw.close();
                }
                if (fichero != null){
                    fichero.close();
                }
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
        }
    }
    //Busca erl ultimo ID y agrega el consegutivo
    private String getID(){
        File archivoCarr = null;
        FileReader fr = null;
        BufferedReader br = null;
        String linea;
        String numero = "1";
        try{
            archivoCarr = new File ("./src/codor_feliz_2/carreras.txt");
            fr = new FileReader (archivoCarr);
            br = new BufferedReader (fr);
            try{
                while ((linea = br.readLine()) != null){
                    //
                    try{
                        numero = String.valueOf(Integer.valueOf(linea.split("\t")[0])+1);
                    }catch (Exception a){
                        //
                    }
                    
                }
                
            }catch(IOException e2){
            }
        
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        }
        
        return numero;
    }
    
}
