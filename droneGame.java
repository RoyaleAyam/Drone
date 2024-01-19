package dasar;

public class droneGame {
    public static void main(String[] args) {
        
        Drone thingy = new Drone();
        
        thingy.energi = 100;
        thingy.kecepatan = 50;
        thingy.ketinggian = 20;
        thingy.merek = "Flying Thingy";

        thingy.terbang();
        thingy.mundur();
    }
}
