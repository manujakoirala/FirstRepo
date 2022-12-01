public class Main {
    public static void main(String[] args) {
//        int evensum = 0;
//        int oddsum = 0;

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number" + i);
//                evensum += i;

            } else {
                System.out.println("Odd number" + i);
//                oddsum += i;

            }
        }
//        System.out.println("Odd number sum" + oddsum);
//        System.out.println("Even number" + evensum);
    }
}