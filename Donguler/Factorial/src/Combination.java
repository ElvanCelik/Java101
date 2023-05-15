import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,r;
        int total1=1;
        int total2=1;
        int total3=1;
        System.out.print("n sayisini giriniz: ");
        n=input.nextInt();
        System.out.print("r sayisini giriniz: ");
        r=input.nextInt();
        int a=n-r;
        for (int i=1;i<=n;i++){
            total1*=i;
        }
        for (int j=1;j<=r;j++){
            total2*=j;
        }
        for (int k=1;k<=a;k++){
            total3*=k;
        }
        int combination = total1 / (total2*total3);
        System.out.print("n'in r'li kombinasyonu = "+combination);

    }
}
