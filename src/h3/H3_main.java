package h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 14.2F, fahrenheitFloat = 0F;
        double celsiusDouble = 14.2, fahrenheitDouble = 0.0;

        fahrenheitFloat = celsiusFloat * 9f/5f + 32f;
        fahrenheitDouble = celsiusDouble * 9.0/5.0 + 32.0;

        System.out.println(celsiusFloat + " Grad Celsius = " + fahrenheitFloat + " Grad Fahrenheit [Float-Datentyp]");
        System.out.println(celsiusDouble + " Grad Celsius = " + fahrenheitDouble + " Grad Fahrenheit [Double-Datentyp]");
    }
}
