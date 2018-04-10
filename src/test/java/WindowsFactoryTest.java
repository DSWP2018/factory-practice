import com.iteso.factory.DownloadFactory;

import com.iteso.factory.Installer;
import com.iteso.factory.factories.WindowsFactory;
import com.iteso.factory.installers.WindowsFreeInstaller;
import com.iteso.factory.installers.WindowsHomeInstaller;
import com.iteso.factory.installers.WindowsProfessionalInstaller;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WindowsFactoryTest {
    private DownloadFactory windowsFactory;
    private Installer installer;

    @Before
    public void setUp(){
        windowsFactory = new WindowsFactory();
    }

    @Test
    public void freeInstaller(){
        installer = new WindowsFreeInstaller();

        assertEquals(windowsFactory.downloadInstaller("Free").getName(), installer.getName());
    }

    @Test
    public void homeInstaller(){
        installer = new WindowsHomeInstaller();

        assertEquals(windowsFactory.downloadInstaller("Home").getName(), installer.getName());
    }

    @Test
    public void professionalInstaller(){
        installer = new WindowsProfessionalInstaller();

        assertEquals(windowsFactory.downloadInstaller("Professional").getName(), installer.getName());
    }

}
