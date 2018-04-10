import com.iteso.factory.Installer;
import com.iteso.factory.Stores.LinuxFactory;
import com.iteso.factory.Stores.WindowsFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinuxInstallerTest {
   LinuxFactory linux;
    Installer installer;

    @Before
    public void SetUp(){
        linux = new LinuxFactory();

    }

    @Test
    public void installFree(){
        installer=  linux.downloadInstaller("Free");
        Assert.assertEquals("Linux Free Installer", installer.getName());
        Assert.assertEquals("Executing for Linux", installer.getPackage().execute());
    }

    @Test
    public void installHome(){
        installer=  linux.downloadInstaller("Home");
        Assert.assertEquals("Linux Home Installer", installer.getName());
        Assert.assertEquals("Executing for Linux", installer.getPackage().execute());
    }

    @Test
    public void installProfessional(){
        installer=  linux.downloadInstaller("Professional");
        Assert.assertEquals("Linux Professional Installer", installer.getName());
        Assert.assertEquals("Executing for Linux", installer.getPackage().execute());
    }
}
