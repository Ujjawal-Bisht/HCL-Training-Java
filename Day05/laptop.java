package Day05 ;

public class laptop{
    // Properties
    String brand;
    String model;
    int RAM;

    public void playmusic() {
        System.out.println(brand + " " + model + " playing music.");
    }

    public void installapp(String s, int availableMemory, int requiredMemory) throws LowMemoryException {
        if (availableMemory < requiredMemory) {
            throw new LowMemoryException("Low Memory! Cannot install " + s + 
                ". Required: " + requiredMemory + "GB, but Available: " + availableMemory + "GB");
        }
        int remaining = availableMemory - requiredMemory;
        System.out.println(s + " is installed in " + brand + " " + model + " and remaining is " + remaining + "GB");
    }

    public static void main(String[] args) {
        laptop L1 = new laptop();
        L1.brand = "Acer";
        L1.model = "Aspire";
        L1.RAM = 32;
        L1.playmusic();

        try {
            L1.installapp("Chrome", L1.RAM, 4);
        } catch (LowMemoryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        laptop L2 = new laptop();
        L2.brand = "Dell";
        L2.model = "Inspiron";
        L2.RAM = 6;
        L2.playmusic();

        try {
            L2.installapp("HeavyGame", L2.RAM, 10);
        } catch (LowMemoryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        laptop L3 = new laptop();
        L3.brand = "ASUS";
        L3.model = "VivoBook";
        L3.RAM = 8;
        L3.playmusic();

        try {
            L3.installapp("CandyCrush", L3.RAM, 1);
        } catch (LowMemoryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}