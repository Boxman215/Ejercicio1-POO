public class Ejerciciocompleto {

    public static void main(String[] args) {

        int[] numeros = new int[10];

       
        for (int x = 0; x < numeros.length; x++) {
            numeros[x] = (int) (Math.random() * 100);
        }

        System.out.println("Arreglo original:");

        for (int x = 0; x < numeros.length; x++) {
            System.out.print(numeros[x] + " ");
        }

        int numMayor = numeros[0];
        int numMenor = numeros[0];

        
        for (int x = 1; x < numeros.length; x++) {

            if (numeros[x] > numMayor) {
                numMayor = numeros[x];
            }

            if (numeros[x] < numMenor) {
                numMenor = numeros[x];
            }

        }

        System.out.println("\nEl número mayor es: " + numMayor);
        System.out.println("El número menor es: " + numMenor);

        int cambio;

        // Ordenar 
        for (int x = 0; x < numeros.length; x++) {

            for (int y = x + 1; y < numeros.length; y++) {

                if (numeros[x] > numeros[y]) {

                    cambio = numeros[x];
                    numeros[x] = numeros[y];
                    numeros[y] = cambio;

                }

            }

        }

        System.out.println("Arreglo ordenado:");

        for (int x = 0; x < numeros.length; x++) {
            System.out.print(numeros[x] + " ");
        }

    }

}

