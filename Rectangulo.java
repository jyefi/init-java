class Rectangulo extends Figura{ 
    private double base;
    private double altura;
    public Rectangulo (double ancho, double alto) { 
        super ("Rectangulo");
        base = ancho;
        altura = alto;
    }
    public Rectangulo () {
        this (10.0, 10.0); }
        public double area () { 
            return ( base * altura );
        }
        public void dibujar () {
            System.out.println ("Soy un Rectangulo de: " + base + "*" + altura);
        }
    }
    class TestRectangulo{
        public static void main(String[] args){
            Rectangulo r = new Rectangulo();
            r.dibujar();
            System.out.println (r.area());
        }
    }


