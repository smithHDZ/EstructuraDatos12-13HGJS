package aplicacion;
import dominio.Producto;
import javax.swing.*;
import java.util.Random;

//La aplicacion es un examen de la capturacion de un producto 
//y  se dara un menu para moestrar los datos de producto 
// busca producto, baja el precio de los productos y maneja una matriz
public class Examen_U1 {
    public static void main(String[] args) {
        Producto articulo [];
        articulo= new Producto[15];
        String nombre , s;
        int clave;
        float precio;
        int cont=-1;
        // DECLARACION DE VARIABLES
        int opcion, num, totalOpciones;

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Captura de unproducto \n";
        menu += "2.  mostrar datos de un producto \n";
        menu += "3.  Buscar un producto \n";
        menu += "4.  bajar precios 5% \n";
        menu += "5.  Manejar una matriz \n";
        menu += "6.  salir";

        totalOpciones = 6;  // ACTUALIZAR SIEMPRE ESTA VARIABLE PARA AJUSTARSE AL TOTAL DE OPCIONES

        // CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO SELECCIONE LA OPCION Salir
        do {
            // SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION) SEGUN EL MENU PRESENTADO
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    //En esta opción se va a capturar SOLAMENTE UN PRODUCTO. Se capturan los datos
                    //necesarios (nombre, clave y precio) y
                    // cada vez que se elija esta opción, se almacenará EL
                    //PRODUCTO CAPTURADO en una posición consecutiva

                    nombre=JOptionPane.showInputDialog(null,"nombre del articulo");
                    clave= Integer.parseInt
                            (JOptionPane.showInputDialog
                                    (null, "clave del articulo"));
                    precio= Float.parseFloat(JOptionPane.showInputDialog
                            (null, "Precio del articulo"));

                    cont++;
                    articulo[cont]=new Producto(nombre,clave,precio);
                    if (cont == 14){
                        JOptionPane.showInputDialog
                                (null,
                                        "PRODUCTO NO PUEDE AGREGARSE, EL VECTOR ESTA LLENO"
                                + (cont+1));
                    }
                    break;
                case 2:
                    //Despliega en pantalla todos los datos de los productos
                    //que están actualmente en el vector, así
                    //como la posición (índice o dirección de casilla) que ocupan.
                    s="";
                    for (int i = 0; i <= cont; i++) {
                        s += "\nPreoductos  ["+ i +"]\n" + articulo[i].toString();
                        JOptionPane.showMessageDialog(null, s);
                    }
                    break;

                case 3:
                    //Se captura del teclado el nombre de un
                    //producto y se busca en el vector, para indicar si existe
                    //o no. Si se encuentra, desplegar sus datos.
                    String Barticulo;
                    Barticulo=JOptionPane.showInputDialog(null
                            ,"Cual articulo desea buscar?");
                    for (int i=0; i<= cont ; i++){
                        if (articulo[i].getNombre().equalsIgnoreCase(Barticulo)){
                            JOptionPane.showMessageDialog
                                    (null,"Articuolo :"+
                                            articulo[i].getNombre() + "\n" +
                                            "clave :" + articulo[i].getClave() + "\n" +
                                            "precio :" + articulo[i].getPrecio());
                        }else{
                            JOptionPane.showMessageDialog
                                    (null, "Lo sentimos articulo no encontrado");
                        }

                    }
                    break;
                case 4:
                    //Modificar el precio de TODOS los productos del vector,
                    // disminuyendo un 5% a su precio
                    double descuetno = 0.05;
                    for (int i = 0; i <= cont; i++) {
                    articulo[i].getPrecio();
                    descuetno*=articulo[i].getPrecio();
                    articulo[i].setPrecio((float) descuetno);
                        JOptionPane.showMessageDialog
                                (null,"Articuolo :"+
                                        articulo[i].getNombre() + "\n" +
                                        "clave : " + articulo[i].getClave() + "\n" +
                                        "precio : " + articulo[i].getPrecio());
                    }
                    break;
                case 5:
                    int m [][];
                    String cadena;
                    int numeroAleatorio = 0,
                            numero=0;
                    Random rd = new Random();
                    int numeros =0;
                    numeroAleatorio = rd.nextInt(10) + 1;
                    cadena ="";
                    m = new int[numeroAleatorio][numeroAleatorio];
                    for (int i = 0; i < m.length; i++) {
                        for (int j = 0; j < m[i].length; j++) {
                            if(m[i]==m[j]) {
                                m[i][j] += 1;
                                cadena += m[i][j] + ",";
                            }
                            m[i][j]=numeros;
                            cadena +=m[i][j] + ",";
                        }
                        cadena += "\n";
                    }
                  JOptionPane.showInputDialog(null, cadena);

                    break;
                case 6:
                    JOptionPane.showMessageDialog
                            (null, "Fin del Programa");
                    break;
                default:
                    JOptionPane.showMessageDialog
                            (null, "Opción NO válida",
                                    " ¡¡¡Error!!!", JOptionPane.ERROR_MESSAGE);
                    break;
            }  //  FIN DEL SWITCH

        } while (opcion != totalOpciones);   // FIN DEL DO..WHILE

    }
}
