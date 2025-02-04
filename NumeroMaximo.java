import java.util.Scanner;

public class NumeroMaximo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de elementos: ");
        var elementos = Integer.parseInt(consola.nextLine());
        int[] arreglo = new int[elementos];
        var max = 0;

        for(int i = 0; i<elementos; i++){
            System.out.print("Ingresa elemento ["+ i + "] :");
            arreglo[i]=Integer.parseInt(consola.nextLine());
        }

        for(int i = 1; i<elementos; i++){
            if(arreglo[i]>max){
                max = arreglo[i];
            }
        }
        System.out.println(max);
    }

}
