package com.iteso.factory;


/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 4/09/18
 */
public abstract class Installer {
    public String name;

    public abstract InstallerPackage getPackage();
    public String getName(){
        return name;
    }
}
