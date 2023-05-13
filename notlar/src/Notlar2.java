import java.util.Scanner;
public class Notlar2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        a=input.nextInt();
        System.out.print("b sayısını giriniz: ");
        b=input.nextInt();
        c=(a==b) ? c=1:0;
        System.out.println("Girdiğiniz c sayısının değeri: "+c);

    }
}
