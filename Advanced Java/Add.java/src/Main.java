public class Main {
    public static void main(String[] args) {
        String digit="3653653";
        int len=digit.length();
        int sum=0;

        for(int i=0;i<len;i++){
            sum+=Integer.parseInt(Character.toString(digit.charAt(i)));
        }
        System.out.println(sum);    }
}