package entity.util.statics;

public enum Grade {
    //Sınıf bilgilerini içeren enum
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8);

    private int grade;

    Grade(int grade){
        this.grade=grade;
    }
    public int getGrade(){
        return this.grade;
    }
}
