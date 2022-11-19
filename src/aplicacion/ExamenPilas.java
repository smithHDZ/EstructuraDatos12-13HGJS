package aplicacion;
//e estado intennndo arreglar el de insertar por alguna razon no me deja realizar lo pricnipal
//el codigo no me marca erro al momento de compilarl o y de hehco puedes hacer las demas interaciones pero
//no permite el instar y sin eso pues no se puede mostra lo que acontese aunqeu todos los
// metodos son funcionales
// ya que ninguno de ellos tiene errores pero no puedo saber si estan bien si el metodo
// principal que es insertar no me lo acepta

import dominio.Factura;
import dominio.Materia;
import dominio.PilaMaterias;

import javax.swing.*;

public class ExamenPilas {
    public static void main(String[] args) {
        PilaMaterias materias = new PilaMaterias(10);
        String clave;
        int creditos;
        // DECLARACION DE VARIABLES
        int opcion, num, totalOpciones;

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "  **********     MENU DE OPCIONES        ********** \n";
        menu += "1.  Insertar una materia \n";
        menu += "2.  Mostrar pilas de materias \n";
        menu += "3.  Eliminar una materia \n";
        menu += "4.  Materia con mas creditos \n";
        menu += "5.  vacias pilas de materias \n";
        menu += "6.  Salir \n";

        totalOpciones = 6;

        do {
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));
            switch (opcion){
                case 1://1.  Insertar una materia
                    if(materias.estaLlena()){
                        JOptionPane.showMessageDialog(null,
                                "No se puede capturar los datos la pila esta llena");
                    }else{
                        clave = JOptionPane.showInputDialog
                                (null, "materia a capturar ");
                        creditos = Integer.parseInt(JOptionPane.showInputDialog
                                (null,
                                        "cual es el valor que tiene en creditos"));
                        materias.insertar(new Materia(clave, creditos ));
                    }
                    break;
                case 2: //Mostrar pilas de materias
                    JOptionPane.showMessageDialog
                            (null, materias.toString() +
                                    materias.numElementos());
                    break;
                case 3://Eliminar una materia
                    if(materias.estaVacia()){
                        JOptionPane.showMessageDialog(null,
                                "No se puede eliminar ninguna materia ya que no hay");
                    }else{
                        JOptionPane.showMessageDialog(null,
                                "Dato eliminado: " + materias.eliminar());
                    }
                    break;
                case 4://Materia con mas creditos
                    if (materias.estaVacia()) {
                        JOptionPane.showMessageDialog(null,
                                "No hay materias");
                    }else {
                        JOptionPane.showMessageDialog(null,
                                "la materia con mayor creditos es :\n"
                                        + materias.materiaMasCreditos());
                    }
                    break;

                case 5:
                    if (materias.estaVacia()) {
                        JOptionPane.showMessageDialog(null,
                                "No hay materias");
                    }else {
                        JOptionPane.showMessageDialog(null,
                                "\n" + materias.vaciarPila() + "pila vaciada");
                    }
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
