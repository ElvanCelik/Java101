import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Taksimetre KM başına 2.20 TL tutmaktadır.
          Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
          Taksimetre açılış ücreti 10 TL'dir.*/
        int km;
        double perKm=2.20,startPrice=10,total;
        Scanner input= new Scanner(System.in);
        System.out.print("Gidilen yolu km cinsinden giriniz = ");
        km=input.nextInt();

        total=km*perKm;
        total+=startPrice;

        total=(total<20) ? 20 : total;
        System.out.println("Ödenecek tutar = "+total);

    }
}