import java.util.Scanner;

public class NumeroLetra {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int cont = 0;

        System.out.println("*** Contador de letras en un texto by OAM ***");
        System.out.println("Ingrese un texto: ");
        String frase = consola.nextLine();

        System.out.println("Ingrese la letra que desea contar: ");
        var letra = consola.nextLine();

        for(var i=0; i < frase.length(); i++){
            if (frase.charAt(i) == letra.charAt(0)){
                cont++;
            }
        }
        System.out.println("El total de veces que " + letra + " se repite es: " + cont);

    }
}
