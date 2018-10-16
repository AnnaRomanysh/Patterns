package structural.bridge;

public class Linux implements OS {
    public void install() {
        System.out.println("Install Linux OS");
    }

    public void delete() {
        System.out.println("Delete Linux OS");
    }

    public void update() {
        System.out.println("Update Linux OS");

    }
}
