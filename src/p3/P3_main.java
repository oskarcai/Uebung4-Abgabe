package p3;

public class P3_main {
    public static void main(String[] args) {

        // Wahrheitstabelle (s. Aufgabe)
        boolean x1 = true, y1 = true;
        boolean x2 = true, y2 = false;
        boolean x3 = false, y3 = true;
        boolean x4 = false, y4 = false;

        // (a) !(x != y && x == y) [1.Tabelle]
        boolean A1_1 = !(x1 != y1 && x1 == y1);
        boolean A2_1 = !(x2 != y2 && x2 == y2);
        boolean A3_1 = !(x3 != y3 && x3 == y4);
        boolean A4_1 = !(x4 != y4 && x3 == y4);

        // (b) (x || true) [2.Tabelle]
        boolean A1_2 = x1 || true;
        boolean A2_2 = x2 || true;
        boolean A3_2 = x3 || true;
        boolean A4_2 = x4 || true;

        // (c) (x && false) [3.Tabelle]
        boolean A1_3 = x1 && false;
        boolean A2_3 = x2 && false;
        boolean A3_3 = x3 && false;
        boolean A4_3 = x4 && false;

        // (d) ((x && !y) || (!x)) [4.Tabelle]
        boolean A1_4 = (x1 && !y1) || (!x1);
        boolean A2_4 = (x2 && !y2) || (!x2);
        boolean A3_4 = (x3 && !y3) || (!x3);
        boolean A4_4 = (x4 && !y4) || (!x4);

        // Ausgabe für Ausdruck (a)
        System.out.println("Tabelle 1 | Ausdruck (a) !(x != y && x == y)");
        System.out.println("A1_1 == " + A1_1);
        System.out.println("A2_1 == " + A2_1);
        System.out.println("A3_1 == " + A3_1);
        System.out.println("A4_1 == " + A4_1);

        System.out.println(" ");

        // Ausgabe für Ausdruck (b)
        System.out.println("Tabelle 2 | Ausdruck (b) (x || true)");
        System.out.println("A1_2 == " + A1_2);
        System.out.println("A2_2 == " + A2_2);
        System.out.println("A3_2 == " + A3_2);
        System.out.println("A4_2 == " + A4_2);

        System.out.println(" ");

        // Ausgabe für Ausdruck (c)
        System.out.println("Tabelle 3 | Ausdruck (c) (x && false)");
        System.out.println("A1_3 == " + A1_3);
        System.out.println("A2_3 == " + A2_3);
        System.out.println("A3_3 == " + A3_3);
        System.out.println("A4_3 == " + A4_3);

        System.out.println(" ");

        // Ausgabe für Ausdruck (d)
        System.out.println("Tabelle 4 | (d) ((x && !y) || (!x))");
        System.out.println("A1_4 == " + A1_4);
        System.out.println("A2_4 == " + A2_4);
        System.out.println("A3_4 == " + A3_4);
        System.out.println("A4_4 == " + A4_4);
    }
}
