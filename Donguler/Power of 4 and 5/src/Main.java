import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i;
        System.out.print("Bir sayi giriniz : ");
        i= input.nextInt();
        for(int n = 1; n<=i; n*=4){
            System.out.println("4'ün kuvvetleri : "+n);
        }
        for(int n = 1; n<=i; n*=5){
            System.out.println("5'in kuvvetleri : "+n);
        }
    }
}