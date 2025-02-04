public class Arreglo2 {
    public static void main(String[] args) {
        var enteros = new int[]{100,200,300,400,500};
        //Al declarar asi el arreglo el sistema automaticamente selecciona ka cantidad de variables en la unidad de memoria-
        System.out.println("Valor 1: " + enteros[0]);
        System.out.println("Valor 2: " + enteros[1]);
        System.out.println("Valor 3: " + enteros[2]);
        System.out.println("Valor 4: " + enteros[3]);
        System.out.println("Valor 5: " + enteros[4]);

        System.out.println("Imprimir el arreglo " + enteros); //Va a imprimir la direccion de memoria

    }
}
