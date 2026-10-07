public class main {
    public static void main(String[] args) {
       Kucing k1 = new Kucing("Cecep", 3, "Persia");
       k1.tampilData();

       Anjing a1 = new Anjing("Dody", 5, "Anjing Kampung");
       a1.tampilData();
       
       GoldenRetriever g1 = new GoldenRetriever("Coky", 5, "Ayam");
       g1.tampilData();
       g1.berenang();
       g1.mengambil();
    }
}