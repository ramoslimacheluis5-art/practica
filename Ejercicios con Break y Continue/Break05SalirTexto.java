import java.util.Scanner;

public class Break05SalirTexto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Escriba algo: ");
            String texto = sc.nextLine();

            if (texto.equalsIgnoreCase("salir"))
                break;

            System.out.println("Ingresado: " + texto);
        }
    }
}