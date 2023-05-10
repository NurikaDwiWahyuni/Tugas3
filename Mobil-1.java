public class Mobil {

    protected String jenis;
    protected String merk;
    protected int tahunProduksi;


    public Mobil(String jenis, String merk, int tahunProduksi) {
        this.jenis = jenis;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }


    public void info() {
        System.out.println("Jenis mobil: " + jenis);
        System.out.println("Merk mobil: " + merk);
        System.out.println("Tahun produksi: " + tahunProduksi);
    }


    public final void dijual() {
        System.out.println("Mobil ini dijual");
    }
}

class Sedan extends Mobil {
    private int kapasitasMesin;


    public Sedan(String jenis, String merk, int tahunProduksi, int kapasitasMesin) {
        super(jenis, merk, tahunProduksi);
        this.kapasitasMesin = kapasitasMesin;
    }

    public void info() {
        super.info();
        System.out.println("Kapasitas mesin: " + kapasitasMesin + " cc");
    }


    public void info(int harga) {
        super.info();
        System.out.println("Kapasitas mesin: " + kapasitasMesin + " cc");
        System.out.println("Harga: " + harga);
    }


    public void dijual(String alamat) {
        super.dijual();
        System.out.println("Alamat penjualan: " + alamat);
    }
}


class Main {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan("Sedan", "Toyota", 2022, 1500);
        sedan1.info();
        System.out.println();

        Sedan sedan2 = new Sedan("Sedan", "Honda", 2023, 1800);
        sedan2.info(300000000);
        System.out.println();

        sedan1.dijual("Jl. Sudirman No. 10");
        System.out.println();

        // Variabel jenis bersifat protected dan dapat diakses dari kelas turunan
        System.out.println("Jenis mobil: " + sedan1.jenis);
    }
}

