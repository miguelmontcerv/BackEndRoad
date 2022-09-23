package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        
       //Parte 1:
       int x = 5;
       int y = 34;
       int z = 73;
       
       int resultado = suma(x,y,z);
       
       System.out.println("La suma es: "+resultado);
        
       //Parte 2:
       Coche miCoche = new Coche(4);
       System.out.println("Mi coche tiene: "+miCoche.puertas);
       
       miCoche.decrementar();
       System.out.println("Mi coche tiene: "+miCoche.puertas);
       
    }
    
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
    
}

class Coche{
    public int puertas = 0;
    
    public Coche(int brazos){
        this.puertas = brazos;
    }
    
    public void incrementar(){
        this.puertas++;
    }
    
    public void decrementar(){
        this.puertas--;
    }
    
}