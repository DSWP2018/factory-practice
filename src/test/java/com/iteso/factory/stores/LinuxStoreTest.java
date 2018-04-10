package com.iteso.factory.stores;

import com.iteso.factory.Installer;
import com.iteso.factory.installers.linux.LinuxFreeInstaller;
import com.iteso.factory.installers.linux.LinuxHomeInstaller;
import com.iteso.factory.installers.linux.LinuxProfessionalInstaller;
import com.iteso.factory.installers.macos.FreeMacOS;
import com.iteso.factory.installers.macos.HomeMacOS;
import com.iteso.factory.installers.macos.ProfessionalMacOS;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LinuxStoreTest {
    private LinuxStore ls;

    @Before
    public void setUp() {
        ls = new LinuxStore();
    }

    @Test
    public void linuxFreeInstallerTest() {
        Installer installer = ls.downloadInstaller("free");
        assertTrue(installer.getPackage() != null);
        assertTrue(installer instanceof LinuxFreeInstaller);
    }

    @Test
    public void linuxOSHomeInstallerTest() {
        Installer installer = ls.downloadInstaller("home");
        assertTrue(installer.getPackage() != null);
        assertTrue(installer instanceof LinuxHomeInstaller);
    }

    @Test
    public void linuxOSProfessionalInstallerTest() {
        Installer installer = ls.downloadInstaller("professional");
        assertTrue(installer.getPackage() != null);
        assertTrue(installer instanceof LinuxProfessionalInstaller);
    }
}
