public class Main {
    public static void main(String[] args) {

        byte abc=100;
        System.out.println(abc);
        char karakter= 119;
        System.out.println(karakter);

        boolean mantik= true;
        System.out.println(mantik);
        System.out.println("elvan");

        int numberOne=10;
        numberOne=5;
        System.out.println(numberOne);

        int numberTwo, numberThree=6;
        numberTwo=3;
        int numberFour=numberThree+numberTwo;
        System.out.println(numberFour);

        int kisaKenar=10, uzunKenar=20;
        int cevre= 2* (kisaKenar+uzunKenar);
        int alan= kisaKenar*uzunKenar;
        System.out.println("cevre : "+ cevre);
        System.out.println("alan : "+alan);

        float t, x;
        t = 35 + 5;
        x = t / 4;
        System.out.println(x);

        int a = 1, y = 2, r=3;
        r *= a + y;
        System.out.println(r);

        byte b = -12;
        int c = -5;
        System.out.print(b%c);
        }
    }
