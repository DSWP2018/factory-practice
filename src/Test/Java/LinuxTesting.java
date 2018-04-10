import com.iteso.factory.Installer;
import com.iteso.factory.stores.LinuxFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinuxTesting {
    LinuxFactory lf;
    Installer installer;
    @Before
    public void setup(){
        lf=new LinuxFactory();
    }
    @Test
    public void windowsFreeTest(){
        installer = lf.downloadInstaller("Linux Free Installer");
        Assert.assertEquals("Linux Free Installer",installer.getName());
    }
    @Test
    public void windowsHomeTest(){
        installer = lf.downloadInstaller("Linux Home Installer");
        Assert.assertEquals("Linux Home Installer",installer.getName());
    }
    @Test
    public void windowsProfessionalTest(){
        installer = lf.downloadInstaller("Linux Professional Installer");
        Assert.assertEquals("Linux Professional Installer",installer.getName());
    }
}
