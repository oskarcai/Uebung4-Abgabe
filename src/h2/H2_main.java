package h2;

public class H2_main {
    public static void main(String[] args) {
        boolean x = true, y = true, a = false, b = false, c = false;
        int input = 10;

        x = (input == 10) || (input == 11);
        y = (input == 11) || (input == 1);

        boolean E1 = x;
        boolean E2 = y;
        boolean E3 = x != y;

        a = E1 && E2;
        b = E1 || E3;
        c = (x && !y) || (!x && !y);

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}

