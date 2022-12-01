public class Main {
    public static void main(String[] args) {
        int DemocraticParty[]={126,32,230,21,200};
        int []RepublicanParty=new int[]{152,85,121,215,13};
        int p1=0,p2=0;
        for(int i=0;i<5;i++){
            p1+=DemocraticParty[i];
            p2+=RepublicanParty[i];
        }
        if(p1>p2){
            System.out.println("Democratic party is the winner with vote count "+p1);
        }else{
            System.out.println("Republic party is the winner with vote count "+p2);
        }

    }
}