/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codor_feliz_2;
import java.io.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
/**
 *
 * @author joser
 */
public class Codo_GUI extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form Codo_GUI
     */
    //private Thread pos1;
    //private Thread pos2;
    //private Thread pos3;
    //private Thread pos4;
    //private Thread pos5;
    private Thread[] pos;
    private boolean f1, f2, f3, f4, f5;
    private long tiempoInicio;
    long tiempo1, tiempo2, tiempo3, tiempo4, tiempo5;
    Codornices c1, c2, c3, c4, c5;
    public Codo_GUI() {
        initComponents();
        pos = new Thread[5];
        f1 = false;
        f2 = false;
        f3 = false;
        f4 = false;
        f5 = false;
        tiempo1 = 0;
        tiempo2 = 0;
        tiempo3 = 0;
        tiempo4 = 0;
        tiempo5 = 0;
    }
    private String recuperar_Codo(String ID){
        File archivoCodo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try{
            archivoCodo = new File ("./src/codor_feliz_2/codornices.txt");
            fr = new FileReader (archivoCodo);
            br = new BufferedReader (fr);
            try{
                String linea;
                while ((linea = br.readLine()) != null){
                    //-
                    try{
                        if (linea.substring(0, 4).equals(ID)){
                           //Aqui
                           return linea;
                        }
                    }catch(Exception e){
                        //
                    }
                }
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
            
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        }finally{
            try{//No estamos seguros si logra abrir
                if(null != fr){
                    fr.close();
                }
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
        }
        return "Error"; //No deberia retornar esto ya que se verifica antes que el ID esté 
    }
    private void buscar_Codo(String ID) {
        File archivoCodo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try{
            archivoCodo = new File ("./src/codor_feliz_2/codornices.txt");
            fr = new FileReader (archivoCodo);
            br = new BufferedReader (fr);
            try{
                String linea;
                while ((linea = br.readLine()) != null){
                    //-
                    try{
                        if (linea.substring(0, 4).equals(ID)){
                           //Aqui
                           jTextArea1.setText("ID" + "\t" + "Nombre" + "\t" + "Edad" + "\t" + "Especie" + "\t" + "Peso (g)" + "\t" + "Nombre Dueño" + "\n" + linea);
                           break;
                        }
                    }catch(Exception e){
                        //
                    }
                }
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
            
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        }finally{
            try{//No estamos seguros si logra abrir
                if(null != fr){
                    fr.close();
                }
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
        }
    }
        private void buscar_TodoCodo() {
        File archivoCodo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String lineaTotal = "ID" + "\t" + "Nombre" + "\t" + "Edad" + "\t" + "Especie" + "\t" + "Peso (g)" + "\t" + "Nombre Dueño" + "\n";
        try{
            archivoCodo = new File ("./src/codor_feliz_2/codornices.txt");
            fr = new FileReader (archivoCodo);
            br = new BufferedReader (fr);
            try{
                String linea;
                while ((linea = br.readLine()) != null){
                    //-
                    lineaTotal = lineaTotal + linea + "\n";
                }
                jTextArea3.setText(lineaTotal);
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
            
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        }finally{
            try{//No estamos seguros si logra abrir
                if(null != fr){
                    fr.close();
                }
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
        }
    }
    private void buscar_Carrera(String ID) {
        File archivoCodo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try{
            archivoCodo = new File ("./src/codor_feliz_2/carreras.txt");
            fr = new FileReader (archivoCodo);
            br = new BufferedReader (fr);
            try{
                String linea;
                while ((linea = br.readLine()) != null){
                    //-
                    try{
                        if (linea.split("\t")[0].equals(ID)){
                           //Aqui
                           jTextArea2.setText( "IDCarrera" + "\t" + "ID_Codo1" + "\t" + "Tiempo_Codo1" + "\t" + "ID_Codo2" + "\t" + "Tiempo_Codo2" + "\t" + "ID_Codo3" + "\t" + "Tiempo_Codo3"  + "\t" + "ID_Codo4" + "\t" + "Tiempo_Codo4" + "\t" + "ID_Codo5" + "\t" + "Tiempo_Codo5"  + "\t" + "Fecha" + "\t" + "Hora" + "\n"  + linea);
                           break;
                        }
                    }catch(Exception e){
                        //
                    }
                }
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
            
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        }finally{
            try{//No estamos seguros si logra abrir
                if(null != fr){
                    fr.close();
                }
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
        }
    }
        private void buscar_TodoCarrera() {
        File archivoCodo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String lineaTotal = "IDCarrera" + "\t" + "ID_Codo1" + "\t" + "Tiempo_Codo1" + "\t" + "ID_Codo2" + "\t" + "Tiempo_Codo2" + "\t" + "ID_Codo3" + "\t" + "Tiempo_Codo3"  + "\t" + "ID_Codo4" + "\t" + "Tiempo_Codo4" + "\t" + "ID_Codo5" + "\t" + "Tiempo_Codo5"  + "\t" + "Fecha" + "\t" + "Hora" + "\n" ;
        try{
            archivoCodo = new File ("./src/codor_feliz_2/carreras.txt");
            fr = new FileReader (archivoCodo);
            br = new BufferedReader (fr);
            try{
                String linea;
                while ((linea = br.readLine()) != null){
                    //-
                    lineaTotal = lineaTotal +  linea + "\n";
                }
                jTextArea4.setText( lineaTotal);
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
            
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        }finally{
            try{//No estamos seguros si logra abrir
                if(null != fr){
                    fr.close();
                }
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
        }
    }
    private boolean revisar_txt(String ID) {
        File archivoCodo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try{
            archivoCodo = new File ("./src/codor_feliz_2/codornices.txt");
            fr = new FileReader (archivoCodo);
            br = new BufferedReader (fr);
            try{
                String linea;
                while ((linea = br.readLine()) != null){
                    //-
                    try{
                        if (linea.substring(0, 4).equals(ID)){
                           return true;
                        }
                    }catch(Exception e){
                        //
                    }
                }
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
            
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        }finally{
            try{//No estamos seguros si logra abrir
                if(null != fr){
                    fr.close();
                }
            }catch(IOException e2){
                JOptionPane.showMessageDialog(null, "¡Error!");
            }
        }
        return false;
    }
    private void escribir_txt(String nombre, int edad, String especie, float peso, String numID, String nombreDueno) {
        FileWriter fichero = null;
        BufferedWriter bw = null;
        String dato = numID + "\t" + nombre + "\t" + String.valueOf(edad) + "\t" + especie + "\t" + String.valueOf(peso) + "\t" + nombreDueno + "\n";
        try{
            fichero =  new FileWriter("./src/codor_feliz_2/codornices.txt", true);
            bw = new BufferedWriter(fichero);
            bw.write(dato);
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "¡Error!");
        }finally {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar5 = new javax.swing.JProgressBar();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Ingrese los datos");

        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel3.setText("Edad:");

        jLabel4.setText("Especie:");

        jLabel5.setText("Peso (g):");

        jLabel6.setText("ID:");

        jLabel7.setText("Dueño:");

        jTextField2.setText("0");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setText("0.0");
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField5.setToolTipText("");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel12.setText("El ID debe ser de 4 digitos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 171, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)))
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ingresar Codorniz", jPanel2);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("Buscar Información");

        jLabel9.setText("Ingrese el ID:");

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jButton2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Información Codorniz", jPanel3);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("Busqueda de Información Carrera");

        jLabel11.setText("Ingrese el ID:");

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel11)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jButton3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Información Carrera", jPanel5);

        jProgressBar1.setStringPainted(true);

        jProgressBar2.setStringPainted(true);

        jProgressBar3.setStringPainted(true);

        jProgressBar4.setStringPainted(true);

        jProgressBar5.setStringPainted(true);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Carrera de Codornices");

        jButton4.setText("Iniciar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });

        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });

        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });

        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });

        jLabel14.setText("ID1:");

        jLabel15.setText("ID2:");

        jLabel16.setText("ID3:");

        jLabel17.setText("ID4:");

        jLabel18.setText("ID5:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(254, 254, 254))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField9)
                    .addComponent(jTextField10)
                    .addComponent(jTextField11)
                    .addComponent(jTextField12)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel14)))
                                                .addGap(35, 35, 35)
                                                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel15)))
                                        .addGap(39, 39, 39)
                                        .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16)))
                                .addGap(37, 37, 37)
                                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17)))
                        .addGap(40, 40, 40)
                        .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Carrera", jPanel4);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jButton5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Codornices", jPanel6);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jButton6.setText("Actualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jButton6))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Carreras", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombre = jTextField1.getText();
        int edad = Integer.valueOf(jTextField2.getText());
        String especie = jTextField3.getText();
        float peso = Float.valueOf(jTextField4.getText());
        String numID = jTextField5.getText();
        String nombreDueno = jTextField6.getText();
        if (!(nombre.isEmpty()) && (edad > 0) && !(especie.isEmpty()) && (peso > 0) && (numID.length() == 4) && !(nombreDueno.isEmpty() )){
            //Pan con queso
            if (revisar_txt(numID)){
                JOptionPane.showMessageDialog(null, "El ID ya se encuentra registrado");
            }else{
                escribir_txt(nombre, edad, especie, peso, numID, nombreDueno);
                jTextField1.setText("");
                jTextField2.setText("0");
                jTextField3.setText("");
                jTextField4.setText("0.0");
                jTextField5.setText("");
                jTextField6.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        buscar_Codo(jTextField7.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9') &&  (caracter != '\b')){// \b es la tecla de borrar
            evt.consume();
        }
        if (jTextField5.getText().length() == 4 ){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9') &&  (caracter != '\b') ){// \b es la tecla de borrar
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        System.out.println(caracter);
        if (Character.isLetter(caracter)){// \b es la tecla de borrar
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (caracter == ' '){// \b es la tecla de borrar
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (caracter == ' '){// \b es la tecla de borrar
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (caracter == ' '){// \b es la tecla de borrar
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9') &&  (caracter != '\b')){// \b es la tecla de borrar
            evt.consume();
        }
        if (jTextField7.getText().length() == 4 ){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        if( !(jTextField9.getText().isEmpty()) && !(jTextField10.getText().isEmpty()) && !(jTextField11.getText().isEmpty()) && !(jTextField12.getText().isEmpty()) && !(jTextField9.getText().isEmpty())  && !(jTextField9.getText().equals(jTextField10.getText())) &&
                !(jTextField9.getText().equals(jTextField11.getText())) && !(jTextField9.getText().equals(jTextField12.getText()))    && !(jTextField9.getText().equals(jTextField13.getText())) && !(jTextField10.getText().equals(jTextField11.getText()))
                && !(jTextField10.getText().equals(jTextField12.getText())) && !(jTextField10.getText().equals(jTextField13.getText())) && 
                    !(jTextField11.getText().equals(jTextField12.getText()))  && !(jTextField11.getText().equals(jTextField13.getText()))   && !(jTextField12.getText().equals(jTextField13.getText()))  ){
            if (!revisar_txt(jTextField9.getText())){
                JOptionPane.showMessageDialog(null, "El primer ID no se encuentra registrado");
                jTextField9.setText(" ");
            }else{flag1 = true;}
            if (!revisar_txt(jTextField10.getText())){
                JOptionPane.showMessageDialog(null, "El segundo ID no se encuentra registrado");
                jTextField10.setText(" ");
            }else{flag2 = true;}
            if (!revisar_txt(jTextField11.getText())){
                JOptionPane.showMessageDialog(null, "El tercer ID no se encuentra registrado");
                jTextField11.setText(" ");
            }else{flag3 = true;}
            if (!revisar_txt(jTextField12.getText())){
                JOptionPane.showMessageDialog(null, "El cuarto ID no se encuentra registrado");
                jTextField12.setText(" ");
            }else{flag4 = true;}
            if (!revisar_txt(jTextField13.getText())){
                JOptionPane.showMessageDialog(null, "El quinto ID no se encuentra registrado");
                jTextField13.setText(" ");
            }else{flag5 = true;}
            if (flag1 && flag2 && flag3 && flag4 && flag5 ){
                this.jButton4.setEnabled(false);
                String[ ] carCod1, carCod2, carCod3, carCod4, carCod5;
                carCod1 = recuperar_Codo(jTextField9.getText()).split("\t");
                carCod2 = recuperar_Codo(jTextField10.getText()).split("\t");
                carCod3 = recuperar_Codo(jTextField11.getText()).split("\t");
                carCod4 = recuperar_Codo(jTextField12.getText()).split("\t");
                carCod5 = recuperar_Codo(jTextField13.getText()).split("\t");
                String [ ][ ] carCod = {carCod1, carCod2, carCod3, carCod4, carCod5};
                //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
                for (int i = 0; i < pos.length;i++){
                    Codornices c = new Codornices(carCod[i][1], Integer.valueOf(carCod[i][2]), carCod[i][3], Float.valueOf(carCod[i][4]), carCod[i][0], carCod[i][5]);
                    c.addObserver(this);
                    pos[i] = new Thread(c);
                    pos[i].start();   
                }
                tiempoInicio = System.currentTimeMillis();
                
            }
        }else {
                JOptionPane.showMessageDialog(null, "Existen ID en blanco o repetidos");
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9') &&  (caracter != '\b')){// \b es la tecla de borrar
            evt.consume();
        }
        if (jTextField9.getText().length() == 4 ){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9') &&  (caracter != '\b')){// \b es la tecla de borrar
            evt.consume();
        }
        if (jTextField10.getText().length() == 4 ){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9') &&  (caracter != '\b')){// \b es la tecla de borrar
            evt.consume();
        }
        if (jTextField11.getText().length() == 4 ){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9') &&  (caracter != '\b')){// \b es la tecla de borrar
            evt.consume();
        }
        if (jTextField12.getText().length() == 4 ){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9') &&  (caracter != '\b')){// \b es la tecla de borrar
            evt.consume();
        }
        if (jTextField13.getText().length() == 4 ){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9') &&  (caracter != '\b') ){// \b es la tecla de borrar
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        buscar_Carrera(jTextField8.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        buscar_TodoCodo();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        buscar_TodoCarrera();
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Codo_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Codo_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Codo_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Codo_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Codo_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        Codornices c = (Codornices) o;
        int porcentaje = (int) arg;
        
        String nombre = c.getNumID();
        if (jTextField9.getText().equals(nombre)){
            this.jProgressBar1.setValue(porcentaje);
        } else if (jTextField10.getText().equals(nombre)){
            this.jProgressBar2.setValue(porcentaje);
        } else if (jTextField11.getText().equals(nombre)){
            this.jProgressBar3.setValue(porcentaje);
        } else if (jTextField12.getText().equals(nombre)){
            this.jProgressBar4.setValue(porcentaje);
        } else if (jTextField13.getText().equals(nombre)){
            this.jProgressBar5.setValue(porcentaje);
        }
        //En esta seccion se detienen los hilos en orden de llegada
        if (porcentaje>=100){
            
            if (jTextField9.getText().equals(nombre)){
                tiempo1 = (System.currentTimeMillis()-tiempoInicio)/1000;
                c1 = c;
                terminarCarrera(0);
                f1 = true;
            } else if (jTextField10.getText().equals(nombre)){
                c2 = c;
                tiempo2 = (System.currentTimeMillis()-tiempoInicio)/1000;
                terminarCarrera(1);
                f2 = true;
            } else if (jTextField11.getText().equals(nombre)){
                c3 = c;
                tiempo3 = (System.currentTimeMillis()-tiempoInicio)/1000;
                terminarCarrera(2);
                f3 = true;
            } else if (jTextField12.getText().equals(nombre)){
                c4 = c;
                tiempo4 = (System.currentTimeMillis()-tiempoInicio)/1000;
                terminarCarrera(3);
                f4 = true;
            } else if (jTextField13.getText().equals(nombre)){
                c5 = c;
                tiempo5 = (System.currentTimeMillis()-tiempoInicio)/1000;
                terminarCarrera(4);
                f5 = true;
            }
        }
        
        if(f1 && f2 && f3 && f4 && f5){
                this.jButton4.setEnabled(true);
                Carreras Carrera = new Carreras(tiempo1, tiempo2, tiempo3, tiempo4, tiempo5, c1, c2, c3, c4, c5);
                f1 = false;
                f2 = false;
                f3 = false;
                f4 = false;
                f5 = false;
                tiempo1 = 0;
                tiempo2 = 0;
                tiempo3 = 0;
                tiempo4 = 0;
                tiempo5 = 0;
            }
        
    }
    private void terminarCarrera(int posicion){
        pos[posicion].interrupt();
        
    }
}
