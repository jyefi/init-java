class Vector3{ 
    private double c1; 
    private double c2; 
    private double c3;
    public Vector3(double c1, double c2, double c3){ 
        this .c1=c1;
        this .c2=c2;
        this .c3=c3; }
        public double getC1(){ 
            return c1;
        }
        public double getC2(){
            return c2; 
        }
        public double getC3(){ 
            return c3;
        }
        public double producto(Vector3 v){ 
            double p = 0;
            p = p + c1*v.getC1();
            p = p + c2*v.getC2();
            p = p + c3*v.getC3();
            return p; }
        }
        class Prueba{
            public static void main(String[] args){
                Vector3 a = new Vector3(1,2,3); 
                Vector3 b = new Vector3(3,-1,2); 
                System.out.println(a.producto(b));
            } 
        }
    

    