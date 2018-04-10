import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;
import com.iteso.factory.stores.Linux;
import com.iteso.factory.stores.MacOS;
import org.junit.Assert;
import org.junit.Test;

public class MacOSInstallerTest {

    MacOS macOS;
    Installer installer;

    @Test
    public void FreeTest(){
        installer = new MacOSFreeInstaller();
        Assert.assertEquals("MacOS Free Installer", installer.getName());
        Assert.assertEquals("Decoding for MacOS", installer.getPackage().decode());
        Assert.assertEquals("Encoding for MacOS", installer.getPackage().encode());
        Assert.assertEquals("Executing for MacOS", installer.getPackage().execute());
        Assert.assertEquals("Extracting for MacOS", installer.getPackage().extract());
    }

    @Test
    public void HomeTest(){
        installer = new MacOSHomeInstaller();
        Assert.assertEquals("MacOS Home Installer", installer.getName());
        Assert.assertEquals("Decoding for MacOS", installer.getPackage().decode());
        Assert.assertEquals("Encoding for MacOS", installer.getPackage().encode());
        Assert.assertEquals("Executing for MacOS", installer.getPackage().execute());
        Assert.assertEquals("Extracting for MacOS", installer.getPackage().extract());
    }

    @Test
    public void ProfessionalTest(){
        installer = new MacOSProfessionalInstaller();
        Assert.assertEquals("MacOS Professional Installer", installer.getName());
        Assert.assertEquals("Decoding for MacOS", installer.getPackage().decode());
        Assert.assertEquals("Encoding for MacOS", installer.getPackage().encode());
        Assert.assertEquals("Executing for MacOS", installer.getPackage().execute());
        Assert.assertEquals("Extracting for MacOS", installer.getPackage().extract());
    }

}
