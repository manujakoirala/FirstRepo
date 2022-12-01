public class Main {
    public static void main(String[] args) {
        int rev=0,num=59,i=num;


        do{
            int x = i % 10;
            rev = rev * 10 + x;
            i /= 10;
        } while (i != 0);
        System.out.println("The reverse of digits of " + num + " is " + rev);
    }
    }
