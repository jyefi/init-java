import java.util.*;

public // imports
    class Empleado{
        private String nombre;
        private String departamento; 
        private int edad;

        Empleado(String nombre, String departamento, int edad){ 
            this .nombre=nombre;
            this .departamento=departamento;
            this .edad=edad;
        }
        public void setNombre(String arg){ 
            this .nombre=arg;
        }
        public String getNombre(){
            return nombre; 
        }
        public void setEdad(int arg){ 
        this .edad=arg;
        }
        public int getEdad(){ return edad;
        }
        public String getDepartamento() {
            return departamento;
        }
        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        } 
        class EjemploStream{
            public static void main(String[] args){
                ArrayList<Empleado> empleados = new ArrayList<Empleado>(); 
                empleados.add(new Empleado("Pedro","IT",43)); 
                empleados.add(new Empleado("Antonio","RRHH",32)); 
                empleados.add(new Empleado("Rodrigo","IT",25)); 
                empleados.add(new Empleado("Carlos", "RRHH",20)); 
                empleados.add(new Empleado("Pablo", "IT", 28));

                System.out.println("Empleados mayores de 27 años:");

                empleados.stream().filter(e -> e.getEdad()>27).map(e -> e.getNombre()).forEach(n -> System.out.println(n));
                Optional<Empleado> min = empleados.stream().min((e1,e2) -> e1.getEdad()- e2 .getEdad());
                min.ifPresent(e -> System.out.println("Empleado de menor edad: " + e. getNombre()));
                // Edad media
                System.out.println("Edad media de los empleados:");
                double suma = empleados.stream().mapToDouble((e) -> e.getEdad()).reduce(0, (acc,dato) -> acc+dato); 
                System.out.println(suma/empleados.size());
            }
        }
    }