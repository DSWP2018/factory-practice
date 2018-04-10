package com.iteso.factory;

import com.iteso.factory.installers.MacFreeInstaller;
import com.iteso.factory.installers.MacHomeInstaller;
import com.iteso.factory.installers.MacProInstaller;

public class MacFactory implements InstallerPackage {
    public Installer getOs(String version) {
        if (version == null){
            return null;
        } else if (version.equals("Mac Home")) {
            return new MacHomeInstaller();
        } else if (version.equals("Mac Free")) {
            return new MacFreeInstaller();
        } else if (version.equals("Mac Professional")) {
            return new MacProInstaller();
        }
        return null;
    }

    @Override
    public void execute() {
        System.out.println("Mac installer execution...");
    }

    @Override
    public void decode() {
        System.out.println("Mac installer decoding...");
    }

    @Override
    public void extract() {
        System.out.println("Mac installer extracting...");
    }

    @Override
    public void encode() {
        System.out.println("Mac installer encoding...");
    }
}
