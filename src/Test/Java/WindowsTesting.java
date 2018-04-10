import com.iteso.factory.Installer;
import com.iteso.factory.stores.WindowsFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WindowsTesting {
    WindowsFactory wf;
    Installer installer;
    @Before
    public void setup(){
        wf=new WindowsFactory();
    }
    @Test
    public void windowsFreeTest(){
        installer = wf.downloadInstaller("Windows Free Installer");
        Assert.assertEquals("Windows Free Installer",installer.getName());
    }
    @Test
    public void windowsHomeTest(){
        installer = wf.downloadInstaller("Windows Home Installer");
        Assert.assertEquals("Windows Home Installer",installer.getName());
    }
    @Test
    public void windowsProfessionalTest(){
        installer = wf.downloadInstaller("Windows Professional Installer");
        Assert.assertEquals("Windows Professional Installer",installer.getName());
    }
}
