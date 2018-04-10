import com.iteso.factory.Installer;
import com.iteso.factory.Package.LinuxPackage;
import com.iteso.factory.Package.MacOSPackage;
import com.iteso.factory.Package.WindowsPackage;
import com.iteso.factory.Store.MacOS;
import com.iteso.factory.installers.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstallerTestTest {
    Installer installer;
    @Before
    public void setUp(){

    }

    @Test
    public void TestGeneral(){
        installer = new FreeLinux();
        assertEquals("LinuxFree", installer.getName());
        assertEquals("executeando Linux", installer.getPackage().execute());
        assertTrue(installer.getPackage() instanceof LinuxPackage);
        installer = new HomeLinux();
        assertEquals("HomeLinux", installer.getName());
        assertEquals("executeando Linux", installer.getPackage().execute());
        assertTrue(installer.getPackage() instanceof LinuxPackage);
        installer = new ProfessionalLinux();
        assertEquals("ProfessionalLinux", installer.getName());
        assertEquals("executeando Linux", installer.getPackage().execute());
        assertTrue(installer.getPackage() instanceof LinuxPackage);
        installer = new FreeWindows();
        assertEquals("FreeWindows", installer.getName());
        assertEquals("executeando Windows", installer.getPackage().execute());
        assertTrue(installer.getPackage() instanceof WindowsPackage);
        installer = new HomeWindows();
        assertEquals("HomeWindows", installer.getName());
        assertEquals("executeando Windows", installer.getPackage().execute());
        assertTrue(installer.getPackage() instanceof WindowsPackage);
        installer = new ProfessionalWindows();
        assertEquals("ProfessionalWindows", installer.getName());
        assertEquals("executeando Windows", installer.getPackage().execute());
        assertTrue(installer.getPackage() instanceof WindowsPackage);
        installer = new FreeMacOS();
        assertEquals("FreeMacOS", installer.getName());
        assertEquals("executeando MacOS", installer.getPackage().execute());
        assertTrue(installer.getPackage() instanceof MacOSPackage);
        installer = new HomeMacOS();
        assertEquals("HomeMacOS", installer.getName());
        assertEquals("executeando MacOS", installer.getPackage().execute());
        assertTrue(installer.getPackage() instanceof MacOSPackage);
        installer = new ProfessionalMacOS();
        assertEquals("ProfessionalMacOS", installer.getName());
        assertEquals("executeando MacOS", installer.getPackage().execute());
        assertTrue(installer.getPackage() instanceof MacOSPackage);
    }

}