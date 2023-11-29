package calculos_numericos;

import java.util.Scanner;

public class Calculos_numericos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0, negativos = 0, pares = 0, impares = 0;
        int cantidadPos = 0, cantidadNeg = 0, cantidadPares = 0, cantidadImpares = 0;
        int sumaPos = 0, sumaNeg = 0, sumaPares = 0, sumaImpares = 0;
        double media = 0;
        char opcion;

        do {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
                sumaPos += numero;
                cantidadPos++;
            } else if (numero < 0) {
                negativos++;
                sumaNeg += numero;
                cantidadNeg++;
            }

            if (numero % 2 == 0) {
                pares++;
                sumaPares += numero;
                cantidadPares++;
            } else {
                impares++;
                sumaImpares += numero;
                cantidadImpares++;
            }

            media = (media * (positivos + negativos) + numero) / (positivos + negativos + 1);

            System.out.print("¿Desea ingresar otro número? (S/N): ");
            opcion = scanner.next().charAt(0);
        } while (opcion == 'S' || opcion == 's');

        System.out.println("Suma de positivos: " + sumaPos);
        System.out.println("Suma de negativos: " + sumaNeg);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
        System.out.println("Cantidad de positivos: " + cantidadPos);
        System.out.println("Cantidad de negativos: " + cantidadNeg);
        System.out.println("Cantidad de pares: " + cantidadPares);
        System.out.println("Cantidad de impares: " + cantidadImpares);
        System.out.println("Media: " + media);
    }
}
