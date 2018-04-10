import com.iteso.factory.Installer;
import com.iteso.factory.stores.WindowsStore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WindowsInstallerTest {
    WindowsStore windowsStore;
    Installer installer;

    @Before
    public void setUp(){
        windowsStore = new WindowsStore();
    }

    @Test
    public void freeTest(){
        installer = windowsStore.downloadInstaller("Free");
        Assert.assertEquals("WindowsStore Free Installer", installer.getName());
        Assert.assertEquals("I'm a Windows Package :)", installer.getPackage().execute());
    }

    @Test
    public void homeTest(){
        installer = windowsStore.downloadInstaller("Home");
        Assert.assertEquals("WindowsStore Home Installer", installer.getName());
        Assert.assertEquals("I'm a Windows Package :)", installer.getPackage().execute());
    }

    @Test
    public void proTest(){
        installer = windowsStore.downloadInstaller("Profesional");
        Assert.assertEquals("WindowsStore Profesional Installer", installer.getName());
        Assert.assertEquals("I'm a Windows Package :)", installer.getPackage().execute());
    }
}
