import java.util.Scanner;

public class ConteoLetras {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = consola.nextLine();
        int[] arreglo = new int[frase.length()];
        var contador = 0;


        for(var i=0; i<frase.length(); i++){
            arreglo[i] = frase.charAt(i);
            if (arreglo[i] == 'a' )
                contador++;
        }
        System.out.println("La cantidad de veces que a se repite es: "+contador);
    }
}
