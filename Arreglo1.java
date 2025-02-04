public class Arreglo1 {
    public static void main(String[] args) {
        var enteros = new int[5]; //aqui indicamos la cantidad de espacios de memoria
        //Pero el indice comienza en 0

        //a conitnuacion asignaremos valores a los espacios de memoria del arreglo
        enteros[0]=13;
        enteros[1]=21;
        enteros[4]=62;

        System.out.println("El valor 1 = " + enteros[0]);
        System.out.println("El valor 2 = " + enteros[1]);
        System.out.println("El valor 5 = " + enteros[4]);
    }
}
