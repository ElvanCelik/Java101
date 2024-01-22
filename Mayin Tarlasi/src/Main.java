import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row,column;
        System.out.println("Mayın tarlasına hoş geldiniz!");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz! ");
        System.out.print("Satır sayısı : ");
        row=scan.nextInt();
        System.out.print("Sütun sayısı : ");
        column=scan.nextInt();

        MayinTarlasi mayin =new MayinTarlasi(row,column);
        mayin.run();
    }
}