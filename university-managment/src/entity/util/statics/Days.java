package entity.util.statics;

import entity.util.Util;

public enum Days implements Util {
    //Haftanın her birini tanımlayan enum
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5);
    private int dayNumber;
    Days(int dayNumber){
        this.dayNumber = dayNumber;
    }
    public int getDayNumber(){
        return this.dayNumber;
    }
}
