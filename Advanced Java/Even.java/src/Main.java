public class Main {
    public static void main(String[] args) {
        int num=0;
        do{
            num++;
            if(num%2==0){
                System.out.println(num +  "is even ");
            }else{
                System.out.println(num +"is odd");
            }
        }while(num<20);
    }
}
