import com.iteso.factory.Constants;
import com.iteso.factory.Installer;
import com.iteso.factory.stores.Linux;
import com.iteso.factory.stores.MacOS;
import com.iteso.factory.stores.Windows;

public class Main {
    public static void main(final String[] args){
        MacOS mac = new MacOS();
        Windows windows = new Windows();
        Linux linux = new Linux();

        Installer installerMac = mac.downloadInstaller(Constants.FREE);
        mac.getTargetOS();
        installerMac.getName();
        installerMac.getPackage().extract();
        installerMac.getPackage().execute();
        installerMac.getPackage().encode();
        installerMac.getPackage().decode();

        Installer installerWindows = windows.downloadInstaller(Constants.HOME);
        windows.getTargetOS();
        installerWindows.getName();
        installerWindows.getPackage().decode();
        installerWindows.getPackage().encode();
        installerWindows.getPackage().execute();
        installerWindows.getPackage().extract();

        Installer installerLinux = linux.downloadInstaller(Constants.PROFESSIONAL);
        linux.getTargetOS();
        installerLinux.getName();
        installerLinux.getPackage().decode();
        installerLinux.getPackage().execute();
        installerLinux.getPackage().extract();
        installerLinux.getPackage().encode();
    }
}
