import java.util.Scanner;

public class main{
    public static void main(String[] args)
    {
        Scanner masukan = new Scanner(System.in);   
        System.out.println("    =======Kalkulator sederhana========    ");
        System.out.println("==================================================");
        System.out.println("Bangun Datar                        Bangun Ruang  ");
        System.out.println("1.Persegi                           6.kubus       ");
        System.out.println("2.Persegi Panjang                   7.Balok       ");
        System.out.println("3.Segitiga                                        ");
        System.out.println("4.Lingkaran                                       ");
        System.out.println("5.Belah Ketupat                                   ");
        System.out.println("==================================================");
        int input  =  masukan.nextInt();
        System.out.println("-----------------");
        switch(input) {
            case 1:
                System.out.println("--------------------");
                System.out.println("1.Luas    2.Keliling");
                System.out.println("Luas Persegi\nRumus =sisi*sisi\n\n\nMasukan luasnya  :");
                System.out.println("Keliling Persegi\nRumus = sisi + sisi + sisi + sisi\n\n\nMasukan kelilingnya  :");
                break;
            case 2:
                System.out.println("1.Luas    2.Keliling");
                System.out.println("Luas PersegiPanjang\nRumus = panjang * lebar\n\n\nMasukan luasnya  :");
                System.out.println("Keliling PersegiPanjang\nRumus = panjang + panjang + lebar + lebar \n\n\nMasukan kelilingnya :");
                break;
            case 3:
                System.out.println("1.Luas    2.Keliling");
                System.out.println("Luas Segitiga\nRumus = 1/2 * alas * tinggi \n\n\nMasukan luasnya  :");
                System.out.println("Keliling Segitiga\nRumus =sisi + sisi + sisi \n\n\nMasukan kelilingnya :");
                break;
            case 4:
                System.out.println("1.Luas    2.Keliling");
                System.out.println("Luas Lingkaran\nRumus = phi * r^2 \n\n\nMasukan luasnya  :");
                System.out.println("Keliling Lingkaran\nRumus =2 * phi * r\n\n\nMasukan kelilingnya :");
                break;
            case 5:
                System.out.println("1.Luas    2.Keliling");
                System.out.println("Luas BelahKetupat\nRumus = 1/2 * diagonal1 * diagonal2 \n\n\nMasukan luasnya  :");
                System.out.println("Keliling BelahKetupat\nRumus = 4 * sisi\n\n\nMasukan kelilingnya :");
                break;
            case 6:
                System.out.println("Volume Kubus\n = sisi * sisi * sisi \n\n\n\nMasukan volumenya :");
                System.out.println("1.Luas    2.Keliling");
                System.out.println("Luas Kubus\nRumus = 6 * sisi * sisi * sisi  \n\n\nMasukan luasnya  :");
                System.out.println("Keliling Kbusu\nRumus = 12  * sisi \n\n\nMasukan kelilingnya :");
                break;
            case 7:
                System.out.println("Volume Balok\n = panjang * lebar * tinggi \n\n\n\nMasukan volumenya :");
                System.out.println("1.Luas    2.Keliling");
                System.out.println("Luas Kubus\nRumus = 2 * (pl + lt + pt)  \n\n\nMasukan luasnya  :");
                System.out.println("Keliling Kbusu\nRumus = 4  * (panjang + lebar + tinggi) \n\n\nMasukan kelilingnya :");
                break;
            default:
                System.out.println("Rumus yang anda Masukan tidak Tersedia");
        } 
    }
}