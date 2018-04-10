package com.iteso.factory;

import com.iteso.factory.installers.WindowsFreeInstaller;
import com.iteso.factory.installers.WindowsHomeInstaller;
import com.iteso.factory.installers.WindowsProfessionalInstaller;

public class WindowsFactory implements InstallerPackage{

    public Installer getOs(String version) {
        if (version == null){
            return null;
        } else if (version.equals("Windows Home")) {
            return new WindowsHomeInstaller();
        } else if (version.equals("Windows Free")) {
            return new WindowsFreeInstaller();
        } else if (version.equals("Windows Professional")) {
            return new WindowsProfessionalInstaller();
        }
        return null;
    }

    @Override
    public void execute() {
        System.out.println("Bla bla");
    }

    @Override
    public void decode() {
        System.out.println("Bla bla");
    }

    @Override
    public void extract() {
        System.out.println("Bla bla");
    }

    @Override
    public void encode() {
        System.out.println("Bla bla");
    }
}
