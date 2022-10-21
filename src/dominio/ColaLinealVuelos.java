package dominio;

public class ColaLinealVuelos {
    private Vuelo c[ ];
    private int frente, fin;

    public ColaLinealVuelos()
    {
        c = new Vuelo[5];
        frente = 0;
        fin = -1;
    }

    public ColaLinealVuelos(int n)
    {
        c = new Vuelo[n];
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

    public void setC ( Vuelo [ ] nuevoC ) {
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

    public Vuelo [] getC()
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

    public void insertar(Vuelo x)
    {
        if(!estaLlena())
        {
            fin++;
            c[fin] = x;
        }
    }

    public String eliminar()
    {
        Vuelo borrado = null;

        if(!estaVacia())
        {
            borrado = c[frente];
            c[frente] = null;
            frente++;
        }
        else
        {
            frente = 0;
            fin = -1;
        }

        return borrado.toString();
    }

    public int numElementos()
    {
        return (fin - frente) + 1;
    }

    public String elementoEnFrente()
    {
        if(estaVacia())
        {
            return " ";
        }
        else
        {
            return c[frente].toString();
        }
    }

    public String buscaPalabra(String palabra)
    {
        String x = "";
        if(estaVacia())
        {
            x = "";
        }
        else
        {
            for(int i = frente; i <= fin; i++)
            {
                if(palabra.equals(c[i]))
                {
                    x += c[i];
                }
            }
        }

        return x;
    }

    public Float sumaPrecios()
    {
        float suma = 0;

        for(int i = frente; i <= fin; i++)
        {
            suma += c[i].getPrecio();
        }

        return suma;
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
