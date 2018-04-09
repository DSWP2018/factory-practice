package com.iteso.factory;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 4/09/18
 */
public abstract class DownloadFactory {
    private String targetOS = "GenericOS"; //Agregamos un  OS

    public Installer downloadInstaller(String OSVersion){
        Installer installer;

        installer = createInstallerPackage(OSVersion);

        return installer;
    }

    protected abstract Installer createInstallerPackage(String OSVersion);


    public String getTargetOS() {
        return targetOS;
    }

    public void setTargetOS(String targetOS) {
        this.targetOS = targetOS;
    }
}
