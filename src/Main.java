import java.util.Scanner;
//Java ile Matematik,Fizik,Kimya,Türkçe,Tarih,Müzik derslerinin ınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayan program
public class Main {
    public static void main(String[] args) {
        //Değişken oluştur 1.adım
        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfımızı tanımladık
        Scanner inp=new Scanner(System.in);

        //Kullanıcıdan Değer al 2.adım
        System.out.print("Matematik notunuz: ");
        mat=inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik=inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya=inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce=inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih=inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik=inp.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=toplam/6;

        System.out.println("Ortalamanız: "+sonuc);

        System.out.println(sonuc > 60 ? "Geçtiniz" : "Kaldınız");

    }
}
