package com.iteso.factory.installers;
import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;

public class WindowsPro extends Installer{
    public WindowsPro(){
        name = "WindowsPro";
    }

    @Override
    public InstallerPackage getPackage() {
        return null;
    }
}
