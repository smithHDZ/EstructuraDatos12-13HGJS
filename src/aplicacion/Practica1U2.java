package aplicacion;

import dominio.PilaString;

import javax.swing.*;

public class Practica1U2 {
    public static void main(String[] args) {
        PilaString nombresNZ = new PilaString(7);
        PilaString nombresAM = new PilaString(7);
        int opcion = 0, totalOpciones = 6;
        String captura;
        char s;

        String menu = "             OPERACIONES EN LA PILA \n";
        menu += "1.  Capturar un nombre \n";
        menu += "2.  Mostrar nombres de la A a la M \n";
        menu += "3.  Mostrar nombres de la N a la Z \n";
        menu += "4.  Eliminar un nombre de A a M \n";
        menu += "5.  Eliminar un nombre de N a Z \n";
        menu += "6.  Salir \n";

        while(opcion != totalOpciones)
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch(opcion)
            {
                case 1:

                    captura = JOptionPane.showInputDialog("Introduce el nombre que vayas a insertar");
                    s = captura.toUpperCase().charAt(0);

                    if(nombresAM.estaLlena())
                    {
                        JOptionPane.showMessageDialog(null,
                                "Ya no puedes insertar nombres de la A a la M");
                    }
                    else
                    {
                        if(s >= 'A' && s <= 'M')
                        {
                            nombresAM.insertar(captura);
                        }

                    }

                    if(nombresNZ.estaLlena())
                    {
                        JOptionPane.showMessageDialog(null,
                                "Ya no puedes insertar nombres de la N a la Z");
                    }
                    else
                    {
                        if(s >= 'N' && s <= 'Z')
                        {
                            nombresNZ.insertar(captura);
                        }
                    }
                    break;

                case 2:

                    if(nombresAM.estaVacia())
                    {
                        JOptionPane.showMessageDialog(null,
                                "Esta pila está vacía, no hay nada que mostrar");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, nombresAM.toString());
                    }
                    break;

                case 3:

                    if(nombresNZ.estaVacia())
                    {
                        JOptionPane.showMessageDialog(null,
                                "Esta pila está vacía, no hay nada que mostrar");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, nombresNZ.toString());
                    }
                    break;

                case 4:

                    if(nombresAM.estaVacia())
                    {
                        JOptionPane.showMessageDialog(null,
                                "Esta pila está vacía, no hay nada que eliminar");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, nombresAM.eliminar());
                    }
                    break;

                case 5:

                    if(nombresNZ.estaVacia())
                    {
                        JOptionPane.showMessageDialog(null,
                                "Esta pila está vacía, no hay nada que eliminar");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, nombresNZ.eliminar());
                    }
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Adiós!");
                    break;

                default:
                    break;
            }
        }
    }

}
