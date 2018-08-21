/*
Utilizacion tipo de datos enum, Pildoras Informaticas.
cuando se necesita que una variable no pueda tomar mas de un cierto grupo de valores
x ejem restringir los valores que pueda tomar un string.

enum no puede declararse dentro de main

 * @author aldemaro
 */

import javax.swing.*;
public class Main {

    enum Talla {
        pequeño,mediano,grande,muy_grade
    };
    public static void main(String[] args) {
      Talla s = Talla.pequeño;
      Talla m = Talla.mediano;
      Talla l = Talla.grande;
      Talla xl = Talla.muy_grade;
      
      String x = JOptionPane.showInputDialog("Ingresa la talla");
      if(s.toString().equalsIgnoreCase(x))
            System.out.println("Talla correcta");
      else
            System.out.println("Talla incorrecta");
          
    }
    
}
