public class Continue04OmitirNegativos {
    public static void main(String[] args) {

        int[] numeros = {10, -5, 20, -8, 15};

        for (int n : numeros) {

            if (n < 0)
                continue;

            System.out.println(n);
        }
    }
}