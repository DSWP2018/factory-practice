import com.iteso.factory.Installer;
import com.iteso.factory.Stores.WindowsFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WindowsInstallerTest {
    WindowsFactory windows;
    Installer installer;

    @Before
    public void SetUp(){
        windows = new WindowsFactory();

    }

    @Test
    public void install(){
       installer=  windows.downloadInstaller("Free");
        Assert.assertEquals("Windows Free Installer", installer.getName());
        Assert.assertEquals("Executing for Windows", installer.getPackage().execute());
    }

    @Test
    public void installHome(){
        installer=  windows.downloadInstaller("Home");
        Assert.assertEquals("Windows Home Installer", installer.getName());
        Assert.assertEquals("Executing for Windows", installer.getPackage().execute());
    }

    @Test
    public void installProfessional(){
        installer=  windows.downloadInstaller("Professional");
        Assert.assertEquals("Windows Professional Installer", installer.getName());
        Assert.assertEquals("Executing for Windows", installer.getPackage().execute());
    }

}
