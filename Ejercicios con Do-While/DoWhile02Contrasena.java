import java.util.Scanner;

public class DoWhile02Contrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String clave;

        do {
            System.out.print("Ingrese la contraseña: ");
            clave = sc.nextLine();
        } while (!clave.equals("java123"));

        System.out.println("Acceso permitido.");
    }
}