package com.iteso.factory.unitTesting;

import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;
import com.iteso.factory.stores.Windows;
import org.junit.Test;
import org.junit.Assert;

public class LinuxTesting {

    Linux linux;
    Installer installer;

    @Test
    public void FreeTest(){
        installer = new LinuxFree();
        Assert.assertEquals("LinuxFree", installer.getName());
        Assert.assertEquals("Decoding for Linux", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Linux", installer.getPackage().encode());
        Assert.assertEquals("Executing for Linux", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Linux", installer.getPackage().extract());
    }

    @Test
    public void HomeTest(){
        installer = new LinuxHome();
        Assert.assertEquals("LinuxHome", installer.getName());
        Assert.assertEquals("Decoding for Linux", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Linux", installer.getPackage().encode());
        Assert.assertEquals("Executing for Linux", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Linux", installer.getPackage().extract());
    }

    @Test
    public void ProfessionalTest(){
        installer = new LinuxPro();
        Assert.assertEquals("WindowsPro", installer.getName());
        Assert.assertEquals("Decoding for Linux", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Linux", installer.getPackage().encode());
        Assert.assertEquals("Executing for Linux", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Linux", installer.getPackage().extract());
    }

}