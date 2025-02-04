import java.util.Scanner;

public class EliminarRepetidos {
    public static void main(String[] args) {
        System.out.println(" *** Sistema para eliminar numeros repetidos by OAM ***");
        var consola = new Scanner(System.in);
        String[] arreglo1;
        String[] arreglo2;
        int cont = 0;

        //Definimos el tamaño del arreglo
        System.out.print("Ingrese la cantidad de elementos: ");
        int cantidadElementos = Integer.parseInt(consola.nextLine());
        arreglo1 = new String[cantidadElementos];

        //LLenamos la tabla
        for (int i=0; i<cantidadElementos; i++){
            System.out.print("Ingrese el elemento "+i+" : ");
            arreglo1[i] = consola.nextLine();
        }

        //Hcemos nulos los valores repetidos
        for (int i=0; i<cantidadElementos; i++) {
            if(arreglo1[i] != "Repetido") {
                for (int j = i + 1; j < cantidadElementos; j++) {
                    if (arreglo1[i].equals(arreglo1[j])) {
                        cont++;
                        arreglo1[j] = "Repetido";
                    }
                }
            }
        }

        //Definimos nuestro segundo arreglo
        int elementosFinal;
        elementosFinal = cantidadElementos-cont;
        arreglo2 = new String[elementosFinal];
        var k = 0;

        //Llenamos el segundo arreglo
        for (int i=0; i<cantidadElementos; i++){
            if(arreglo1[i] != "Repetido"){
                arreglo2[k] = arreglo1[i];
                k++;
            }
        }

        //Imprimir segundo arreglo
        for(int i =0; i<(elementosFinal); i++){
            System.out.print(arreglo2[i]);
        }

    }
}
