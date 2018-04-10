package com.iteso.factory;

import com.iteso.factory.installers.MacOSFreeInstaller;
import com.iteso.factory.installers.MacOSHomeInstaller;
import com.iteso.factory.installers.MacOSProfessionalInstaller;

public class MacOSFactory implements InstallerPackage{

    public Installer getOs(String version) {
        if (version == null){
            return null;
        } else if (version.equals("Windows Home")) {
            return new MacOSHomeInstaller();
        } else if (version.equals("Windows Free")) {
            return new MacOSFreeInstaller();
        } else if (version.equals("Windows Professional")) {
            return new MacOSProfessionalInstaller();
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
