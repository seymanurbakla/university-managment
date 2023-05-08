package entity.util.statics;

public enum Degree {

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
