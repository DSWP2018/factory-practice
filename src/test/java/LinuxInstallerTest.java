import com.iteso.factory.Installer;
import com.iteso.factory.stores.LinuxStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinuxInstallerTest {
    LinuxStore linuxStore;
    Installer installer;

    @Before
    public void setUp(){
        linuxStore = new LinuxStore();
    }

    @Test
    public void freeTest(){
        installer = linuxStore.downloadInstaller("Free");
        Assert.assertEquals("LinuxStore Free Installer", installer.getName());
        Assert.assertEquals("I'm a Linux Package :)", installer.getPackage().execute());
    }

    @Test
    public void homeTest(){
        installer = linuxStore.downloadInstaller("Home");
        Assert.assertEquals("LinuxStore Home Installer", installer.getName());
        Assert.assertEquals("I'm a Linux Package :)", installer.getPackage().execute());
    }

    @Test
    public void proTest(){
        installer = linuxStore.downloadInstaller("Profesional");
        Assert.assertEquals("LinuxStore Profesional Installer", installer.getName());
        Assert.assertEquals("I'm a Linux Package :)", installer.getPackage().execute());
    }
}
