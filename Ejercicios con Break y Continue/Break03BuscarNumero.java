import java.util.Scanner;

public class Break03BuscarNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = {5, 8, 12, 20, 35};

        System.out.print("Numero a buscar: ");
        int buscado = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscado) {
                System.out.println("Encontrado en posicion " + i);
                break;
            }
        }
    }
}