import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;

        //Kullanıcı adı ve şifreyi kullanıcıdan alalım
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();
        //Kullanıcı adı ve şifre sistemdekine uyuşuyor mu:
        if (userName.equals("elvan") && password.equals("celik")) {
            System.out.println("Giriş Yaptınız!");
        } else if (userName.equals("elvan")) {
            System.out.println("Şifreniz yanlış, tekrar deneyiniz!");
            System.out.println("Şifrenizi yenilemek ister misiniz : Y/N");
            String answer = input.nextLine();
            switch (answer) {
                case ("Y"):
                    System.out.print("Enter your new password: ");
                    newPassword = input.nextLine();

                    if (newPassword.equals(password)) {
                        System.out.println("Şifreniz eski şifrenizle aynı olmamalı, tekrar deneyiniz!");
                        break;
                    } else{
                        System.out.println("Şifreniz başarıyla değiştirildi!");
                    }
                    break;
                case ("N"):
                    System.out.println("Hesabınıza girmeyi tekrar deneyiniz!");
                    break;
            }

        }


    }
}