package com.iteso.factory.packages;
import com.iteso.factory.InstallerPackage;

public class MacPackage implements InstallerPackage{
    @Override
    public void execute(){
        System.out.println("Executing for Mac");
    }

    @Override
    public void decode(){
        System.out.println("Decoding for Mac");
    }

    @Override
    public void extract(){
        System.out.println("Extracting for Mac");
    }

    @Override
    public void encode(){
        System.out.println("Ecoding for Mac");
    }
}