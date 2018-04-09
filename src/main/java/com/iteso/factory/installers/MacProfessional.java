package com.iteso.factory.installers;

import com.iteso.factory.Installer;
import com.iteso.factory.InstallerPackage;
import com.iteso.factory.MacInstaller;

/**
 * Created by Rodrigov on 04/09/2018.
 */
public class MacProfessional extends Installer {
    public MacProfessional(){
        name = "Mac Professional Installer";

    }

    public InstallerPackage getPackage() {
        return new MacInstaller();
    }
}
