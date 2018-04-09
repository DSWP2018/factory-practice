package com.iteso.factory;

import com.iteso.factory.installers.LinuxFreeInstaller;
import com.iteso.factory.installers.LinuxHomeInstaller;
import com.iteso.factory.installers.LinuxProInstaller;

public class LinuxFactory {
    public Installer getOs(String version) {
        if (version == null){
            return null;
        } else if (version.equals("Linux Home")) {
            return new LinuxHomeInstaller();
        } else if (version.equals("Linux Free")) {
            return new LinuxFreeInstaller();
        } else if (version.equals("Linux Professional")) {
            return new LinuxProInstaller();
        }
        return null;
    }

}
