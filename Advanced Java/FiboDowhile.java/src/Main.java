public class Main {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int c, count = 10;
        int i = 0;

       do {
            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;

            i++;
        } while (i < count);

    }
}
