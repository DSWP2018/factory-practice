package com.iteso.factory.installers;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class WindowsHome extends Installer{
    public WindowsHome(){
        name = "WindowsHome";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
