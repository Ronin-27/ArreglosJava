import java.util.Arrays;

public class OrdenarArreglo {
    public static void main(String[] args) {
        int[] numeros = {5, 1, 4, 2, 8};

        // Utilizando Arrays.sort() para ordenar el arreglo
        Arrays.sort(numeros);

        // Mostrar el arreglo ordenado
        System.out.println("Arreglo ordenado en orden ascendente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}