package dominio;


public class ColaInt {
    private int c[];
    private int frente, fin;

    public ColaInt() {
        c = new int[5];
        frente = 0;
        fin = -1;
    }

    public ColaInt(int n)
    {
        c = new int[n];
        frente = 0;
        fin = -1;
    }

    public void setFrente(int nuevoFrente)
    {
        frente = nuevoFrente;
    }

    public void setFin(int nuevoFin)
    {
        fin = nuevoFin;
    }

    public void setC ( int [ ] nuevoC ) {
        c = nuevoC;
    }

    public int getFrente()
    {
        return frente;
    }

    public int getFin()
    {
        return fin;
    }

    public int [] getC()
    {
        return c;
    }

    public boolean estaVacia()
    {
        if(frente > fin)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean estaLlena()
    {
        if(fin == c.length -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void insertar(int x)
    {
        if(!estaLlena())
        {
            fin++;
            c[fin] = x;
        }
    }

    public int eliminar()
    {
        int borrado = -9999;

        if(!estaVacia())
        {
            borrado = c[frente];
            c[frente] = 0;
            frente++;
        }
        else
        {
            frente = 0;
            fin = -1;
        }

        return borrado;
    }

    public int numElementos()
    {
        return (fin - frente) + 1;
    }

    public int elementoEnFrente()
    {
        if(estaVacia())
        {
            return -999999;
        }
        else
        {
            return c[frente];
        }
    }

    public String toString()
    {
        String s = " ";

        for(int i = frente; i <= fin; i++)
        {
            s += c[i] + "\n";
        }

        return s;
    }
}
