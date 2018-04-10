package com.iteso.factory.unitTesting;

import com.iteso.factory.Installer;
import com.iteso.factory.installers.*;
import com.iteso.factory.stores.Windows;
import org.junit.Test;
import org.junit.Assert;

public class MacTesting {

    Mac mac;
    Installer installer;

    @Test
    public void FreeTest(){
        installer = new MacFree();
        Assert.assertEquals("MacFree", installer.getName());
        Assert.assertEquals("Decoding for Mac", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Mac", installer.getPackage().encode());
        Assert.assertEquals("Executing for Mac", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Mac", installer.getPackage().extract());
    }

    @Test
    public void HomeTest(){
        installer = new MacHome();
        Assert.assertEquals("MacHome", installer.getName());
        Assert.assertEquals("Decoding for Mac", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Mac", installer.getPackage().encode());
        Assert.assertEquals("Executing for Mac", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Mac", installer.getPackage().extract());
    }

    @Test
    public void ProfessionalTest(){
        installer = new MacPro();
        Assert.assertEquals("MacPro", installer.getName());
        Assert.assertEquals("Decoding for Mac", installer.getPackage().decode());
        Assert.assertEquals("Encoding for Mac", installer.getPackage().encode());
        Assert.assertEquals("Executing for Mac", installer.getPackage().execute());
        Assert.assertEquals("Extracting for Mac", installer.getPackage().extract());
    }

}