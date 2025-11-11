package h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 14.2F, fahrenheitFloat = 0;
        double celsiusDouble = 14.2, fahrenheitDouble = 0;

        fahrenheitFloat = celsiusFloat * 9/5 + 32;
        fahrenheitDouble = celsiusDouble * 9/5 + 32;

        System.out.println(celsiusFloat + " Celsius = " + fahrenheitFloat + "[Float-Datentyp]");
        System.out.println(celsiusDouble + " Celsius = " + fahrenheitDouble + "[Double-Datentyp]");

    }
}
