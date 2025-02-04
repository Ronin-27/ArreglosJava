import java.util.Arrays;

public class FusionarArreglos {
    public static void main(String[] args) {
        int[] arreglo1= new int[]{1,2};
        int[] arreglo2 = new int[]{3,4};

        //Se declara el tamaño del arreglo fusionado siendo las longitudes de los dos arreglos previos
        int[] arregloFusionado = new int[arreglo1.length + arreglo2.length];

        //Copiar los elementos del primer arreglo al fusionado
        for(var i=0;i<arreglo1.length; i++){
            arregloFusionado[i] = arreglo1[i];
        }

        //Copiar los elementos del segundo arreglo al fusionado
        for(var i=0;i< arreglo2.length; i++){
            arregloFusionado[arreglo1.length + i] = arreglo2[i];
        }

        System.out.println(Arrays.toString(arregloFusionado));
    }
}
