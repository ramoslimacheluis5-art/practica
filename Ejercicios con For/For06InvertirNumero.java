import java.util.Scanner;

public class For06InvertirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        int invertido = 0;

        for (; numero != 0; numero /= 10) {
            invertido = invertido * 10 + numero % 10;
        }

        System.out.println("Invertido: " + invertido);
    }
}