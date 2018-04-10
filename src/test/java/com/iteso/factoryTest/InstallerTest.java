package com.iteso.factoryTest;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.installerPackages.LinuxInstallerPackage;
import com.iteso.factory.installerPackages.MacOSInstallerPackage;
import com.iteso.factory.installerPackages.WindowsInstallerPackage;
import com.iteso.factory.installers.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class InstallerTest {
    Installer installer;
    InstallerPackage installerPackage;
    @Before
    public void setUp(){
    }

    @Test
    public void WindowsInstallerTest(){
        installer = new WindowsInstallerFree();
        Assert.assertEquals(installer.getName(), "Windows Installer Free");
        installer = new WindowsInstallerHome();
        Assert.assertEquals(installer.getName(), "Windows Installer Home");
        installer = new WindowsInstallerProfessional();
        Assert.assertEquals(installer.getName(), "Windows Installer Professional");
    }

    @Test
    public void WindowsInstallerPackageTest(){
        installer = new WindowsInstallerFree();
        Assert.assertTrue(installer.getPackage() instanceof WindowsInstallerPackage);
        installer = new WindowsInstallerHome();
        Assert.assertTrue(installer.getPackage() instanceof WindowsInstallerPackage);
        installer = new WindowsInstallerProfessional();
        Assert.assertTrue(installer.getPackage() instanceof WindowsInstallerPackage);
    }

    @Test
    public void MacOSInstallerTest(){
        installer = new MacOSInstallerFree();
        Assert.assertEquals(installer.getName(), "MacOS Installer Free");
        installer = new MacOSInstallerHome();
        Assert.assertEquals(installer.getName(), "MacOS Installer Home");
        installer = new MacOSInstallerProfessional();
        Assert.assertEquals(installer.getName(), "MacOS Installer Professional");
    }

    @Test
    public void MacOSInstallerPackageTest(){
        installer = new MacOSInstallerFree();
        Assert.assertTrue(installer.getPackage() instanceof MacOSInstallerPackage);
        installer = new MacOSInstallerHome();
        Assert.assertTrue(installer.getPackage() instanceof MacOSInstallerPackage);
        installer = new MacOSInstallerProfessional();
        Assert.assertTrue(installer.getPackage() instanceof MacOSInstallerPackage);
    }

    @Test
    public void LinuxInstallerTest(){
        installer = new LinuxInstallerUbuntu();
        Assert.assertEquals(installer.getName(), "Linux Installer Ubuntu");
        installer = new LinuxInstallerElementary();
        Assert.assertEquals(installer.getName(), "Linux Installer Elementary");
        installer = new LinuxInstallerFedora();
        Assert.assertEquals(installer.getName(), "Linux Installer Fedora");
    }

    @Test
    public void LinuxInstallerPackageTest(){
        installer = new LinuxInstallerFedora();
        Assert.assertTrue(installer.getPackage() instanceof LinuxInstallerPackage);
        installer = new LinuxInstallerElementary();
        Assert.assertTrue(installer.getPackage() instanceof LinuxInstallerPackage);
        installer = new LinuxInstallerUbuntu();
        Assert.assertTrue(installer.getPackage() instanceof LinuxInstallerPackage);
    }
}
