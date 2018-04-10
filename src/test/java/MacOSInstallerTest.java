import com.iteso.factory.Installer;
import com.iteso.factory.stores.MacOSStore;
import com.iteso.factory.stores.WindowsStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MacOSInstallerTest {
    MacOSStore macOSStore;
    Installer installer;

    @Before
    public void setUp(){
        macOSStore = new MacOSStore();
    }

    @Test
    public void freeTest(){
        installer = macOSStore.downloadInstaller("Free");
        Assert.assertEquals("MacOSStore Free Installer", installer.getName());
        Assert.assertEquals("I'm a MacOS Package :)", installer.getPackage().execute());
    }

    @Test
    public void homeTest(){
        installer = macOSStore.downloadInstaller("Home");
        Assert.assertEquals("MacOSStore Home Installer", installer.getName());
        Assert.assertEquals("I'm a MacOS Package :)", installer.getPackage().execute());
    }

    @Test
    public void proTest(){
        installer = macOSStore.downloadInstaller("Profesional");
        Assert.assertEquals("MacOSStore Profesional Installer", installer.getName());
        Assert.assertEquals("I'm a MacOS Package :)", installer.getPackage().execute());
    }
}
