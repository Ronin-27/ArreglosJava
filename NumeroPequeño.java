//Encontrar el número más pequeño en un arreglo
import java.util.Scanner;

public class NumeroPequeño {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int[] arreglo1;
        int menor = 0;

        System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
        int cantidadElementos = consola.nextInt();

        arreglo1 = new int[cantidadElementos];

        for(int i=0; i<cantidadElementos; i++){
            System.out.print("Ingrese el valor del elemento " + i + " : ");
            arreglo1[i] = consola.nextInt();
        }

        for(int i=1; i<cantidadElementos; i++){
            if(arreglo1[i]<arreglo1[i-1]){
                menor = arreglo1[i];
            }
        }

        System.out.println("El numero menor del arreglo es: " + menor);


    }
}
