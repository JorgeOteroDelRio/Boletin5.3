/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Boletin5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String radio = JOptionPane.showInputDialog("Introduce el radio de la circunferencia:");
        Circulo circulo1 = new Circulo(Double.parseDouble(radio));
        JOptionPane.showMessageDialog(null, "El área de la circunferencia es " + circulo1.calcularArea() + "\n"
                + "La longitud es " + circulo1.calcularLongitud());
    }
    
}
