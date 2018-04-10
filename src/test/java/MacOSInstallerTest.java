import com.iteso.factory.Installer;
import com.iteso.factory.Stores.LinuxFactory;
import com.iteso.factory.Stores.MacOSFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MacOSInstallerTest {
    MacOSFactory macOS;
    Installer installer;

    @Before
    public void SetUp(){
        macOS = new MacOSFactory();

    }

    @Test
    public void installFree(){
        installer=  macOS.downloadInstaller("Free");
        Assert.assertEquals("MacOS Free Installer", installer.getName());
        Assert.assertEquals("Executing for MacOS", installer.getPackage().execute());
    }

    @Test
    public void installHome(){
        installer=  macOS.downloadInstaller("Home");
        Assert.assertEquals("MacOS Home Installer", installer.getName());
        Assert.assertEquals("Executing for MacOS", installer.getPackage().execute());
    }

    @Test
    public void installProfessional(){
        installer=  macOS.downloadInstaller("Professional");
        Assert.assertEquals("MacOS Professional Installer", installer.getName());
        Assert.assertEquals("Executing for MacOS", installer.getPackage().execute());
    }
}
