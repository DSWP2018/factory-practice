package com.iteso.factory;

import com.iteso.factory.stores.DownloadFactory;
import com.iteso.factory.stores.LinuxStore;
import com.iteso.factory.stores.MacOSStore;
import com.iteso.factory.stores.WindowsStore;

public class StoreFactory{
    public static DownloadFactory createStore(String operatingSystem){
        switch(operatingSystem) {
            case "Windows":
                return new WindowsStore();
            case "MacOS":
                return new MacOSStore();
            case "Linux":
                return new LinuxStore(); 
        }
        return null;
    }
}