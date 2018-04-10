package com.iteso.factory.installers.installerpackages;

public class WindowsPackage implements InstallerPackage{

	@Override
	public void execute() {
		System.out.println("Executing exe");
	}

	@Override
	public void decode() {
		System.out.println("Decoding windows");
	}

	@Override
	public void extract() {
		System.out.println("Extracting Zip");
	}

	@Override
	public void encode() {
		System.out.println("Encoding Windows");
	}

}