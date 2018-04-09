package com.iteso.factory;


import com.iteso.factory.installers.WindowsFreeInstaller;
import com.iteso.factory.installers.WindowsHomeInstaller;
import com.iteso.factory.installers.WindowsProInstaller;

public class WindowsFactory {
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
}
