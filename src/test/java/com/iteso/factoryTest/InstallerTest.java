package com.iteso.factoryTest;

import com.iteso.factory.DownloadFactory;
import com.iteso.factory.Factory.LinuxFactory;
import com.iteso.factory.Factory.MacOSFactory;
import com.iteso.factory.Factory.WindowsFactory;
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
    DownloadFactory downloadFactory;
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
    public void WindowsInstallerPackageFuncTest(){
        installer = new WindowsInstallerFree();
        Assert.assertEquals(installer.getPackage().decode(), "decoding Windows");
        Assert.assertEquals(installer.getPackage().execute(), "executing Windows");
        Assert.assertEquals(installer.getPackage().encode(), "encode Windows");
        Assert.assertEquals(installer.getPackage().extract(), "extract Windows");
    }

    @Test
    public void WindowsFactoryTest(){
        downloadFactory = new WindowsFactory();
        Assert.assertTrue(downloadFactory.downloadInstaller("Free") instanceof WindowsInstallerFree);
        Assert.assertTrue(downloadFactory.downloadInstaller("Home") instanceof WindowsInstallerHome);
        Assert.assertTrue(downloadFactory.downloadInstaller("Professional") instanceof WindowsInstallerProfessional);
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
    public void MacOSFactoryTest(){
        downloadFactory = new MacOSFactory();
        Assert.assertTrue(downloadFactory.downloadInstaller("Free") instanceof MacOSInstallerFree);
        Assert.assertTrue(downloadFactory.downloadInstaller("Home") instanceof MacOSInstallerHome);
        Assert.assertTrue(downloadFactory.downloadInstaller("Professional") instanceof MacOSInstallerProfessional);
    }

    @Test
    public void MacOSInstallerPackageFuncTest(){
        installer = new MacOSInstallerFree();
        Assert.assertEquals(installer.getPackage().decode(), "decoding MacOS");
        Assert.assertEquals(installer.getPackage().execute(), "executing MacOS");
        Assert.assertEquals(installer.getPackage().encode(), "encode MacOS");
        Assert.assertEquals(installer.getPackage().extract(), "extract MacOS");
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

    @Test
    public void LinuxFactoryTest(){
        downloadFactory = new LinuxFactory();
        Assert.assertTrue(downloadFactory.downloadInstaller("Ubuntu") instanceof LinuxInstallerUbuntu);
        Assert.assertTrue(downloadFactory.downloadInstaller("Elementary") instanceof LinuxInstallerElementary);
        Assert.assertTrue(downloadFactory.downloadInstaller("Fedora") instanceof LinuxInstallerFedora);
    }

    @Test
    public void LinuxInstallerPackageFuncTest(){
        installer = new LinuxInstallerUbuntu();
        Assert.assertEquals(installer.getPackage().decode(), "decoding Linux");
        Assert.assertEquals(installer.getPackage().execute(), "executing Linux");
        Assert.assertEquals(installer.getPackage().encode(), "encode Linux");
        Assert.assertEquals(installer.getPackage().extract(), "extract Linux");
    }
}
