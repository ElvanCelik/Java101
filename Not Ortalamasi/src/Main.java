import java.util.Scanner;
public class Main {
     public static void main(String[]args){
        //Değişkenleri oluşturuyoruz
        int mat,fizik,turkce,kimya,tarih,muzik;

        //Scanner sınıfını tanımlıyoruz
        Scanner input= new Scanner(System.in);

        //Kullanıcıdan not grişlerini alıyoruz
        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        //Ortalama hesaplayıp ekrana yazalım
        int toplam= mat+fizik+kimya+turkce+muzik+tarih;
        double ortalama= toplam/6.0;
        System.out.println("ortalamanız="+ortalama);

         System.out.println(ortalama>=50? "gectiniz":"kaldınız");

    }
}
