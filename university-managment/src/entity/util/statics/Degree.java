package entity.util.statics;

public enum Degree {
    //Sadece 4 seviye olabilir.Doktora degreesine sahip birisi öğrenci olabilir,
    //ayrıca Doktora öğrencisi olan birisi araştırma görevlisi yani lecturer olabilir.
    ASSOCIATE("associate"),
    BACHELOR("bachelor"),
    MASTER("master"),
    DOCTORAL("doctoral");


    private String degree;

    Degree(String degree){
        this.degree=degree;
    }
    public String getDegree(){
        return this.degree;
    }

}
