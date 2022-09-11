import java.util.Scanner;

public class Sınıfıgeçmedurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz :");
        mat= input.nextInt();
        if (mat<0 || mat>100){
            System.out.println("Yanlış bir sayı aralığı girdiniz, Tekrar giriniz!!");
            System.out.println("Matematik notunuzu tekrar giriniz :");
            mat= input.nextInt();
        }
        System.out.println("Fizik notunuzu giriniz :");
        fizik= input.nextInt();
        if (fizik<0 || fizik>100){
            System.out.println("Yanlış bir sayı aralığı girdiniz, Tekrar giriniz!!");
            System.out.println("Fizik notunuzu tekrar giriniz :");
            fizik= input.nextInt();
        }
        System.out.println("Türkçe notunuzu giriniz :");
        turkce= input.nextInt();
        if (turkce<0 || turkce>100){
            System.out.println("Yanlış bir sayı aralığı girdiniz, Tekrar giriniz!!");
            System.out.println("Türkçe notunuzu tekrar giriniz :");

        }

        System.out.println("Kimya notunuzu giriniz :");
        kimya= input.nextInt();
        if (kimya<0 || kimya>100){
            System.out.println("Yanlış bir sayı aralığı girdiniz, Tekrar giriniz!!");
            System.out.println("Kimya notunuzu tekrar giriniz :");
            kimya= input.nextInt();
        }
        System.out.println("Müzik notunuzu giriniz :");
        muzik   = input.nextInt();
        if (muzik<0 || muzik>100){
            System.out.println("Yanlış bir sayı aralığı girdiniz, Tekrar giriniz!!");
            System.out.println("Müzik notunuzu tekrar giriniz :");
            kimya= input.nextInt();
        }
        double avarage= (mat+fizik+turkce+muzik+kimya)/5 ;
        if (avarage<=55) {
            System.out.println("Ne yazık ki, Ortalamanız düşük\n Sınfıta kaldınız");
            System.out.println("Ortalamanız : " + avarage);
        }
        else {
            System.out.println("Tebrikler, sınıfı geçtiniz!!!");
            System.out.println("Ortalamanız : " + avarage);
        }
    }
}
