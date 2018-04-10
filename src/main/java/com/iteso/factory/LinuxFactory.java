package com.iteso.factory;

import com.iteso.factory.installers.*;

public class LinuxFactory implements  InstallerPackage{

    public Installer getOs(String version) {
        if (version == null){
            return null;
        } else if (version.equals("Linux Home")) {
            return new LinuxHomeInstaller();
        } else if (version.equals("Linux Free")) {
            return new LinuxFreeInstaller();
        } else if (version.equals("Linux Professional")) {
            return new LinuxProfessionalInstaller();
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
