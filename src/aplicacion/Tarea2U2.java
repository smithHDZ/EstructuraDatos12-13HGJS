
package aplicacion;

import dominio.PilaChar;
import javax.swing.*;
public class Tarea2U2 {
    public static void main(String [] a)
    {
        int opcion = 0, totalOpciones;
        String enunciado = "";
        boolean valido = true;
        PilaChar p = new PilaChar(3);

        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Leer un enunciado \n";
        menu += "2.  Salir \n";

        totalOpciones = 2;

        while(opcion != totalOpciones)
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch(opcion)
            {
                case 1:
                    enunciado = JOptionPane.showInputDialog(null, "Escribe la expresión:");

                    for(int i = 0; i < enunciado.length(); i++)
                    {
                        if(enunciado.charAt(i) == '(' || enunciado.charAt(i) == '[' || enunciado.charAt(i) == '{')
                        {
                            p.insertar(enunciado.charAt(i));
                        }

                        if(enunciado.charAt(i) == ')' || enunciado.charAt(i) == ']' || enunciado.charAt(i) == '}')
                        {
                            if(p.estaVacia() == true)
                            {
                                valido = false;
                                break;
                            }
                            else if(p.datoEnTope() == '(' || p.datoEnTope() == '[' || p.datoEnTope() == '{')
                            {
                                p.eliminar();
                            }
                        }
                    }

                    if(p.numElementos() > 0)
                    {
                        JOptionPane.showMessageDialog(null, "La expresión no es válida porque ha habido paréntesis sin cerrar");
                    }
                    else if(valido == false)
                    {
                        JOptionPane.showMessageDialog(null, "La expresión es inválida porque se han cerrado paréntesis sin abrir");
                    }
                    else if(p.numElementos() == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Expresión válida!!!");
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Adiós!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
                    break;
            }
        }
    }
}
