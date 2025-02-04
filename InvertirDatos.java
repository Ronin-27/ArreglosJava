import java.util.Scanner;

public class InvertirDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int[] arreglo1;
        int[] arreglo2;

        System.out.print("Ingrese la cantidad de elementos: ");
        int cantidadElementos = Integer.parseInt(consola.nextLine());
        arreglo1 = new int[cantidadElementos];
        arreglo2 = new int[cantidadElementos];

        for(int i=0; i<cantidadElementos; i++){
            System.out.print("Ingresa valor: ");
            arreglo1[i] =   Integer.parseInt(consola.nextLine());
        }

        for(int i=0; i<cantidadElementos; i++){
            arreglo2[cantidadElementos - (i+1)] = arreglo1[i];
        }

        System.out.println("Array inicial: ");
        for (int i = 0; i<cantidadElementos; i++){
            System.out.print(arreglo1[i] + " - ");
        }
        System.out.println();
        System.out.println("Array final: ");
        for (int i = 0; i<cantidadElementos; i++) {
            System.out.print(arreglo2[i] + " - ");
        }
    }

}
