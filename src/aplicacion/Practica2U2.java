package aplicacion;

import javax.swing.*;
import dominio.PilaFacturas;
import dominio.Factura;

public class Practica2U2 {

    public static void main(String[] args) {

            // DECLARACION DE VARIABLES
            PilaFacturas pilaF = new PilaFacturas();
            int opcion, totalOpciones, numero, i;
            String cliente;
            float saldo;

            // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
            String menu = "             MENU DE OPCIONES \n";
            menu += "1.  Capturar una factura \n";
            menu += "2.  Mostrar facturas \n";
            menu += "3.  Eliminar una factura \n";
            menu += "4.  Total de saldos de facturas \n";
            menu += "5.  Factura con el saldo mayor \n";
            menu += "6.  Buscar un cliente \n";
            menu += "7.  vaciar pila \n";
            menu += "8.  Salir \n";

            totalOpciones = 8;

            do {
                opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));

                switch (opcion){
                    case 1: //capturar del teclado los datos necesarios para crear la factura
                        if(pilaF.estaLlena()){
                            JOptionPane.showMessageDialog(null,
                                    "No se puede capturar los datos");
                        }else{
                            numero = Integer.parseInt(JOptionPane.showInputDialog
                                    (null, "Número de cliente: "));
                            cliente = JOptionPane.showInputDialog
                                    (null, "Nombre del cliente: ");
                            saldo = Float.parseFloat(JOptionPane.showInputDialog
                                    (null, "Saldo: "));
                            pilaF.insertar(new Factura(numero, cliente, saldo));
                        }
                        break;
                    case 2: 
                    //desplegar el contenido que se encuentran
                    // en la pila, así como la cantidad de facturas
                        JOptionPane.showMessageDialog
                                (null, pilaF.toString() + pilaF.numElementos());
                        break;
                    case 3: 
                    //eliminar la factura correspondiente y
                    // desplegar sus datos en pantalla, si esta vacía, se despliega un mensaje indicando
                    //que no se pudo eliminar ninguna factura
                        if(pilaF.estaVacia()){
                            JOptionPane.showMessageDialog(null,
                                    "No se puede eliminar ninguna factura");
                        }else{
                            JOptionPane.showMessageDialog(null,
                                    "Dato eliminado: " + pilaF.eliminar());
                        }
                        break;
                    case 4: 
                    //Se suman los saldos de todas las facturas y se despliega esta suma en pantalla
                        if (pilaF.estaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "No hay saldo");
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "la suma de las facturas es: \n" + pilaF.sumaSaldos());
                        }
                            break;

                    case 5:
                        //Factura con el saldo mayor
                        if (pilaF.estaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "No hay facturas");
                        }else {
                            JOptionPane.showMessageDialog(null,
                                    "la factura mayor es :\n" + pilaF.facturaMayor());
                        }
                        break;

                    case 6:
                        if (pilaF.estaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "No hay clientes");
                        }else {
                            String buscarCliente;
                            buscarCliente = JOptionPane.showInputDialog(null,
                                    "¿Cual cliente esta buscando?");
                            if (pilaF.buscarCliente(buscarCliente) == "") {
                                JOptionPane.showMessageDialog(null,
                                         "no se encontro ningun cliente");
                                }else{
                                    JOptionPane.showMessageDialog(null,
                                            "el cliente \n" + pilaF.buscarCliente(buscarCliente));
                                }
                            }

                        break;
                    case 8:
                        JOptionPane.showMessageDialog (null, "Fin del Programa");
                        break;
                    default:
                        JOptionPane.showMessageDialog (null, "Opción NO válida");
                        break;
                }  //  FIN DEL SWITCH

            } while (opcion != totalOpciones);   // FIN DEL DO..WHILE


        }  // FIN DEL METODO main

    }  // FIN DE LA CLASE
