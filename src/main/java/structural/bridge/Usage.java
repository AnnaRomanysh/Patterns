package structural.bridge;

public class Usage {

    public static void main(String[] args) {

        OS windows = new Windows();
        InstallerImpl installer = new InstallerImpl(windows);
        installer.installSystem();

        OS linux = new Linux();
        InstallerImpl installerLin = new InstallerImpl(linux);
        installerLin.installSystem();
    }
}
