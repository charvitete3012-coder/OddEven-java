import java.util.Scanner;
public class Odd_Even {
    public void check(){
        int Oddcount = 0;
        int Evencount = 0;
        int range = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range : ");
        range = sc.nextInt();

        for(int i=1;i<=range;i++){
            if(i%2==0){
                Evencount++;
                System.out.println(i + " ->" + " even");
            }
            else{
                Oddcount++;
                System.out.println(i + " ->" + " odd");   
            }
        }
        System.out.println("Total even numbers are : " + Evencount);
        System.out.println("Total odd numbers are : " + Oddcount);
    }
    public static void main(String[] args) {
        Odd_Even oe = new Odd_Even();
        oe.check();
    }
}
