import java.util.Scanner;

public class Facturas {
    public static void main(String[] args) {
        System.out.println(" *** Sistema de Facturas by OAM *** \n");
        var consola = new Scanner(System.in);
        String[] producto;
        int[] unidades;
        double[] precioUnitario;
        double[] totalFactura;
        double totalGlobal = 0;

        System.out.println("Ingrese la cantidad de productos diferentes de la factura; ");
        int cantidadFacturas = Integer.parseInt(consola.nextLine());
        producto = new String[cantidadFacturas];
        unidades = new int[cantidadFacturas];
        precioUnitario = new double[cantidadFacturas];
        totalFactura = new double[cantidadFacturas];

        //for (var i=0; i<cantidadFacturas; i++){
            for (var j = 0; j<cantidadFacturas; j++){
                System.out.print("Ingrese el producto [" + j + "] : ");
                producto[j] = consola.nextLine();
            }

            for (var j = 0; j<cantidadFacturas; j++){
                System.out.print("Ingrese la cantidad de unidades de " + producto[j] + " :");
                unidades[j] = Integer.parseInt(consola.nextLine());
            }

            for (var j = 0; j<cantidadFacturas; j++){
                System.out.print("Ingrese el costo por unidad de " + producto[j] + " :");
                precioUnitario[j] = Double.parseDouble(consola.nextLine());
            }

            for (var j = 0; j<cantidadFacturas; j++){
                totalFactura[j] = unidades[j]*precioUnitario[j];
                totalGlobal += totalFactura[j];
            }
        //}

        System.out.println("---------------------------------------------------");
        System.out.println("Producto\t\tUnidades\t\tPrecio Unitario\t\tTotal");

        for (var i=0; i<cantidadFacturas; i++){
            System.out.println(producto[i] + "\t\t\t" + unidades[i] + "\t\t\t\t" + precioUnitario[i] + "\t\t\t\t" + totalFactura[i]);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Total: " + totalGlobal);

    }
}
