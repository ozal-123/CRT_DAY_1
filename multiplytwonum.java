import java.util.Scanner;
public class multiplytwonum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("multiplication " +mult(x,y));


        
    }
    public static int mult(int x,int y){
        if(x==0 ||y==0 ){
            return 0;
        }
        else if(x==1){ return y;}
        else if(y==1){ return x;}
        return mult(x ,(y-1))+x;

    }
    
}