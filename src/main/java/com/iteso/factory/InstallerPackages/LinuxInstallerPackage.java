package com.iteso.factory.InstallerPackages;

import com.iteso.factory.InstallerPackage;

public class LinuxInstallerPackage implements InstallerPackage {
    @Override
    public String execute() {
        return "Estoy ejecutando para Linux";
    }

    @Override
    public String decode() {
        return "Decodificando para Linux";
    }

    @Override
    public String extract() {
        return "Extrayendo archivos de Linux";
    }

    @Override
    public String encode() {
        return "Encoding for Linux";
    }
}
