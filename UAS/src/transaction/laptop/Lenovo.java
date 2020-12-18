package transaction.laptop;

import transaction.tools.Laptop;

public class Lenovo extends Laptop {
    public void spesifikasi(){
        super.setMerk("Lenovo");
        super.setJenis("ThinkPad X250");
        super.setRam("8GB");
        super.setHarga(19_050_000);

        System.out.println("Laptop\t: "+super.getMerk());
        System.out.println("Jenis\t: "+super.getJenis());
        System.out.println("RAM \t: "+super.getRam());
        System.out.println("harga\t: "+super.getHarga());
    }
}
