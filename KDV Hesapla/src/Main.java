import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double fiyat,kdvOran1=0.18,kdvOran2=0.08,kdvliFiyat,kdvliFiyat2;
        Scanner input=new Scanner(System.in);
        System.out.println("Ürünün fiyatını giriniz: ");
        fiyat=input.nextDouble();
        System.out.println("Ürün fiyatı = "+fiyat);

        if (fiyat<1000){
            kdvliFiyat=fiyat*kdvOran1;
            fiyat+=kdvliFiyat;
            System.out.println("Ürünun kdv'li fiyatı = "+fiyat);
        }
        else{
            kdvliFiyat2=fiyat*kdvOran2;
            fiyat+=kdvliFiyat2;
            System.out.println("Ürünun kdv'li fiyatı = "+fiyat);

        }







    }
}