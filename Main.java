import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner hh = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Pendataan dan Pembayaran Iuran Warga");
        System.out.println("====================================");

        System.out.println("1. Input Data Warga");
        System.out.println("2. Input Iuran Warga");

        System.out.println("PILIHAN MENU : ");

        int pilihan = hh.nextInt();
        Parent h = new Parent();
        Child h2 = new Child();
        if (pilihan == 1){
            h.dataWarga();
        }else if (pilihan == 2){
            h2.dataWarga2();
        }
    }
}