import java.util.Scanner;
public class Main {
    static int power (int base,int exp){
        int result = 1;
        for(int i=1;i<=exp;i++){
            result*=base;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2;
        System.out.print("n1 = ");
        n1= input.nextInt();
        System.out.print("n2 = ");
        n2= input.nextInt();
        System.out.println("Result = " +power(n1,n2));


        //Metotlar classlar arasına yazılır.


    }
}