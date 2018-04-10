import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;
import com.iteso.factory.stores.MacOS;
import com.iteso.factory.stores.Windows;
import org.junit.Assert;
import org.junit.Test;

public class WindowsInstallerTest {

    Windows windows;
    Installer installer;

    @Test
    public void FreeTest(){
        installer = new WindowsFreeInstaller();
        Assert.assertEquals("Windows Free Installer", installer.getName());
        Assert.assertEquals("Decoding for Windows", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Windows", installer.getPackage().encode());
        Assert.assertEquals("Executing for Windows", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Windows", installer.getPackage().extract());
    }

    @Test
    public void HomeTest(){
        installer = new WindowsHomeInstaller();
        Assert.assertEquals("Windows Home Installer", installer.getName());
        Assert.assertEquals("Decoding for Windows", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Windows", installer.getPackage().encode());
        Assert.assertEquals("Executing for Windows", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Windows", installer.getPackage().extract());
    }

    @Test
    public void ProfessionalTest(){
        installer = new WindowsProfessionalInstaller();
        Assert.assertEquals("Windows Professional Installer", installer.getName());
        Assert.assertEquals("Decoding for Windows", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Windows", installer.getPackage().encode());
        Assert.assertEquals("Executing for Windows", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Windows", installer.getPackage().extract());
    }

}
