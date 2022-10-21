package dominio;

public class PilaMaterias {
    private Materia[] p;
    private int tope;

    public PilaMaterias() {
        p = new Materia[5];
        tope = -1;
    }

    public PilaMaterias(int n) {
        p = new Materia[n];
        tope = -1;
    }

    public Materia[] getP() {return p;    }
    public int getTope() {
        return tope;
    }

    public void setP(Materia p[]) {
        this.p = p;
    }
    public void setTope(int tope) {
        this.tope = tope;
    }
    public void insertar(Materia nuevo)
    {
        if(!estaLlena())
        {
            tope++;
            p[tope] = nuevo;
        }
    }
    public boolean estaVacia ( ) {
        if( tope == -1) // checa si el tope no señala a ninguna casilla
        {return true; }
        else {
            return false;
        }
    }

    public boolean estaLlena ( ) {
        if ( tope == p.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public Materia datoEnTope( )
    {
        if ( !estaVacia() ) {
            return p[tope];
        } else {
            return null;
        }
    }

    public int numElementos ( )
    {
        return tope + 1;
    }



    public Materia eliminar()
    {
        Materia borrado = null;
        if(!estaVacia())
        {
            borrado = p[tope];
            p[tope] = null;
            tope--;
        }

        return borrado;
    }

    public String materiaMasCreditos(){
        float mayor=0;
        int ind=0;

        for (int i = 0 ;tope >= i; i++ )
            if (p[i].getCreditos()> mayor){
                mayor=p[i].getCreditos();
                ind=i;
            }
        return p[ind].toString();
    }
    public String vaciarPila(){
        String borrador = "";
        int tope2=tope;
        for (int i = tope2;i>=0 ; i++) {
            borrador +=p[i].toString();
            p[i]=null;
            tope --;
        }
        return borrador;
    }

    public String toString()
    {
        String x = "Elementos en la pila: \n";
        int i = 0;
        for(i = tope; i >= 0; i--)  {
            x+= p[i].toString() + "\n";
        }
        x += "Fin de la pila";
        return x;
    }
}
