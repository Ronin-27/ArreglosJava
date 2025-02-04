import java.util.Scanner;

public class IntroducirValoresArreglos {
    public static void main(String[] args) {
        //Introducir valores
        var consola = new Scanner(System.in);
        //declarar el arreglo
        System.out.print("Ingrese la cantidad de elementos: ");
        var cantidadElementos = Integer.parseInt(consola.nextLine());
        //Creamos de manera dinamica el arreglo
        var enteros = new int[cantidadElementos];
        //solicitar los valores del arreglo
        for(var i = 0; i < cantidadElementos; i++){
            System.out.print("Proporciona enteros [" + i + "] = ");
            enteros [i] = Integer.parseInt(consola.nextLine());
        }
        //Imprimir los valores del arreglo
        System.out.println("Impresión del arreglo");
        for(var i = 0; i < cantidadElementos; i++){
            System.out.println("Enteros [" + i +"] = " + enteros[i]);
        }


    }
}
