import java.util.Scanner;

public class DoWhile07AcumularNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        double suma = 0;
        int contador = 0;

        do {
            System.out.print("Ingrese nota (-1 para terminar): ");
            nota = sc.nextDouble();

            if (nota != -1) {
                suma += nota;
                contador++;
            }

        } while (nota != -1);

        if (contador > 0)
            System.out.println("Promedio: " + (suma / contador));
    }
}