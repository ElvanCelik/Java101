import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n;
        int carpim=1;
        n=input.nextInt();
        for (int i=1;i<=n;i++){
            carpim*=i;

        }
        System.out.print("Sonuc = "+carpim+"!");
    }
}