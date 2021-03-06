package com.iteso.factory;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 4/09/18
 */
public abstract class DownloadFactory {
    private String targetOS = "GenericOS"; //Agregamos un tipo de pozole

    public Installer downloadInstaller(String operatingSystem){
        Installer installer;

        installer = createInstallerPackage(operatingSystem);

        return installer;
    }

    protected abstract Installer createInstallerPackage(String operatingSystem);


    public String getTargetOS() {
        return targetOS;
    }

    public void setTargetOS(String targetOS) {
        this.targetOS = targetOS;
    }
}
