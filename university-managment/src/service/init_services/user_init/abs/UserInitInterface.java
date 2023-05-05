package service.init_services.user_init.abs;

import entity.user.User;
import entity.util.Degree;
import entity.util.Grade;
import entity.util.School;
import entity.util.Type;

public interface UserInitInterface {

    User init(String name, String surname, Type type, int age, long userId, String password, Grade grade, Degree degree, School school);


}

