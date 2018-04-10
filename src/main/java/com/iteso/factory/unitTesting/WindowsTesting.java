package com.iteso.factory.unitTesting;

import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;
import com.iteso.factory.stores.Windows;
import org.junit.Test;
import org.junit.Assert;

public class WindowsTesting {

    Windows windows;
    Installer installer;

    @Test
    public void FreeTest(){
        installer = new WindowsFree();
        Assert.assertEquals("WindowsFree", installer.getName());
        Assert.assertEquals("Decoding for Windows", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Windows", installer.getPackage().encode());
        Assert.assertEquals("Executing for Windows", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Windows", installer.getPackage().extract());
    }

    @Test
    public void HomeTest(){
        installer = new WindowsHome();
        Assert.assertEquals("WindowsHome", installer.getName());
        Assert.assertEquals("Decoding for Windows", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Windows", installer.getPackage().encode());
        Assert.assertEquals("Executing for Windows", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Windows", installer.getPackage().extract());
    }

    @Test
    public void ProfessionalTest(){
        installer = new WindowsPro();
        Assert.assertEquals("WindowsPro", installer.getName());
        Assert.assertEquals("Decoding for Windows", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Windows", installer.getPackage().encode());
        Assert.assertEquals("Executing for Windows", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Windows", installer.getPackage().extract());
    }

}