import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        // Formül: Kilo (kg) / Boy(m) * Boy(m)

        double boy, kilo, vucutkitleIndeksi;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        vucutkitleIndeksi = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + vucutkitleIndeksi);
    }
}