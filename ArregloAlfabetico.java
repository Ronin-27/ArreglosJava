public class ArregloAlfabetico {
    public static void main(String[] args) {
        // Arreglo de palabras
        String[] palabras = {"banana", "manzana", "pera", "uva", "kiwi", "naranja"};

        // Método burbuja para ordenar las palabras alfabéticamente
        for (int i = 0; i < palabras.length - 1; i++) {
            for (int j = 0; j < palabras.length - 1 - i; j++) {
                // Comparar palabras
                if (palabras[j].compareTo(palabras[j + 1]) > 0) {
                    // Intercambiar si están fuera de orden
                    String temp = palabras[j];
                    palabras[j] = palabras[j + 1];
                    palabras[j + 1] = temp;
                }
            }
        }

        // Imprimir el arreglo ordenado
        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}