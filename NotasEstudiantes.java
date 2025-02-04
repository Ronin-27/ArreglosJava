import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        String[] nombres = new String[]{"Octavio", "Maria", "Itzel", "Francisco", "Manuel"};
        int[] calificacion = new int[]{10,9,8,7,6};
        boolean encontrado = false;

        System.out.print("Introduce el nombre del alumno: ");
        var nombre = consola.nextLine();

        for(int i =0; i<5; i++){
            if(nombre.equals(nombres[i])){
                System.out.println("Calificación: " + calificacion[i]);
                encontrado = true;
                break;
            }

        }
        if(!encontrado){
            System.out.println("Alumno no encontrado.");
        }
    }
}
