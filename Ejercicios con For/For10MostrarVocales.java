import java.util.Scanner;

public class For10MostrarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine().toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.print(c + " ");
            }
        }
    }
}