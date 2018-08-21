/*
Utilizacion tipo de datos enum, Pildoras Informaticas.
cuando se necesita que una variable no pueda tomar mas de un cierto grupo de valores
x ejem restringir los valores que pueda tomar un string.

enum no puede declararse dentro de main
los tipos enum no admiten la creacion de objetos, no se puede invocar a un constructor
por eso se pone el "constructor" privado

 * @author aldemaro
 */

import java.util.*;
//import javax.swing.*;
public class Main {

    enum Talla {
      MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
        
        private Talla(String abreviatura){
            this.abreviatura = abreviatura;
        }
        
        public String dameAbreviatura(){
            return abreviatura;
        }
        private String abreviatura;
    };
    
    public static void main(String[] args) {
        
        String entradaDatos;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una talla");
        System.out.println("MINI,MEDIANO,GRANDE,MUY_GRANDE");
        entradaDatos = entrada.nextLine().toUpperCase();
                                      //tipo de clase;
        Talla la_talla = Enum.valueOf(Talla.class, entradaDatos);
        
        System.out.println("Talla: "+la_talla);
        System.out.println("Abreviatura: "+la_talla.dameAbreviatura());
    }
    
}
