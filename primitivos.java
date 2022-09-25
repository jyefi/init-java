class primitivos {


    public static void ejemplo2(){

        int[] valores; // valores es null (no se le ha asignado ningún objeto)
        valores = new int[10]; // asignación de un objeto creado con el operador new
        for (int i=0; i<10; i++){
            valores[i] = i;
            //System.out.println(valores[i]); 
        }
        
        double[] notas = new double[100]; // Declaración y asignación de un objeto 
        for (int i=0; i<notas.length; i++){
            notas[i] = Math.random();
            //System.out.println(notas[i]); 
        }
        String[] cadenas = new String[10]; 
        System.out.println(cadenas.length);
        cadenas[0] = new String("Hola mundo"); 
        cadenas[1] = " desde Java";
        System.out.println(cadenas[0].compareTo(cadenas[1]));
    }
    
    class TestUtilidades{
        public static void main(String[] args){
            ejemplo2();
        }
    }
}
    

