import com.iteso.factory.Installer;
import com.iteso.factory.stores.MacOSFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MacOSTesting {
    MacOSFactory mf;
    Installer installer;
    @Before
    public void setup(){
        mf=new MacOSFactory();
    }
    @Test
    public void windowsFreeTest(){
        installer = mf.downloadInstaller("MacOS Free Installer");
        Assert.assertEquals("MacOS Free Installer",installer.getName());
    }
    @Test
    public void windowsHomeTest(){
        installer = mf.downloadInstaller("MacOS Home Installer");
        Assert.assertEquals("MacOS Home Installer",installer.getName());
    }
    @Test
    public void windowsProfessionalTest(){
        installer = mf.downloadInstaller("MacOS Professional Installer");
        Assert.assertEquals("MacOS Professional Installer",installer.getName());
    }
}
