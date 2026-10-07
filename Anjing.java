class Anjing extends Hewan {
    String jenisGolongan;

    Anjing(String nama, int umur, String jenisGolongan) {
        super(nama, umur);
        this.jenisGolongan = jenisGolongan;
    }

     void tampilData() {
        System.out.println("Nama Anjing     : " + nama);
        System.out.println("Umur            : " + umur);
        System.out.println("Jenis Golongan  : " + jenisGolongan);
    }

   
}