package ejercicio2;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        int numeroIf = 76;
        int numeroWhile = 0;
        int numeroFor = 0;
        String estacion = "Otoño";
        
        //Pt1
        if(numeroIf < 0)
        {
            System.out.println("El numero es negativo");
        }
        else if(numeroIf > 0){
            System.out.println("El numero es positivo");
        }
        else System.out.println("El numero es cero;");
        
        //Pt2
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        
        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        }while(numeroWhile < 3);
        
        for(; numeroFor <= 3; numeroFor++) System.out.println(numeroFor);
     
        switch(estacion){
            case "Invierno":
                System.out.println("Invierno");
                break;
            case "Verano":
                System.out.println("Verano");
                break;
            case "Otoño":
                System.out.println("Otoño");
                break;
            case "Primavera":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("No se conoce la estacion");
        }
    }
    
}
