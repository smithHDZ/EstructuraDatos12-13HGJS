package dominio;

public class Elipse{
    private float radioMayor;
    private float radioMenor;

    public Elipse(){
        radioMayor=radioMenor;
    }

    public Elipse(float rM, float rm) {
        this.radioMayor=rM;
        this.radioMenor=rm;
    }

    public float getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(float nuevoradioMayor) {
        if (nuevoradioMayor > 0.0) {
            this.radioMayor = nuevoradioMayor;
        }
    }

    public float getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(float nuevoradioMenor) {
        if (nuevoradioMenor > 0.0) {
            this.radioMenor = nuevoradioMenor;
        }
    }

    public Float calcularArea(){
        float area;
        float a ;
        a=radioMayor*radioMenor;
        area= (float) (Math.PI * a);
     return area;
    }

    public double calcularPerimetro() {
        float perimetro, p , pm, pp, pM  ;
        pM= (float) Math.pow(radioMayor,2);
        pm= (float) Math.pow(radioMenor,2);
        p = (pM+ pm) /2;
        pp = (float) Math.sqrt(p);
        perimetro= (float) ((2* Math.PI)*pp);
    return perimetro;
    }

    @Override
    public String toString() {
        return "Elipse \n" +
                "radioMayor= " + radioMayor + "\n"+
                "radioMenor= " + radioMenor;
    }
}
