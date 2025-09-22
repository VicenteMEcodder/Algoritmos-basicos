public class AlgoritmosBasicos {
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }

    public static String reversa(String texto) {
        String reverso = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            reverso += texto.charAt(i);
        }
        return reverso;
    }

    public static boolean esPalindromo(String texto) {
        String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverso = "";
        for (int i = textoLimpio.length() - 1; i >= 0; i--) {
            reverso += textoLimpio.charAt(i);
        }
        return textoLimpio.equals(reverso);
    }

    public static void secuenciaFizzBuzz(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int numero = 4;
        if (esPar(numero)) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }

        System.out.println("2 es primo? " + esPrimo(2));
        System.out.println("7 es primo? " + esPrimo(7));
        System.out.println("10 es primo? " + esPrimo(10));
        System.out.println("1 es primo? " + esPrimo(1));

        String texto = "Hola Mundo";
        System.out.println("Texto original: " + texto);
        System.out.println("Texto en reversa: " + reversa(texto));

        String texto1 = "Anita lava la tina";
        String texto2 = "Hola Mundo";
        System.out.println("\"" + texto1 + "\" es palíndromo? " + esPalindromo(texto1));
        System.out.println("\"" + texto2 + "\" es palíndromo? " + esPalindromo(texto2));

        secuenciaFizzBuzz(15);
    }
}
