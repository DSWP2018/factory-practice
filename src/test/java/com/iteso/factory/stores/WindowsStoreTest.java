package com.iteso.factory.stores;

import com.iteso.factory.Installer;
import com.iteso.factory.installers.windows.WindowsFreeInstaller;
import com.iteso.factory.installers.windows.WindowsHomeInstaller;
import com.iteso.factory.installers.windows.WindowsProfessionalInstaller;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import static org.mockito.Mockito.*;

public class WindowsStoreTest {
    private  WindowsStore ws;

    @Before
    public void setUp() {
        ws = new WindowsStore();
    }

    @Test
    public void windowsFreeInstallerTest() {
        Installer installer = ws.downloadInstaller("free");
        assertTrue(installer.getPackage() != null);
        assertTrue(installer instanceof WindowsFreeInstaller);
    }

    @Test
    public void windowsHomeInstallerTest() {
        Installer installer = ws.downloadInstaller("home");
        assertTrue(installer.getPackage() != null);
        assertTrue(installer instanceof WindowsHomeInstaller);
    }

    @Test
    public void windowsProfessionalInstallerTest() {
        Installer installer = ws.downloadInstaller("professional");
        assertTrue(installer.getPackage() != null);
        assertTrue(installer instanceof WindowsProfessionalInstaller);
    }
}
