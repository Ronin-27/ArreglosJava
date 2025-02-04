public class InvertirArreglo {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        int[] arreglo2 = new int[10];

        for(var i=0; i < 10; i++){
            arreglo[i] = i +1;
            System.out.print(arreglo[i] + " ");
        }
        for(var i=0; i<10 ; i++){
            arreglo2[9-i] = arreglo[i];
        //    System.out.print(arreglo2[9-i] + " ");
        }
        for(var i=0; i<10 ; i++){
            arreglo[i] = arreglo2[i];
            System.out.print(arreglo[i] + " ");
        }
    }
}
