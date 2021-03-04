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
    
    static int[] harga = {5000, 3000, 4000, 10000, 5000, 8000, 15000, 2000};
    static Scanner input = new Scanner(System.in);
    
//    static int[] kode = {1,2,3,4,5,6,7,8};
//    static int[] barang = new int[9];
//    static int[] quantity = new int[9];
    
    public static void main(String[] args) {
        
        header();
        informasiBarang();
        input();
    }
    
    public static void informasiBarang(){
        formatRp.setCurrencySymbol("Rp. ");
//        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        System.out.println("Kode Barang   ||  Harga Barang");
        System.out.println("1. Susu       ||  " + kursIndonesia.format(harga[0]));
        System.out.println("2. Kopi       ||  " + kursIndonesia.format(harga[1]));
        System.out.println("3. Teh        ||  " + kursIndonesia.format(harga[2]));
        System.out.println("4. Jus        ||  " + kursIndonesia.format(harga[3]));
        System.out.println("5. Sosis      ||  " + kursIndonesia.format(harga[4]));
        System.out.println("6. Mie Instan ||  " + kursIndonesia.format(harga[5]));
        System.out.println("7. Nasi Goreng||  " + kursIndonesia.format(harga[6]));
        System.out.println("8. Kerupuk    ||  " + kursIndonesia.format(harga[7]));
        System.out.println("------------------------------");
        
    }
    
    public static void header(){
        
        System.out.println("        TOKO MAJU JAYA");
        System.out.println("   PT. MAJU JAYA PRICOPALO");
        System.out.println("   JL. KH. SULAIMAN NO. 48");
        System.out.println("GEMURUNG - GEDANGAN - SIDOARJO");
        System.out.println("------------------------------");
        
    }
    
    public static void input(){
        
        System.out.print("Masukkan Jumlah Barang : ");
        inputJumlahData = input.nextInt();
        System.out.println();
        
        while(ulang <= inputJumlahData){
            
            System.out.print("Masukkan Kode Barang ke-" + ulang + "     : ");
            inputBarang = input.nextInt();
            System.out.print("Masukkan Quantity Barang ke-" + ulang + " : ");
            inputQty = input.nextInt();
            
            ulang++;
            System.out.println("------------------------------");
            keteranganBarang();
            hargaBarang();
            System.out.println();
        }
        
    }
    
    public static void keteranganBarang(){      
        
        switch(inputBarang){
            case 1:
                System.out.print("Susu ");
                break;
            case 2:
                System.out.print("Kopi ");
                break;
            case 3:
                System.out.print("Teh ");
                break;
            case 4:
                System.out.print("Jus ");
                break;
            case 5:
                System.out.print("Sosis ");
                break;
            case 6:
                System.out.print("Mie Instan ");
                break;
            case 7:
                System.out.print("Nasi Goreng ");
                break;
            case 8:
                System.out.print("Kerupuk ");
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
                System.out.println((kursIndonesia.format(harga[0]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[0]*inputQty));
                break;
            case 2:
                System.out.println((kursIndonesia.format(harga[1]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[1]*inputQty));
                break;
            case 3:
                System.out.println((kursIndonesia.format(harga[2]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[2]*inputQty));
                break;
            case 4:
                System.out.println((kursIndonesia.format(harga[3]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[3]*inputQty));
                break;
            case 5:
                System.out.println((kursIndonesia.format(harga[4]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[4]*inputQty));
                break;
            case 6:
                System.out.println((kursIndonesia.format(harga[5]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[5]*inputQty));
                break;
            case 7:
                System.out.println((kursIndonesia.format(harga[6]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[6]*inputQty));
                break;
            case 8:
                System.out.println((kursIndonesia.format(harga[7]) + " x " + inputQty) + " = " + kursIndonesia.format(harga[7]*inputQty));
                break;
            default:
                System.out.print("Kode Tidak Sesuai ");
                break;
        }
    }
    
    public static void jumlahHarga(){
        
    }
}
