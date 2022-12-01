public class FactorialFunction{
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        int f;
        f=factorial(5);
        System.out.println("Factorial:"+f);
    }
}
