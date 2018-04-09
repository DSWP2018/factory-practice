package com.iteso.factory;

import com.iteso.factory.installers.MacFreeInstaller;
import com.iteso.factory.installers.MacHomeInstaller;
import com.iteso.factory.installers.MacProInstaller;

public class MacFactory {
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
}
