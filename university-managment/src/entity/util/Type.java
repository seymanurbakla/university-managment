package entity.util;

public enum Type {

    ADMIN("admin"),
    STUDENT("öğrenci"),
    LECTURER("akademisyen");


    private String type;

    Type(String type){
        this.type=type;
    }
    public String getType(){
        return this.type;
    }
}
