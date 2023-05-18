package entity.util.statics;

import entity.util.Util;

public enum Rank implements Util{
    //TODO permission listesi eklenecek.
    DEVELOPER("DEVELOPER"),
    STUDENT("STUDENT"),
    ACADEMIC("ACADEMIC"),
    ADMINISTRATIVE("ADMINISTRATIVE");


    private String name;
    private String permission_list;//permission sınıfları oluşturulana kadar burası kalıcak.

    Rank(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
