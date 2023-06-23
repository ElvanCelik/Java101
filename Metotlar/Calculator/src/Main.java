import java.util.Scanner;

public class Main {
    static int toplam(int a, int b) {
        int sonuc = a + b;
        System.out.println("Toplam = " + sonuc);
        return sonuc;
    }

    static int fark(int a, int b) {
        int sonuc = a - b;
        System.out.println("Fark = " + sonuc);
        return sonuc;
    }

    static int carpim(int a, int b) {
        int sonuc = a * b;
        System.out.println("Çarpım = " + sonuc);
        return sonuc;
    }

    static int bolum(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı 0'dan farklı olmalı!");
            return 0;
        }
        int sonuc = a / b;
        System.out.println("Bölüm = " + sonuc);
        return sonuc;
    }
    static int power(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    static int mod(int a, int b){
        return a%b;
    }
    static void cevreAlan(int a,int b){
        int cevre=2*(a+b);
        int alan=a*b;
        System.out.println("Çevre : "+ cevre);
        System.out.println("Alan : "+alan);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String operations =
                "1 - Toplama\n" +
                        "2 - Çıkarma\n" +
                        "3 - Çarpma\n" +
                        "4 - Bölme\n" +
                        "5 - Üslü Sayı Alma\n" +
                        "6 - Mod Alma\n" +
                        "7 - Dikdörtgen Alan ve Çevre Hesabı\n" +
                        "8 - Çıkış Yap";
        System.out.println(operations);
        while (true) {
            System.out.println("Bir işlem seçiniz : ");
            select = input.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("İlk sayıyı giriniz : ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    toplam(a, b);
                    break;
                case 2:
                    fark(a, b);
                    break;
                case 3:
                    carpim(a, b);
                    break;
                case 4:
                    bolum(a, b);
                    break;
                case 5:
                    System.out.println("Üs hesabı :" +power(a,b));
                    break;
                case 6:
                    System.out.println("Mod : "+mod(a,b));
                    break;
                case 7:
                    cevreAlan(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz!");

            }


        }
        System.out.println("Güle Güle!");


    }
}