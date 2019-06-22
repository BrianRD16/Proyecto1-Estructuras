package Proyecto.Main;

import Proyecto.Errores.errorCiudad;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.DefaultListModel;

public class Interfaz extends javax.swing.JFrame {

    public DefaultListModel list = new DefaultListModel();
    public String ruta = "src/Proyecto/Repositorio/ciudades.txt";
    public File archivo = new File(ruta);
    public FileWriter fichero = null;
    public PrintWriter pw = null;
    public FileReader fr = null;
    public BufferedReader br = null;
    
    public Interfaz() {
        initComponents();
        listaCiudades.setModel(list);
        this.setExtendedState(MAXIMIZED_BOTH);
        try{
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine())!= null) {
                list.addElement(linea);
                listaCiudadesEliminar.addItem(linea);
            }
            fr.close();
        }catch(Exception e){
             e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        agregarCiudadTexto = new javax.swing.JTextField();
        agregarCiudadBoton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        listaCiudadesEliminar = new javax.swing.JComboBox<>();
        EliminarCiudadBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCiudades = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(250, 250));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(850, 500));
        setResizable(false);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Mejor Camino para las Hormigas");
        titulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        titulo.setMaximumSize(new java.awt.Dimension(200, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Agregar Ciudad");

        agregarCiudadTexto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        agregarCiudadBoton.setText("Agregar");
        agregarCiudadBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCiudadBotonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Eliminar Ciudad");

        EliminarCiudadBoton.setText("Eliminar");
        EliminarCiudadBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarCiudadBotonActionPerformed(evt);
            }
        });

        listaCiudades.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        listaCiudades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaCiudades.setRequestFocusEnabled(false);
        listaCiudades.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(listaCiudades);

        jButton2.setText("Dibujar Grafo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(listaCiudadesEliminar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(agregarCiudadTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EliminarCiudadBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarCiudadBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(agregarCiudadTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarCiudadBoton))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listaCiudadesEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(EliminarCiudadBoton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agregarCiudadBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCiudadBotonActionPerformed
        if(agregarCiudadTexto.getText().equals("")){
            errorCiudad err = new errorCiudad();
            err.setVisible(true);
        }else{
            String a = agregarCiudadTexto.getText();
            list.addElement(a);
            listaCiudadesEliminar.addItem(a);
            agregarCiudadTexto.setText("");
            try
            {
                fichero = new FileWriter(ruta, true);
                pw = new PrintWriter(fichero);
                pw.println(a);
                fichero.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            this.paint(this.getGraphics());
        }
        
        
    }//GEN-LAST:event_agregarCiudadBotonActionPerformed

    private void EliminarCiudadBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarCiudadBotonActionPerformed
        eliminarCiudad(archivo, listaCiudadesEliminar.getSelectedItem().toString());
        list.removeElement(listaCiudadesEliminar.getSelectedItem());
        listaCiudadesEliminar.removeItem(listaCiudadesEliminar.getSelectedItem());
        this.paint(this.getGraphics());
    }//GEN-LAST:event_EliminarCiudadBotonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new DibujarGrafo().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void eliminarCiudad(File file, String ciudad){
        String aux = "src/Proyecto/Repositorio/auxiliar.txt";
        File auxF = new File(aux);
        
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            fichero = new FileWriter(aux, true);
            pw = new PrintWriter(fichero);
            String linea;
            
            while ((linea = br.readLine())!= null) {
                if(linea.equals(ciudad)){
                    continue;
                }else{
                    pw.println(linea);
                }
            }
            fichero.close();
            fr.close();
            
            fichero = new FileWriter(file);
            pw = new PrintWriter(fichero);
            fr = new FileReader(aux);
            br = new BufferedReader(fr);
            
            while ((linea = br.readLine())!= null) {
                pw.println(linea);
            }
            fr.close();
            fichero.close();
            
            fichero = new FileWriter(aux);
            pw = new PrintWriter(fichero);
            fichero.close();
        }catch(Exception e){
             e.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarCiudadBoton;
    private javax.swing.JButton agregarCiudadBoton;
    private javax.swing.JTextField agregarCiudadTexto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaCiudades;
    private javax.swing.JComboBox<String> listaCiudadesEliminar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
