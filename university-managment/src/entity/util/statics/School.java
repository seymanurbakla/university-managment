package entity.util.statics;

import entity.util.Util;

import java.util.ArrayList;
import java.util.Arrays;

public enum School implements Util {
    //Fakülte bilgilerini içeren enum.
    BUSINESS("işletme",new ArrayList<Department>(Arrays.asList(Department.BUSINESS,Department.INTERNATIONAL_TRADE_AND_BUSINESS,Department.MANAGEMENT_INFORMATION_SYSTEM,Department.FINANCE_AND_BANKING))),

    DENTISTRY("diş",new ArrayList<Department>(Arrays.asList(Department.DENTISTRY))),
    LAW("hukuk",new ArrayList<Department>(Arrays.asList(Department.LAW))),
    ISLAMIC_SCIENCE("islami bilimler",new ArrayList<Department>(Arrays.asList(Department.ISLAMIC_SCIENCES)));


    private String school;
    private final ArrayList<Department> AVAILABLE_DEPARTMENT_LIST;
    School(String school,ArrayList<Department> list){
        this.school=school;
        this.AVAILABLE_DEPARTMENT_LIST = list;
    }
    public String getSchool(){
        return this.school;
    }
    public ArrayList<Department> getAVAILABLE_DEPARTMENT_LIST(){
        return this.AVAILABLE_DEPARTMENT_LIST;
    }
}
