package structural.bridge;

public class InstallerImpl implements Installer {
    private OS os;

    public InstallerImpl(OS os) {
        this.os = os;
    }

    public void installSystem() {
        os.install();

    }
}
