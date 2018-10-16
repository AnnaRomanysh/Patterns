package structural.bridge;

public class Windows implements OS {
    public void install() {
        System.out.println("Install Window OS");
    }

    public void delete() {
        System.out.println("Delete Window OS");
    }

    public void update() {
        System.out.println("Update Window OS");

    }
}
