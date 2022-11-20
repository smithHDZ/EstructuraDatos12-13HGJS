package aplicacion;
//import javax.swing.JOptionPane;
import dominio.Triangulo;

public class AppTriangulo {
    public static void main(String[] args) {

        
        //declaracion de dos referencias
        Triangulo tri1 ,tri2;

        tri1= new Triangulo ( );
        tri2= new Triangulo (5.43f,3.76f, 2.34f  );
        System.out.println("primer triangulo:" + tri1 + "\n");
        System.out.println("segundo triangulo:" + tri2 + "\n");

        Triangulo tri3 =new Triangulo(23.43f);
        System.out.println("tercer triangulo:" + tri3);
        System.out.println("Area:" + tri3.calcularArea());
        System.out.println("Perimetro:" + tri3.calcularPerimetro());


    }
}
