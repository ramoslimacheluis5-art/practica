public class Break09Multiplo17 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 17 == 0) {
                System.out.println("Multiplo encontrado: " + i);
                break;
            }

            System.out.print(i + " ");
        }
    }
}