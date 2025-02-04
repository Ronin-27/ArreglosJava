import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println(" *** Promedio Calificaciones by OAM*** ");
        var consola = new Scanner(System.in);

        //Solicitamos cantidad de materias
        System.out.print("Ingrese la cantidad de materias: ");
        var cantMaterias = Integer.parseInt(consola.nextLine());
        var materias = new int[cantMaterias];
        var suma = 0;

        //Ingresamos calificaciones
        for(var i = 0; i < cantMaterias; i++){
            System.out.print("Ingrese calificacion materia [" + i + "] : ");
            materias [i] = Integer.parseInt(consola.nextLine());
        }

        //Sumamos calificaciones
        for(var i = 0; i < cantMaterias; i++){
            suma += materias [i];
        }

        //obtenemos el promedio y lo imprimimos
        var promedio = suma / cantMaterias;
        System.out.println("Su promedio final es de: " + promedio);
    }
}

