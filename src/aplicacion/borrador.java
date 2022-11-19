package aplicacion;
import javax.swing.*;
import java.util.Random;
public class borrador
{
    public static void main(String[] args) {
        do {
            int numeroAleatorio = 0,
                    numero = 0;
            Random rd = new Random();
            numeroAleatorio = rd.nextInt(10) + 1;
            JOptionPane.showMessageDialog(null, numeroAleatorio);
        }while (true);
    }
}
