import java.util.Scanner;
public class Parent {
    Scanner bj = new Scanner(System.in);
    String nama,nik,alamat,nohp;
    String pekerjaan,akantor;
    String status,nmpasangan, jmlank;
    void isiData(String Nama_Warga,String Nik_Warga) {
        nama = Nama_Warga;
        nik = Nik_Warga;
    }
    String Nama(){
        return nama;
    }
    String Nik(){
        return nik;
    }
    void dataWarga(){
        Parent a = new Parent();
        System.out.println("--------------------oOo--------------------");
        System.out.println("*** Data Warga *** ");
        System.out.println("Masukan Nama ");
        String nama = bj.nextLine();
        
        System.out.println("Masukan NIK ");
        String nik= bj.nextLine();
        a.isiData(nama, nik);
        
        System.out.println("Masukan Alamat  ");
        String alamat = bj.nextLine();
        
        System.out.println("Masukan No. Tlp ");
        String nohp = bj.nextLine();
        
        System.out.println("--------------------oOo--------------------");
        System.out.println("*** Data Pekerjaan *** ");
        System.out.println("Masukan Pekerjaan  ");
        String pekerjaan = bj.nextLine();
        
        System.out.println("Masukan Alamat Kantor  ");
        String akantor = bj.nextLine();
        
        System.out.println("--------------------oOo--------------------");
        System.out.println("*** Data Status *** ");
        System.out.println("Masukan Status  ");
        String status = bj.nextLine();
        
        System.out.println("Masukan Nama Suami/Istri  ");
        String nmpasangan = bj.nextLine();
        
        System.out.println("Masukan Jumlah Anak  ");
        String jmlank = bj.nextLine();
        System.out.println();
        
        System.out.println("Lanjut Bayar Iuran ? ");
        Child h2 = new Child();
        String Lanjut=bj.nextLine();
        if (Lanjut.equals("ya")|| Lanjut.equals("Ya")|| Lanjut.equals("Y")|| Lanjut.equals("y")){
                h2.dataWarga2();
        }
    }
}



