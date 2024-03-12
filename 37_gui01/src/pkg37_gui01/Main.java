/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg37_gui01;

/**
 *
 * @author Gerardo Portillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //para poder mostrar un formulario de la clase Principal
        //necesitamos instanciarlo:
        Principal p1 = new Principal(); //construimos una nueva instancia de Principal
        //Principal es un JFrame, debemos dibujarlo en pantalla:
        p1.setVisible(true);
    }
    
}
