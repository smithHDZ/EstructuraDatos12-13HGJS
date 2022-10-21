package aplicacion;
import java.util.Arrays;

public class VectoresExplicacion {
    public static void main(String[] args) {
        int i, v1[], v2[];//tenemos una variable simple y dos vectores
        v1= new int [10];
        for ( i=0; i < v1.length; ++i) {
            v1[i] = i + 1;

            System.out.println(v1[i]);
        }

        System.out.println("\n " + Arrays.toString(v1));

    }
}
