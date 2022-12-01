public class Main {
    public static void main(String[] args) {
        int fact=1;
        int i=1,num=5;
        do{
            fact=fact*i;
            i++;

        }while(i<=num);
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}


