import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c,u;
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz = ");
        a = input.nextInt();
        System.out.println("İkinci kenarı giriniz = ");
        b = input.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs uzunluğu = "+c);

        //Çevreyi bulalım
        u=(a+b+c)/2;
        double cevre;
        cevre=2*u;
        System.out.println("Cevre = "+cevre);

        //Alanı bulalım = Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        double alan;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan = "+alan);


    }
}