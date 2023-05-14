import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthYear,zodiac;
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        birthYear=input.nextInt();
        zodiac=birthYear%12;
        if (zodiac==0){
            System.out.print("Çin Zodyağı Burcunuz : Maymun");
        } else if (zodiac==1) {
            System.out.print("Çin Zodyağı Burcunuz : Horoz");
        }else if (zodiac==2) {
            System.out.print("Çin Zodyağı Burcunuz : Köpek");
        }else if (zodiac==3) {
            System.out.print("Çin Zodyağı Burcunuz : Domuz");
        }else if (zodiac==4) {
            System.out.print("Çin Zodyağı Burcunuz : Fare");
        }else if (zodiac==5) {
            System.out.print("Çin Zodyağı Burcunuz : Öküz");
        }else if (zodiac==6) {
            System.out.print("Çin Zodyağı Burcunuz : Kaplan");
        }else if (zodiac==7) {
            System.out.print("Çin Zodyağı Burcunuz : Tavşan");
        }else if (zodiac==8) {
            System.out.print("Çin Zodyağı Burcunuz : Ejderha");
        }else if (zodiac==9) {
            System.out.print("Çin Zodyağı Burcunuz : Yılan");
        }else if (zodiac==10) {
            System.out.print("Çin Zodyağı Burcunuz : At");
        }else if (zodiac==11) {
            System.out.print("Çin Zodyağı Burcunuz : Koyun");
        }

    }
}