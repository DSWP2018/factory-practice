import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;
import com.iteso.factory.stores.LinuxFactory;
import com.iteso.factory.stores.MacOSFactory;
import com.iteso.factory.stores.WindowsFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class FactoryTest {
    Installer installer;
    DownloadFactory downloadFactory;
    @Before
    public void setUp() {

    }

    @Test
    public void LinuxFactory(){
        installer = new FreeLinuxInstaller();
        assertEquals("Linux Free Installer", installer.getName());
        installer = new HomeLinuxInstaller();
        assertEquals("Linux Home Installer", installer.getName());
        installer = new ProfessionalLinuxInstaller();
        assertEquals("Linux Professional Installer", installer.getName());
    }

    @Test
    public void WindowsFactory(){
        installer = new FreeMacOSInstaller();
        assertEquals("MacOS Free Installer", installer.getName());
        installer = new HomeMacOSInstaller();
        assertEquals("MacOS Home Installer", installer.getName());
        installer = new ProfessionalMacOSInstaller();
        assertEquals("MacOS Professional Installer", installer.getName());
    }

    @Test
    public void MacOSFactory(){
        installer = new FreeWindowsInstaller();
        assertEquals("Windows Free Installer", installer.getName());
        installer = new HomeWindowsInstaller();
        assertEquals("Windows Home Installer", installer.getName());
        installer = new ProfessionalWindowsInstaller();
        assertEquals("Windows Professional Installer", installer.getName());
    }

    @Test
    public void getLinuxFactory(){
        downloadFactory = new LinuxFactory();
        assertTrue( downloadFactory.downloadInstaller("Free") instanceof FreeLinuxInstaller);
        assertTrue( downloadFactory.downloadInstaller("Home") instanceof HomeLinuxInstaller);
        assertTrue( downloadFactory.downloadInstaller("Professional") instanceof ProfessionalLinuxInstaller);
    }

    @Test
    public void getWindowsFactory(){
        downloadFactory = new WindowsFactory();
        assertTrue( downloadFactory.downloadInstaller("Free") instanceof FreeWindowsInstaller);
        assertTrue( downloadFactory.downloadInstaller("Home") instanceof HomeWindowsInstaller);
        assertTrue( downloadFactory.downloadInstaller("Professional") instanceof ProfessionalWindowsInstaller);
    }

    @Test
    public void getMacOsFactory(){
        downloadFactory = new MacOSFactory();
        assertTrue( downloadFactory.downloadInstaller("Free") instanceof FreeMacOSInstaller);
        assertTrue( downloadFactory.downloadInstaller("Home") instanceof HomeMacOSInstaller);
        assertTrue( downloadFactory.downloadInstaller("Professional") instanceof ProfessionalMacOSInstaller);
    }

    @Test
    public void WindowsInstallerPackage(){
        installer = new FreeWindowsInstaller();
        assertEquals("Decoding Windows Installer Package", installer.getPackage().decode() );
    }

}
