package service.init_services.user_init.abs;

import entity.user.User;
import entity.util.statics.Degree;
import entity.util.statics.Grade;
import entity.util.statics.School;

public interface UserInitInterface {
    //Genel kullanım için yazılmış bir initialize interface.
    User init(String name, String surname, String mail, Rank rank, int age, long userId, String password, Grade grade, Degree degree, School school);


}

