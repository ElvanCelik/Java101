import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i;
        int total=0;
        Scanner input=new Scanner(System.in);
        do {
            System.out.print("Bir sayi giriniz : ");
            i=input.nextInt();
            if(i%4==0){
                total+=i;

            }
        }while (i%2==1);
        System.out.print("Toplam sonucu : "+total);
    }
}
