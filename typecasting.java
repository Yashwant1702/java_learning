public class typecasting {
    public static void main(String[] args) {
        // Implicit typecasting
        int i = 10;
        double d = i; // int to double
        System.out.println("Implicit Typecasting: " + d);

        // Explicit typecasting
        double x = 10.5;
        int y = (int) x; // double to int
        System.out.println("Explicit Typecasting: " + y);
    }
}