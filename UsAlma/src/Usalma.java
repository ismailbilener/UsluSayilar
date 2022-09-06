import java.util.Scanner;

public class Usalma {
    static int Usfonksiyon(int sayi,int us){
        if (sayi==1 || us==0){
            return 1;
        }
        return Usfonksiyon(sayi,us-1)*sayi;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int taban,usSayi;
        System.out.print("Taban sayi giriniz: ");
        taban=input.nextInt();

        System.out.print("Üslü sayısını giriniz: ");
        usSayi=input.nextInt();

        System.out.println(Usfonksiyon(taban,usSayi));
    }
}
