package transaction;

import transaction.laptop.Acer;
import transaction.laptop.Asus;
import transaction.laptop.Lenovo;
import transaction.laptop.McBook;
import transaction.tools.TextMenu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        McBook mcBook = new McBook();
        Asus asus = new Asus();
        Lenovo lenovo = new Lenovo();
        Acer acer = new Acer();

        // mendapatkan pilihan user
        TextMenu.showMenu();
        int input = inputUser.nextInt();

        if (input==1756){
            TextMenu.border3();
            mcBook.spesifikasi();
            TextMenu.border3();

            System.out.print("Lanjutkan >> (y / n)");
            String isLanjutkan = inputUser.next();

            if (isLanjutkan.equalsIgnoreCase("y")){
                System.out.print("\nMasukan Jumlah Pesanan >> ");
                int jumlah = inputUser.nextInt();

                TextMenu.border1();
                mcBook.spesifikasi();
                TextMenu.border2();
                System.out.println("Jumlah pesanan   : "+jumlah);
                System.out.println("Total Pembayaran : "+jumlah*mcBook.getHarga());
                TextMenu.border2();
            }
        }else if (input==6755){
            TextMenu.border3();
            asus.spesifikasi();
            TextMenu.border3();

            System.out.print("Lanjutkan >> (y / n)");
            String isLanjutkan = inputUser.next();

            if (isLanjutkan.equalsIgnoreCase("y")){
                System.out.print("\nMasukan Jumlah Pesanan >> ");
                int jumlah = inputUser.nextInt();

                TextMenu.border1();
                asus.spesifikasi();
                TextMenu.border2();
                System.out.println("Jumlah pesanan   : "+jumlah);
                System.out.println("Total Pembayaran : "+jumlah*asus.getHarga());
                TextMenu.border2();
            }
        }else if (input==3240){
            TextMenu.border3();
            lenovo.spesifikasi();
            TextMenu.border3();

            System.out.print("Lanjutkan >> (y / n)");
            String isLanjutkan = inputUser.next();

            if (isLanjutkan.equalsIgnoreCase("y")){
                System.out.print("\nMasukan Jumlah Pesanan >> ");
                int jumlah = inputUser.nextInt();

                TextMenu.border1();
                lenovo.spesifikasi();
                TextMenu.border2();
                System.out.println("Jumlah pesanan   : "+jumlah);
                System.out.println("Total Pembayaran : "+jumlah*lenovo.getHarga());
                TextMenu.border2();
            }
        }else if(input==1209){
            TextMenu.border3();
            acer.spesifikasi();
            TextMenu.border3();

            System.out.print("Lanjutkan >> (y / n)");
            String isLanjutkan = inputUser.next();

            if (isLanjutkan.equalsIgnoreCase("y")){
                System.out.print("\nMasukan Jumlah Pesanan >> ");
                int jumlah = inputUser.nextInt();

                TextMenu.border1();
                acer.spesifikasi();
                TextMenu.border2();
                System.out.println("Jumlah pesanan   : "+jumlah);
                System.out.println("Total Pembayaran : "+jumlah*acer.getHarga());
                TextMenu.border2();
            }
        }else if (input==0){
            System.exit(0);
        }else {
            System.out.println("\n==>Input tidak sesuai<==\n");
        }
    }
}
