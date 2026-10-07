class GoldenRetriever extends Anjing {
    String makananFavorit;

    GoldenRetriever(String nama, int umur, String makananFavorit) {
        super(nama, umur, makananFavorit);
        this.makananFavorit = makananFavorit;
    }

    void tampilData() {
        System.out.println("Nama Anjing     : " + nama);
        System.out.println("Umur            : " + umur);
        System.out.println("Makanan Favorit : " + makananFavorit);
    }

    void berenang() {
        System.out.println(nama + " sedang berenang.");
    }

    void mengambil() {
        System.out.println(nama + " sedang mengambil bola.");
    }
}