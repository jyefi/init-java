class Utilidades {
    public Utilidades() {
    }

    public static void ejemplo(){
        int a=8;
        int b=19; System.out.println(a*b); 
        System.out.println(a+b);
        char c ='a'; 
        System.out.println(c);
        double v = 1.8888; 

        System.out.println(v/a);
        // La siguiente sentencia provoca un error de compilación 
        // Nos informa de que v*a es un double y estamos asignando 
        // a un entero por lo que tenemos una pérdida de precisión 
        int d = (int)v*a;
        System.out.println(d);
             // Para arreglarlo, el programador tiene que hacer explícita
             // la conversión de tipos
             
        //int d = (int)(v*a);
        System.out.println(d); 
    }
    class TestUtilidades{
        public static void main(String[] args){
            ejemplo();
        }
    }
    
}
