/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indice.de.masa.corporal;

import javax.swing.JOptionPane;

/**
 *
 * @author Armando Yañez
 */
public class IndiceDeMasaCorporal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r1=Double .parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu peso en kilogramos"));
        double r2=Double .parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu estatura en metros"));
             
        double Rf = (r1/(r2*r2));
        int c=1;
        
       if (Rf>18.5){ c++;
         if (Rf>24.9){c++;
            if (Rf>30){c++;
          }
       }
    }     
      
       switch(c){
           case 1: JOptionPane.showMessageDialog(null,"Tu indice de masa corporal es de "+Rf+" y estas desnutrido");
           break;
           
           case 2: JOptionPane.showMessageDialog(null,"Tu indice de masa corporal es de "+Rf+" y tienes un peso ideal");
           break;
           
           case 3: JOptionPane.showMessageDialog(null,"Tu indice de masa corporal es de "+Rf+" y estas por arriba del peso ideal");
           break;
           
           case 4: JOptionPane.showMessageDialog(null,"Tu indice de masa corporal es de "+Rf+" y tienes obesidad");
           break;
     
    }
  }
}