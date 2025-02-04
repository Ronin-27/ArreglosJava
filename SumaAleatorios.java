import java.util.Scanner;
import java.util.Random;

public class SumaAleatorios {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var aleatorio = new Random();

        System.out.print("Ingrese la cantidad de elementos: ");
        var elementos = Integer.parseInt(consola.nextLine());
        int[] arreglo = new int[elementos];
        var suma = 0;

        for(var i = 0; i<elementos; i++){
            arreglo[i] = aleatorio.nextInt(100);
        }

        for(var i = 0; i<elementos; i++){
            System.out.println("Valor arreglo ["+i+"] = " + arreglo[i]);
            suma += arreglo[i];

        }
        System.out.println("La suma total es de: "+suma);
    }

}
