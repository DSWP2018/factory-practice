import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.factories.LinuxFactory;
import com.iteso.factory.factories.WindowsFactory;
import com.iteso.factory.installers.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinuxFactoryTest {
    private DownloadFactory linuxFactory;
    private Installer installer;

    @Before
    public void setUp(){
        linuxFactory = new LinuxFactory();
    }

    @Test
    public void freeInstaller(){
        installer = new LinuxFreeInstaller();

        assertEquals(linuxFactory.downloadInstaller("Free").getName(), installer.getName());
    }

    @Test
    public void homeInstaller(){
        installer = new LinuxHomeInstaller();

        assertEquals(linuxFactory.downloadInstaller("Home").getName(), installer.getName());
    }

    @Test
    public void professionalInstaller(){
        installer = new LinuxProfessionalInstaller();

        assertEquals(linuxFactory.downloadInstaller("Professional").getName(), installer.getName());
    }

}
