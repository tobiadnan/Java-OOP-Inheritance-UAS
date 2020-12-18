package transaction.laptop;

import transaction.tools.Laptop;

public class McBook extends Laptop {
    public void spesifikasi(){
        super.setMerk("Apple");
        super.setJenis("McBook Pro 2020");
        super.setRam("8GB");
        super.setHarga(10_000_000);

        System.out.println("Laptop\t: "+super.getMerk());
        System.out.println("Jenis\t: "+super.getJenis());
        System.out.println("RAM \t: "+super.getRam());
        System.out.println("harga\t: "+super.getHarga());
    }
}
