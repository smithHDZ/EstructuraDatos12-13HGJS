package dominio;

public class PilaFacturas {
    private Factura[] p;
    private int tope;

    public PilaFacturas()
    {
        p = new Factura[5];
        tope = -1;
    }

    public PilaFacturas(int n)
    {
        p = new Factura[n];
        tope = -1;
    }

    public Factura[] getP() {
        return p;
    }

    public void setP(Factura p[]) {
        this.p = p;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public boolean estaVacia ( ) {
        if( tope == -1) // checa si el tope no señala a ninguna casilla
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean estaLlena ( ) {
        if ( tope == p.length - 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Factura datoEnTope( )
    {
        if ( !estaVacia() )
        {
            return p[tope];
        }
        else
        {
            return null;
        }
    }

    public int numElementos ( )
    {
        return tope + 1;
    }

    public void insertar(Factura nuevo)
    {
        if(!estaLlena())
        {
            p[tope] = nuevo;
            tope++;
        }
    }

    public Factura eliminar()
    {
        Factura borrado = null;

        if(!estaVacia())
        {
            borrado = p[tope];
            p[tope] = null;
            tope--;
        }

        return borrado;
    }

    public float sumaSaldos()
    {
        float suma = 0;

        for(int i = tope; i >= 0; i--)
        {
            suma += p[i].getSaldo();
        }

        return suma;
    }


    public String faturaMayor(){
        float mayor=0;
        int ind=0;

        for (int i = 0 ;tope >= i; i++ )
            if (p[i].getSaldo()> mayor){
                mayor=p[i].getSaldo();
                ind=i;
            }
        return p[ind].toString();
    }

    public String facturaMayor(){
        float mayor=0;
        int ind=0;

        for (int i = 0 ;tope >= i; i++ )
            if (p[i].getSaldo()> mayor){
                mayor=p[i].getSaldo();
                ind=i;
            }
        return p[ind].toString();
    }


    public String buscarCliente (String nombre) {

        String x = "";
        for (int i = 0; tope >= i; i++)
            if (nombre.equalsIgnoreCase(p[i].getCliente())) {
                x += p[i].toString();
            }
        return x;
    }

    public String toString()
    {
        String x = "Elementos en la pila: \n";
        int i = 0;

        for(i = tope; i >= 0; i--)
        {
            x+= p[i].toString() + "\n";
        }

        x += "Fin de la pila";

        return x;
    }
}

