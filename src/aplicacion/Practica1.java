package aplicacion;
import dominio.Elipse;

import javax.swing.*;

public class Practica1{
    public static void main(String[] args) {

        float radioMayor, radioMenor;
        //a) Declarar y crear un vector de 10 elipses
        Elipse [] vector = new Elipse[10];

        //B) crear la elipse de la ultima casilla con el primer constructor

        vector [9] =new Elipse();
        System.out.println(vector[9]);

        //c)casilla 4 con teclado
        for (int i = 0; i <=3 ; i++) {

                radioMayor = Float.parseFloat
                        (JOptionPane.showInputDialog(null,
                                "dame radio mayo"));
                radioMenor = Float.parseFloat
                        (JOptionPane.showInputDialog("dame radio menor"));

                vector[i] = new Elipse(radioMayor, radioMenor);

        }
        for (int i = 0; i <= 3; i++) {
            System.out.println(vector[i]);
        }
        




    }
}
