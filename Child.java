import java.util.Scanner;
public class Child extends Parent{
    void dataWarga2(){
        System.out.println("--------------------oOo--------------------");
        System.out.println("*** Data Iuran Pokok ***");
        System.out.println("NIK  => "+ nik);
        
        System.out.println("Masukan Iuran Sampah");
        int is = bj.nextInt();
        System.out.println("Masukan Iuran Keamanan");
        int ik = bj.nextInt();
        System.out.println();

        System.out.println("*** Data Iuran Sekunder ***");
        System.out.println("Masukan Sumbangan");
        int sumbangan = bj.nextInt();
        
        System.out.println("Lanjut Bayar Iuran ?");
        Scanner input = new Scanner(System.in);
        String Lanjut1 = "";
        Lanjut1=input.nextLine();
        Child h2 = new Child();
        if (Lanjut1.equals("tidak")|| Lanjut1.equals("Tidak")|| Lanjut1.equals("T")|| Lanjut1.equals("t")) {
            int total;
            total = is + ik + sumbangan;
            System.out.println("||NIK                           ||" + Nik());
            System.out.println();
            System.out.println("||Total Pembayaran Iuran Warga  ||Rp. " + total);
            System.out.println("Terimakasi " + Nama() + " Iuran Anda sudah di Bayarkan");
        }else if (Lanjut1.equals("ya")|| Lanjut1.equals("Ya")|| Lanjut1.equals("Y")|| Lanjut1.equals("y")){
            h2.dataWarga2();
        }
    }
}
