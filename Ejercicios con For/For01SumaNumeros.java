public class For01SumaNumeros {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            suma += i;
        }

        System.out.println("Suma total: " + suma);
    }
}