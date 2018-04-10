package com.iteso.factory;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 4/09/18
 */
public abstract class DownloadFactory {
    private String targetOS = "GenericOS"; //Agregamos un tipo de pozole

    public Installer downloadInstaller(String operatingSystemVersion){
        Installer installer;

        installer = createInstallerPackage(operatingSystemVersion);

        return installer;
    }

    protected abstract Installer createInstallerPackage(String operatingSystemVersion); //free, home, professional


    public String getTargetOS() {
        return targetOS;
    }

    public void setTargetOS(String targetOS) {
        this.targetOS = targetOS;
    }
}
