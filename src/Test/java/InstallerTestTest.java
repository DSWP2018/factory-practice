import com.iteso.factory.Installer;
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
        installer = new HomeLinux();
        assertEquals("HomeLinux", installer.getName());
        assertEquals("executeando Linux", installer.getPackage().execute());
        installer = new ProfessionalLinux();
        assertEquals("ProfessionalLinux", installer.getName());
        assertEquals("executeando Linux", installer.getPackage().execute());
        installer = new FreeWindows();
        assertEquals("FreeWindows", installer.getName());
        assertEquals("executeando Windows", installer.getPackage().execute());
        installer = new HomeWindows();
        assertEquals("HomeWindows", installer.getName());
        assertEquals("executeando Windows", installer.getPackage().execute());
        installer = new ProfessionalWindows();
        assertEquals("ProfessionalWindows", installer.getName());
        assertEquals("executeando Windows", installer.getPackage().execute());
        installer = new FreeMacOS();
        assertEquals("FreeMacOS", installer.getName());
        assertEquals("executeando MacOS", installer.getPackage().execute());
        installer = new HomeMacOS();
        assertEquals("HomeMacOS", installer.getName());
        assertEquals("executeando MacOS", installer.getPackage().execute());
        installer = new ProfessionalMacOS();
        assertEquals("ProfessionalMacOS", installer.getName());
        assertEquals("executeando MacOS", installer.getPackage().execute());
    }

}