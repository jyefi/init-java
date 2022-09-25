abstract class Figura { 
    private String nombre;
    abstract public double area ();
    abstract public void dibujar ();
    public Figura (String nombreFigura) { nombre = nombreFigura;
    }
        public boolean menorQue (Figura f) { 
            return ( this.area() < f.area() );
    }
    public String toString () {
        return ( nombre + " , " + area() );
    } 
}