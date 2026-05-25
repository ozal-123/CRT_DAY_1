import java.util.Scanner;
public class pow {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("power  " +pow(n1,n2));


        
    }
    public static int pow(int n1,int n2){
        if(n1 ==1 ){
            return 1;
        }
        else if(n2==0){ return 1;}
        else if(n1==0){ return 0;}
        else if(n2==1){ return n1;}
        return n1* pow(n1,n2-1);

    }
    
}
