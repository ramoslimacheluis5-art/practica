import java.util.Scanner;

public class DoWhile04Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola");
                    break;
                case 2:
                    System.out.println("Fecha disponible en sistema");
                    break;
            }

        } while (opcion != 3);

        System.out.println("Programa finalizado.");
    }
}