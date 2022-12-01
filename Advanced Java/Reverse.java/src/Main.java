public class Main {
    public static void main(String[] args) {
        int num=5678,rev=0;
        for (int i = num; i != 0; i /= 10)
        {
            int x = i % 10;
            rev = rev * 10 + x;
        }
        System.out.println("The reverse of digits of " + num + " is " + rev);

    }
}