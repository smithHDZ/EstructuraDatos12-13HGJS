package aplicacion;

import dominio.Automovil;
import dominio.ColaCircularAutos;

import javax.swing.*;

public class U3Practica3 {
    public static void main(String[] args) {
        ColaCircularAutos autolavado = new ColaCircularAutos(7);
        String placa, propietario;
        int dinero = 500, totalAutos = 0;

        int opcion = 0, totalOpciones;

        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Entrada de un auto \n";
        menu += "2.  Lavar el siguiente auto \n";
        menu += "3.  Nostrar lista de automoviles \n";
        menu += "4.  Reporte financiero \n";
        menu += "5.  Salir \n";

        totalOpciones = 5;

        while(opcion != totalOpciones)
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch(opcion)
            {
                case 1:
                    if(autolavado.estaLlena())
                    {
                        JOptionPane.showMessageDialog(null,
                                "LO SENTIMOS, EL AUTOLAVADO ESTÁ LLENO\n"
                                        + "Y POR EL MOMENTO NO PODEMOS ATENDERLO");
                    }
                    else
                    {
                        placa = JOptionPane.showInputDialog("Ingresa la placa del auto");
                        propietario = JOptionPane.showInputDialog("Ingresa la placa del auto");

                        autolavado.insertar(new Automovil(placa, propietario));
                    }
                    break;

                case 2:
                    if(autolavado.estaVacia())
                    {
                        JOptionPane.showMessageDialog(null,
                                "LO SENTIMOS, EL AUTOLAVADO ESTÁ VACÍO\n" +
                                        "Y POR EL MOMENTO NO HAY NADA PARA LAVAR");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,
                                "El siguiente auto está listo para salir: " + autolavado.eliminar());
                        dinero += 87;
                        totalAutos++;
                    }
                    break;

                case 3:
                    if(autolavado.estaVacia())
                    {
                        JOptionPane.showMessageDialog(null, "EL AUTOLAVADO ESTÁ VACÍO");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "LISTA DE AUTOS: \n" +
                                autolavado.toString());
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Dinero en la caja: " +
                            dinero + "\nTotal de autos lavados: " + totalAutos);
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Adiós!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa una opcion válida");
                    break;
            }
        }
    }
}
