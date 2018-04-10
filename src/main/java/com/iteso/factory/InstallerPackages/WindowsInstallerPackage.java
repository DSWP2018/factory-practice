package com.iteso.factory.InstallerPackages;

import com.iteso.factory.InstallerPackage;

public class WindowsInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "Estoy ejecutando para Windows";
    }

    @Override
    public String decode() {
        return "Decodificando para Windows";
    }

    @Override
    public String extract() {
        return "Extrayendo archivos de Windows";
    }

    @Override
    public String encode() {
        return "Encoding for Windows";
    }
}
