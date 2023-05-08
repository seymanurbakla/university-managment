package entity.util.statics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public enum Degree {
    //Eğitim seviyesini içeren enum
    //Sadece 4 seviye olabilir.Doktora degreesine sahip birisi öğrenci olabilir,
    //ayrıca Doktora öğrencisi olan birisi araştırma görevlisi yani lecturer olabilir.
    ASSOCIATE("associate",new ArrayList<Grade>(Arrays.asList(Grade.ONE,Grade.TWO))),
    BACHELOR("bachelor",new ArrayList<Grade>(Arrays.asList(Grade.ONE,Grade.TWO,Grade.THREE,Grade.FOUR))),
    MASTER("master",new ArrayList<Grade>(Arrays.asList(Grade.ONE,Grade.TWO))),
    DOCTORAL("doctoral",new ArrayList<Grade>(Arrays.asList(Grade.ONE,Grade.TWO,Grade.THREE,Grade.FOUR)));


    private final String degree;

    private final ArrayList<Grade> AVAILABLE_GRADE_LIST;

    Degree(String degree,ArrayList<Grade> List){
        this.degree=degree;
        this.AVAILABLE_GRADE_LIST=List;
    }
    public String getDegree(){
        return this.degree;
    }
    public ArrayList<Grade> getAVAILABLE_GRADE_LIST(){
        return this.AVAILABLE_GRADE_LIST;
    }
}
