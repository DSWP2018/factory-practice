import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.factories.LinuxFactory;
import com.iteso.factory.factories.MacOSFactory;
import com.iteso.factory.installers.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MacOSFactoryTest {
    private DownloadFactory macOSFactory;
    private Installer installer;

    @Before
    public void setUp(){
        macOSFactory = new MacOSFactory();
    }

    @Test
    public void freeInstaller(){
        installer = new MacOsFreeInstaller();

        assertEquals(macOSFactory.downloadInstaller("Free").getName(), installer.getName());
    }

    @Test
    public void homeInstaller(){
        installer = new MacOsHomeInstaller();

        assertEquals(macOSFactory.downloadInstaller("Home").getName(), installer.getName());
    }

    @Test
    public void professionalInstaller(){
        installer = new MacOsProfessionalInstaller();

        assertEquals(macOSFactory.downloadInstaller("Professional").getName(), installer.getName());
    }

}
