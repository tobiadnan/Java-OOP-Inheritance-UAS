package transaction.laptop;

import transaction.tools.Laptop;

public class Acer extends Laptop {
    public void spesifikasi(){
        super.setMerk("Acer");
        super.setJenis("Aspire 5 A514");
        super.setRam("4GB");
        super.setHarga(7_150_000);

        System.out.println("Laptop\t: "+super.getMerk());
        System.out.println("Jenis\t: "+super.getJenis());
        System.out.println("RAM \t: "+super.getRam());
        System.out.println("harga\t: "+super.getHarga());
    }
}
