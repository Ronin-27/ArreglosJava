import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos: ");
        var elementos = Integer.parseInt(consola.nextLine());
        int[] arreglo = new int[elementos];
        int par = 0, impar = 0;

        for(var i=0; i<elementos; i++){
            System.out.print("Ingresa elemento ["+i+"] = ");
            arreglo[i] = Integer.parseInt(consola.nextLine());
        }

        for(var i=0; i<elementos; i++){
            if(arreglo[i] % 2 == 0){
                par++;
            }
            else{
                impar++;
            }
        }
        System.out.println("Cantidad de pares = "+par);
        System.out.println("Cantidad de impares = "+impar);

    }

}
