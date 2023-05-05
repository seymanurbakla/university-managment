package entity.util;

public enum School {

    BUSINESS("işletme"),
    DENTISTRY("diş"),
    LAW("hukuk"),
    ISLAMIC_SCIENCE("islami bilimler");


    private String school;

    School(String school){
        this.school=school;
    }
    public String getSchool(){
        return this.school;
    }
}
