class Kucing extends Hewan {
    String ras;
    
    Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    void tampilData() {
        System.out.println("Nama Kucing : " + nama);
        System.out.println("Umur        : " + umur);
        System.out.println("Ras         : " + ras);
    }
}