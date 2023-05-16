import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        number = input.nextInt();
        int basamakSayac = 0;
        int tempNumber = number;
        int basamakDegeri;
        int sonuc = 0;
        int basamakUssu;
        //Basamak sayısını bulalım;
        while (tempNumber != 0) {
            tempNumber /= 10;
            basamakSayac++;
        }

        tempNumber = number;
        //Sayının son basamağını bulma;
        while (tempNumber != 0) {
            basamakDegeri = tempNumber % 10;
            basamakUssu = 1;
            for (int i = 1; i <= basamakSayac; i++) {
                basamakUssu *= basamakDegeri;
            }
            sonuc += basamakUssu;
            tempNumber /= 10;
        }
        if (sonuc == number) {
            System.out.println(number + " Armstrong Sayıdır");
        } else {
            System.out.println(number + " Armstrong Sayı değildir");
        }
    }
}