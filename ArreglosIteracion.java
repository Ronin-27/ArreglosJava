public class ArreglosIteracion {
    public static void main(String[] args) {
        //Arreglos
        var enteros = new int[]{100,200,300,400,500};
        //Iterar los elementos del arreglo
        for (var i=0; i < enteros.length; i++){
            System.out.println("Valor del indice" + i + " = "+ enteros[i]);
        }
    }
}
