import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;
import com.iteso.factory.stores.Linux;
import org.junit.Test;
import org.junit.Assert;

public class LinuxInstallerTest {

    Linux linux;
    Installer installer;

    @Test
    public void FreeTest(){
        installer = new LinuxFreeInstaller();
        Assert.assertEquals("Linux Free Installer", installer.getName());
        Assert.assertEquals("Decoding for Linux", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Linux", installer.getPackage().encode());
        Assert.assertEquals("Executing for Linux", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Linux", installer.getPackage().extract());
    }

    @Test
    public void HomeTest(){
        installer = new LinuxHomeInstaller();
        Assert.assertEquals("Linux Home Installer", installer.getName());
        Assert.assertEquals("Decoding for Linux", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Linux", installer.getPackage().encode());
        Assert.assertEquals("Executing for Linux", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Linux", installer.getPackage().extract());
    }

    @Test
    public void ProfessionalTest(){
        installer = new LinuxProfessionalInstaller();
        Assert.assertEquals("Linux Professional Installer", installer.getName());
        Assert.assertEquals("Decoding for Linux", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Linux", installer.getPackage().encode());
        Assert.assertEquals("Executing for Linux", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Linux", installer.getPackage().extract());
    }

}
