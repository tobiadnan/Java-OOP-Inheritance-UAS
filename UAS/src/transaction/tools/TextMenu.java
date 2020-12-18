package transaction.tools;

public class TextMenu extends Laptop {
    public static void showMenu(){
        System.out.println("\n=======   ROSMA LAPTOP  ========");
        System.out.println("Menyediakan berbagai merk laptop");
        System.out.println("================================");
        System.out.println("1756 ==> Apple McBook");
        System.out.println("6755 ==> Asus");
        System.out.println("3240 ==> Lenovo");
        System.out.println("1209 ==> Acer");
        System.out.println("================================");
        System.out.println("Masukan nomor barang pesanan anda !");
        System.out.println("0 ==>\tKeluar");
        System.out.println("================================");
        System.out.print("Masukan nomor barang >>> ");
    }
    public static void border1(){
        System.out.println("\n============================");
    }
    public static void border2(){
        System.out.println("============================");
    }
    public static void border3(){
        System.out.println("===================");
    }
}
