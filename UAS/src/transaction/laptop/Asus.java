package transaction.laptop;

import transaction.tools.Laptop;

public class Asus extends Laptop {
    public void spesifikasi(){
        super.setMerk("Asus");
        super.setJenis("Asus VivoBook A146");
        super.setRam("4GB");
        super.setHarga(6_500_000);

        System.out.println("Laptop\t: "+super.getMerk());
        System.out.println("Jenis\t: "+super.getJenis());
        System.out.println("RAM \t: "+super.getRam());
        System.out.println("harga\t: "+super.getHarga());
    }
}
