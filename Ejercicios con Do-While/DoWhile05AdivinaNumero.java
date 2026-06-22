import java.util.Scanner;
import java.util.Random;

public class DoWhile05AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int secreto = r.nextInt(100) + 1;
        int intento;

        do {
            System.out.print("Adivine el numero: ");
            intento = sc.nextInt();

            if (intento < secreto)
                System.out.println("Mayor");
            else if (intento > secreto)
                System.out.println("Menor");

        } while (intento != secreto);

        System.out.println("Correcto.");
    }
}