import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //boy ve kilo değişkenini double cinsinden tanımlıyoruz.
        double boy,kilo,vki;
        //Kullanıcıdan bu değerleri almak için scanner sınıfını belirleyip değerleri alalım:
        Scanner input=new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz (Örn. 1,72) = ");
        boy=input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz (Örn. 68,5) = ");
        kilo=input.nextDouble();

        //Bu değerlei formüle ekleyerek çözümü bulalım;
        //Formül= Kilo (kg) / Boy(m) * Boy(m)

        vki=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz = "+vki);

    }
}