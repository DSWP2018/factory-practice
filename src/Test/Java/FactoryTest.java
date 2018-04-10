import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FactoryTest {
    Installer installer;

    @Before
    public void setUp() {
        String free = "free";
        String home = "home";
        String professional = "professional";

    }
    @Test
    public void FreeLinux() {
        installer = new LinuxFreeInstaller();

        assertEquals("Linux Free Installer", installer.getName());
    }
    @Test
    public void HomeLinux() {
        installer = new LinuxHomeInstaller();

        assertEquals("Linux Home Installer", installer.getName());
    }
    @Test
    public void ProfesisonalLinux() {
        installer = new LinuxProfessionalInstaller();

        assertEquals("Linux Professional Installer", installer.getName());
    }

    @Test
    public void FreeWindows() {
        installer = new WindowsFreeInstaller();

        assertEquals("Windows Free Installer", installer.getName());
    }
    @Test
    public void HomeWindows() {
        installer = new WindowsHomeInstaller();

        assertEquals("Windows Home Installer", installer.getName());
    }
    @Test
    public void ProfessionalWindows() {
        installer = new WindowsProfessionalInstaller();

        assertEquals("Windows Professional Installer", installer.getName());
    }

    @Test
    public void FreeMacOS() {
        installer = new MacOSFreeInstaller();

        assertEquals("MacOS Free Installer", installer.getName());
    }
    @Test
    public void HomeMacOS() {
        installer = new MacOSHomeInstaller();

        assertEquals("MacOS Home Installer", installer.getName());
    }
    @Test
    public void ProfessionalMacOS() {
        installer = new MacOSProfessionalInstaller();

        assertEquals("MacOS Professional Installer", installer.getName());
    }

}
