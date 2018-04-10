package com.iteso.factory.stores;

import com.iteso.factory.Installer;
import com.iteso.factory.installers.macos.FreeMacOS;
import com.iteso.factory.installers.macos.HomeMacOS;
import com.iteso.factory.installers.macos.ProfessionalMacOS;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MacOSStoreTest {
    private  MacOSStore mos;

    @Before
    public void setUp() {
        mos = new MacOSStore();
    }

    @Test
    public void macOSFreeInstallerTest() {
        Installer installer = mos.downloadInstaller("free");
        assertTrue(installer.getPackage() != null);
        assertTrue(installer instanceof FreeMacOS);
    }

    @Test
    public void macOSHomeInstallerTest() {
        Installer installer = mos.downloadInstaller("home");
        assertTrue(installer.getPackage() != null);
        assertTrue(installer instanceof HomeMacOS);
    }

    @Test
    public void macOSProfessionalInstallerTest() {
        Installer installer = mos.downloadInstaller("professional");
        assertTrue(installer.getPackage() != null);
        assertTrue(installer instanceof ProfessionalMacOS);
    }
}
