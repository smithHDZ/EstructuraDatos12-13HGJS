package dominio;

public class Triangulo {
    private float lado1;
    private float lado2;
    private float lado3;

    public Triangulo (){
        lado1 = lado2 = lado3;
    }
   public Triangulo(float l1,float l2, float l3){
        this.lado1=l1;
        this.lado2=l2;
        this.lado3=l3;

   }

   public Triangulo(float la){
        lado1=lado2=lado3=la;
   }

    public float getLado1(){
        return lado1;
    }

    public float getLadoB(){
        return lado2;
    }

    public float getLado3(){
        return lado3;
    }

    public void serLadoA(float nuevoLado1){
            if(nuevoLado1 > 0.0){
            this.lado1 = nuevoLado1;
        }
    }
    public void serLadoB(float nuevoLado2){
        if(nuevoLado2 > 0.0){
            this.lado2 = nuevoLado2;
        }
    }

    public void setLado3(float nuevoLado3){
        if(nuevoLado3 > 0.0){
            lado3 = nuevoLado3;
        }
    }

    public double calcularPerimetro(){
        double perimetro;
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public Float calcularArea(){
        float area1, area, semiperimetro;
        semiperimetro = (lado1 + lado2 + lado3) / 2;
        area1 = (semiperimetro*(semiperimetro - lado1)*(semiperimetro- lado2)*(semiperimetro - lado3));
        area= (float) Math.sqrt(area1);
        return area;

    }

    public String toString(){
        String cadena = "";
        //cadena += "\nTriangulo: " + soyTriangulo;
        cadena += "\nLado 1: " + lado1;
        cadena += "\nLado 2: " + lado2;
        cadena += "\nLado 3: " + lado3;
        //cadena += "\nArea: " + calcularArea;
        //cadena += "\nPeq perimetro: " + calcularPerimetro;

        return cadena;
    }


}

