
package Proyecto.Main;

import static Proyecto.Main.DibujarGrafo.ingresarNodoOrigen;
import java.awt.Color;
import static Proyecto.Main.DibujarGrafo.jPanel2;

public class Prim {
    private int cumulado;
    private int aristaMenor;
    private int fin;
    private boolean estaNodo = false;
    private boolean aumentaTamano;
    private int nodoApuntado;
    private int nodoApuntador;
    private int tamano;
    private int arsitaMayor;
    private Grafo grafo;
    private int tope;
    private int nodoOrigen;

    public Prim(Grafo grafo, int top, int aristaMayor) {
        this.cumulado = 0;
        this.aristaMenor = 0;
        this.fin = 0;
        this.estaNodo = false;
        this.aumentaTamano = false;
        this.nodoApuntado = 0;
        this.nodoApuntador = 0;
        this.tamano = 1;
        this. arsitaMayor = aristaMayor;
        this.grafo = grafo;
        this.tope = top;
    }

    public int getCumulado() {
        return cumulado;
    }
    
    
    public void prim() {
        this.nodoOrigen = ingresarNodoOrigen("Ingrese Nodo Origen..","nodo Origen No existe", tope);
        jPanel2.paint(jPanel2.getGraphics());
        grafo.crearEnGrafo(tope);
        grafo.setEnGrafo(0, nodoOrigen);
        //algoritmo de Prim ---->>
        do {
            this.aristaMenor = this.arsitaMayor;
            this.fin = 2;
            for (int j = 0; j < tamano; j++) {
                for (int k = 0; k < tope; k++) {
                    if(grafo.getmAdyacencia(k, grafo.getEnGrafo(j)) == 1){
                        for (int h = 0; h < tamano; h++) {
                            if (grafo.getEnGrafo(h) == k) {
                                this.estaNodo = true; 
                                break;
                            }
                        }
                        if (estaNodo == false) {
                            if (grafo.getmCoeficiente(k, grafo.getEnGrafo(j)) <= aristaMenor && grafo.getmCoeficiente(k, grafo.getEnGrafo(j)) > 0) {
                                aristaMenor = grafo.getmCoeficiente(k, grafo.getEnGrafo(j));
                                this.nodoApuntado = k;
                                this.aumentaTamano = true;
                                this.nodoApuntador = grafo.getEnGrafo(j);
                                this.fin = 1;
                            }
                        }
                        this.estaNodo = false;
                    }
                }
            } //fin for (int j = 0; j < tamano; j++)
            if (aumentaTamano == true) {
                Pintar.pintarCamino(jPanel2.getGraphics(),grafo.getCordeX(nodoApuntador), grafo.getCordeY(nodoApuntador),grafo.getCordeX(nodoApuntado), grafo.getCordeY(nodoApuntado),Color.red); 
                Pintar.clickSobreNodo(jPanel2.getGraphics(),grafo.getCordeX(nodoApuntador), grafo.getCordeY(nodoApuntador), null,Color. red);
                Pintar.clickSobreNodo(jPanel2.getGraphics(),grafo.getCordeX(nodoApuntado), grafo.getCordeY(nodoApuntado), null, Color.red);
                grafo.setEnGrafo(tamano, nodoApuntado);
                this.tamano++;
                this.aumentaTamano = false;
                this.cumulado += this.aristaMenor;
            }
        } while (fin < 2);
    }
}
