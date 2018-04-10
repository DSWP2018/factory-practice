package com.iteso.factory;


import com.iteso.factory.installers.WindowsFreeInstaller;
import com.iteso.factory.installers.WindowsHomeInstaller;
import com.iteso.factory.installers.WindowsProInstaller;

public class WindowsFactory implements InstallerPackage{
    public Installer getOs(String version) {
        if (version == null){
            return null;
        } else if (version.equals("Windows Home")) {
            return new WindowsHomeInstaller();
        } else if (version.equals("Windows Free")) {
            return new WindowsFreeInstaller();
        } else if (version.equals("Windows Professional")) {
            return new WindowsProInstaller();
        }
        return null;
    }

    @Override
    public void execute() {
        System.out.println("Windows installer execution...");
    }

    @Override
    public void decode() {
        System.out.println("Windows installer decoding...");
    }

    @Override
    public void extract() {
        System.out.println("Windows installer extracting...");
    }

    @Override
    public void encode() {
        System.out.println("Windows installer encoding...");
    }
}
