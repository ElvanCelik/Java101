import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Dairenin alanını ve çevresini hesaplayan program
        int yaricap,alfaAcisi;
        double pi=3.14,cevre,alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz = ");
        yaricap=input.nextInt();

        System.out.print("Hesaplamak istediğiniz parçanın merkez açısını giriniz = ");
        alfaAcisi=input.nextInt();

        cevre=2*pi*yaricap;
        System.out.println("Dairenin cevresi = " +cevre);

        alan=(pi * (yaricap*yaricap) * alfaAcisi) / 360;
        System.out.println("Dairenin alanı = " +alan);


    }
}