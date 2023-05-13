import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Manav Kasa programı
        //ürünlerin fiyatlarını ve girilecek kg değerleri için değişkenlerimizi tanımlayalım;
        double fiyatArmut=2.14,fiyatElma=3.67,fiyatDomates=1.11,fiyatMuz=0.95,fiyatPatlican=5.00;
        double armut,elma,domates,muz,patlican,toplamTutar;
        //Kullanıcıdan kg değerlerini alalım;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut kaç kilo? ");
        armut=input.nextDouble();
        System.out.print("Elma kaç kilo? ");
        elma=input.nextDouble();
        System.out.print("Domates kaç kilo? ");
        domates=input.nextDouble();
        System.out.print("Muz kaç kilo? ");
        muz=input.nextDouble();
        System.out.print("Patlıcan kaç kilo? ");
        patlican=input.nextDouble();
        //fiyat değişkenleri içine değerleri atayıp toplam tutarı hesaplayalım
        fiyatArmut*=armut;
        fiyatElma*=elma;
        fiyatDomates*=domates;
        fiyatMuz*=muz;
        fiyatPatlican*=patlican;
        toplamTutar=fiyatArmut+fiyatElma+fiyatDomates+fiyatMuz+fiyatPatlican;
        System.out.println("Toplam Tutar : "+toplamTutar +" TL");

    }
}



