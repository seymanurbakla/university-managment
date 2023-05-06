package entity.util;

public enum Grade {

    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4);

    private int grade;

    Grade(int grade){
        this.grade=grade;
    }
    public int getGrade(){
        return this.grade;
    }
}
