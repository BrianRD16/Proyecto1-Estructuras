
package Proyecto.Main;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class DibujarGrafo extends javax.swing.JFrame {

    Pintar pintar = new Pintar();
    Grafo grafo = new Grafo();
    
    public static void R_repaint(int tope, Grafo grafo) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (grafo.getmAdyacencia(j, k) == 1)
                    Pintar.pintarLinea(jPanel2.getGraphics(),grafo.getCordeX(j),grafo.getCordeY(j), grafo.getCordeX(k), grafo.getCordeY(k),grafo.getmCoeficiente(j, k));
            }
        }
        for (int j = 0; j < tope; j++) 
            Pintar.pintarCirculo(jPanel2.getGraphics(), grafo.getCordeX(j),grafo.getCordeY(j),String.valueOf(grafo.getNombre(j)));
    }
 
    public static int ingresarNodoOrigen(String nodoOrige, String noExiste,int tope) {
        int nodoOrigen = 0;
            try {
                nodoOrigen = Integer.parseInt(JOptionPane.showInputDialog("" + nodoOrige));
                if (nodoOrigen >= tope) {
                    JOptionPane.showMessageDialog(null, "" + noExiste + "\nDebe de ingresar un Nodo existente");
                    nodoOrigen = ingresarNodoOrigen(nodoOrige, noExiste, tope);
                }
            } catch(Exception ex) {
                nodoOrigen = ingresarNodoOrigen(nodoOrige, noExiste, tope);
            }
            return nodoOrigen;
    }
    
    public int ingresarTamano(String tama){
            int tamano = 0;
            try {
                tamano = Integer.parseInt(JOptionPane.showInputDialog("" + tama));
                if(tamano < 1) {
                    JOptionPane.showMessageDialog(null,"Debe Ingresar un Tamaño Aceptado..");
                    tamano = ingresarTamano(tama);
                }
            } catch(Exception ex){
                tamano = ingresarTamano(tama);
            }
            return tamano;
        }

    public boolean cicDerechoSobreNodo(int xxx,int yyy){ 
        for (int j = 0; j < tope; j++) {// consultamos si se ha sado click sobre algun nodo 
            if ((xxx + 2) > grafo.getCordeX(j) && xxx < (grafo.getCordeX(j) + 13) && (yyy + 2) > grafo.getCordeY(j) && yyy<(grafo.getCordeY(j) + 13)) {
                if (n == 0) {
                    id = j;
                    Pintar.clickSobreNodo(jPanel2.getGraphics(), grafo.getCordeX(j), grafo.getCordeY(j), null,Color.orange);
                    n++;                   
                } else {
                    id2 = j;
                    n++;
                    Pintar.clickSobreNodo(jPanel2.getGraphics(), grafo.getCordeX(j), grafo.getCordeY(j), null,Color.orange);
                    if (id == id2) { // si id == id2 por q se volvio a dar click sobre el mismos nodo, se cancela el click anterio
                        n = 0;
                        Pintar.pintarCirculo(jPanel2.getGraphics(), grafo.getCordeX(id), grafo.getCordeY(id), String.valueOf(grafo.getNombre(id)));
                        id = -1;
                        id2 = -1;
                    }
                }
                nn = 0;
                return true;              
            }
        }
        return false;
    }
    
    public void clicIzqSobreNodo(int xxx, int yyy) {
        for (int j = 0; j < tope; j++) {
            if ((xxx+2) > grafo.getCordeX(j) && xxx < (grafo.getCordeX(j)+13) && (yyy+2) > grafo.getCordeY(j) && yyy < (grafo.getCordeY(j)+13)) {
                if (nn == 0) {
                permanente = j; 
                }
                else {nodoFin = j;}
                nn++;
                n = 0;
                id = -1;
                Pintar.clickSobreNodo(jPanel2.getGraphics(), grafo.getCordeX(j), grafo.getCordeY(j), null, Color.GREEN);  
                break;
            }
        }
    }
    
    public void adactarImagen(File file) {
        try {
            BufferedImage read = ImageIO.read(file);
            Image scaledInstance = read.getScaledInstance(jmapa.getWidth(), jmapa.getHeight(), Image.SCALE_DEFAULT);
        jmapa.setIcon(new ImageIcon(scaledInstance));  
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la imagen");
        }
    }
    
    public DibujarGrafo() { 
        initComponents();  
        jDialog1.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jmapa = new javax.swing.JLabel();

        jDialog1.setMinimumSize(new java.awt.Dimension(700, 450));
        jDialog1.setResizable(false);
        jDialog1.getContentPane().setLayout(null);

        jFileChooser2.setMaximumSize(new java.awt.Dimension(21475, 21474));
        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jFileChooser2);
        jFileChooser2.setBounds(10, 20, 670, 390);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":::::::::Grafos::::::::::");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(141, 141, 141));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));
        jPanel2.setMinimumSize(new java.awt.Dimension(770, 522));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel2KeyReleased(evt);
            }
        });
        jPanel2.setLayout(null);
        jPanel2.add(jmapa);
        jmapa.setBounds(10, 10, 440, 290);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 10, 460, 310);

        setSize(new java.awt.Dimension(497, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        int xxx, yyy;
        xxx = evt.getX();
        yyy = evt.getY();
        if (evt.isMetaDown()) {
            clicIzqSobreNodo(xxx, yyy);
            if (nn == 2) {
                nn = 0;
                Dijkstra dijkstra = new Dijkstra(grafo, tope, permanente, nodoFin);
                dijkstra.dijkstra();
            }
        }
        else {
            if (!cicDerechoSobreNodo(xxx,yyy)) { // si clik sobre nodo es falso entra
                if (tope < 50) {
                    grafo.setCordeX(tope, xxx);
                    grafo.setCordeY(tope, yyy);
                    grafo.setNombre(tope, tope);
                    Pintar.pintarCirculo(jPanel2.getGraphics(), grafo.getCordeX(tope), grafo.getCordeY(tope),String.valueOf(grafo.getNombre(tope)));
                tope++;          
                } 
                else JOptionPane.showMessageDialog(null,"Se ha llegado al Maximo de nodos..");
            }
            if (n == 2) {
                n = 0; 
                int ta = ingresarTamano("Ingrese Tamaño");
                if(aristaMayor < ta) aristaMayor = ta;
                grafo.setmAdyacencia(id2, id, 1);
                grafo.setmAdyacencia(id, id2, 1);
                grafo.setmCoeficiente(id2, id, ta);
                grafo.setmCoeficiente(id, id2, ta);
                Pintar.pintarLinea(jPanel2.getGraphics(),grafo.getCordeX(id), grafo.getCordeY(id), grafo.getCordeX(id2), grafo.getCordeY(id2), ta);
                Pintar.pintarCirculo(jPanel2.getGraphics(),grafo.getCordeX(id), grafo.getCordeY(id),String.valueOf(grafo.getNombre(id)));
                Pintar.pintarCirculo(jPanel2.getGraphics(),grafo.getCordeX(id2), grafo.getCordeY(id2),String.valueOf(grafo.getNombre(id2)));
                id = -1;
                id2 = -1;
            }
        }
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
     // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2KeyPressed

    private void jPanel2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyReleased
     
    }//GEN-LAST:event_jPanel2KeyReleased

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
       // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseMoved

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed
        JFileChooser selectorArchios = (JFileChooser) evt.getSource();
        String comando = evt.getActionCommand();
        if (comando.equals(JFileChooser.APPROVE_SELECTION)) {
            File archiSeleccionado = selectorArchios.getSelectedFile();
            adactarImagen(archiSeleccionado);
            jDialog1.setVisible(false);
            //JOptionPane.showMessageDialog(null, ""+archiSeleccionado+"  nOMBRE"+archiSeleccionado.getName());
        } // TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser2ActionPerformed

    public static void main(String args[]) {        
        
    }
    private int tope = 0; // lleva el # de nodos creado
    private int nodoFin;
    private int permanente;
    int n = 0, nn = 0, id, id2; // permite controlar que se halla dado click sobre un nodo
    private int aristaMayor;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser2;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jmapa;
    // End of variables declaration//GEN-END:variables
}
