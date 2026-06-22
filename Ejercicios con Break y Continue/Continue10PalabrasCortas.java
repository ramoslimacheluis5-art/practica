public class Continue10PalabrasCortas {
    public static void main(String[] args) {

        String texto = "yo estudio java en la universidad";
        String[] palabras = texto.split(" ");

        for (String palabra : palabras) {

            if (palabra.length() < 3)
                continue;

            System.out.println(palabra);
        }
    }
}