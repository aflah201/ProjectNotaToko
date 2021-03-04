package projectnotatoko;

// Import Package Scanner, dan Format Mata Uang
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MainNota {
    
    static DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    static DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    
    static int inputJumlahData;
    static int ulang = 1, inputBarang, inputQty;
    
    static int hasil1,hasil2,hasil3,hasil4,hasil5,hasil6,hasil7,hasil8;
    
    static int[] harga = {5000, 3000, 4000, 10000, 5000, 8000, 15000, 2000};
    static Scanner input = new Scanner(System.in);
    
//    static int[] kode = {1,2,3,4,5,6,7,8};
//    static int[] barang = new int[9];
//    static int[] quantity = new int[9];
    
    public static void main(String[] args) {
        
        header();
        informasiBarang();
        input();
//        keteranganBarang();
        jumlahHarga();
        
    }
    
    public static void informasiBarang(){
        formatRp.setCurrencySymbol("Rp. ");
//        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        System.out.println("Kode Barang           ||            Harga ");
        System.out.println("1. Susu               ||        " + kursIndonesia.format(harga[0]));
        System.out.println("2. Kopi               ||        " + kursIndonesia.format(harga[1]));
        System.out.println("3. Teh                ||        " + kursIndonesia.format(harga[2]));
        System.out.println("4. Jus                ||        " + kursIndonesia.format(harga[3]));
        System.out.println("5. Sosis              ||        " + kursIndonesia.format(harga[4]));
        System.out.println("6. Mie Instan         ||        " + kursIndonesia.format(harga[5]));
        System.out.println("7. Nasi Goreng        ||        " + kursIndonesia.format(harga[6]));
        System.out.println("8. Kerupuk            ||        " + kursIndonesia.format(harga[7]));
        System.out.println("----------------------------------------------");
        
    }
    
    public static void header(){
        
        System.out.println("                TOKO MAJU JAYA                ");
        System.out.println("            PT. MAJU JAYA PRICOPALO           ");
        System.out.println("            JL. KH. SULAIMAN NO. 48           ");
        System.out.println("         GEMURUNG - GEDANGAN - SIDOARJO       ");
        System.out.println("----------------------------------------------");
        
    }
    
    public static void input(){
        
        System.out.print("Masukkan Jumlah Belanja       : ");
        inputJumlahData = input.nextInt();
        System.out.println();
        
        while(ulang <= inputJumlahData){
            
            System.out.print("Masukkan Kode Barang ke-" + ulang + "     : ");
            inputBarang = input.nextInt();
            System.out.print("Masukkan Quantity Barang ke-" + ulang + " : ");
            inputQty = input.nextInt();
            
            ulang++;
            
            hargaBarang();
            keteranganBarang();
            System.out.println();
        }
//        System.out.println("------------------------------");
    }
    
    public static void keteranganBarang(){      
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        switch(inputBarang){
            case 1:
                System.out.println("Susu        " + (kursIndonesia.format(harga[0]) + " x " + inputQty) + "  = " + kursIndonesia.format(hasil1));
                break;
            case 2:
                System.out.println("Kopi        " + (kursIndonesia.format(harga[1]) + " x " + inputQty) + "  = " + kursIndonesia.format(hasil2));
                break;
            case 3:
                System.out.println("Teh         " + (kursIndonesia.format(harga[2]) + " x " + inputQty) + "  = " + kursIndonesia.format(hasil3));
                break;
            case 4:
                System.out.println("Jus         " + (kursIndonesia.format(harga[3]) + " x " + inputQty) + "  = " + kursIndonesia.format(hasil4));
                break;
            case 5:
                System.out.println("Sosis       " + (kursIndonesia.format(harga[4]) + " x " + inputQty) + "  = " + kursIndonesia.format(hasil5));
                break;
            case 6:
                System.out.println("Mie Instan  " + (kursIndonesia.format(harga[5]) + " x " + inputQty) + "  = " + kursIndonesia.format(hasil6));
                break;
            case 7:
                System.out.println("Nasi Goreng " + (kursIndonesia.format(harga[6]) + " x " + inputQty) + " = " + kursIndonesia.format(hasil7));
                break;
            case 8:
                System.out.println("Kerupuk     " + (kursIndonesia.format(harga[7]) + " x " + inputQty) + "  = " + kursIndonesia.format(hasil8));
                break;
            default:
                System.out.print("Kode Tidak Sesuai ");
                break;
        }
    }
    
    public static void hargaBarang(){
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        switch(inputBarang){
            case 1:
//                System.out.println((kursIndonesia.format(harga[0]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[0]*inputQty));
                hasil1 = harga[0]*inputQty;
                break;
            case 2:
//                System.out.println((kursIndonesia.format(harga[1]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[1]*inputQty));
                hasil2 = harga[1]*inputQty;
                break;
            case 3:
//                System.out.println((kursIndonesia.format(harga[2]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[2]*inputQty));
                hasil3 = harga[2]*inputQty;
                break;
            case 4:
//                System.out.println((kursIndonesia.format(harga[3]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[3]*inputQty));
                hasil4 = harga[3]*inputQty;
                break;
            case 5:
//                System.out.println((kursIndonesia.format(harga[4]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[4]*inputQty));
                hasil5 = harga[4]*inputQty;
                break;
            case 6:
//                System.out.println((kursIndonesia.format(harga[5]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[5]*inputQty));
                hasil6 = harga[5]*inputQty;
                break;
            case 7:
//                System.out.println((kursIndonesia.format(harga[6]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[6]*inputQty));
                hasil7 = harga[6]*inputQty;
                break;
            case 8:
//                System.out.println((kursIndonesia.format(harga[7]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[7]*inputQty));
                hasil8 = harga[7]*inputQty;
                break;
            default:
                System.out.print("Kode Tidak Sesuai ");
                break;
        }
    }
    
    public static void jumlahHarga(){
        
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        int totalHarga = hasil1+hasil2+hasil3+hasil4+hasil5+hasil6+hasil7+hasil8;
        
        System.out.println("----------------------------------------------");
        System.out.println("Jumlah Total Belanja          = "+ kursIndonesia.format(totalHarga));
    }
}
