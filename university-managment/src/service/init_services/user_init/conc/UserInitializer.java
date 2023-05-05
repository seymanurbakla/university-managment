package service.init_services.user_init.conc;

import entity.user.User;
import entity.util.Degree;
import entity.util.Grade;
import entity.util.School;
import entity.util.Type;
import service.init_services.user_init.abs.UserInitInterface;

public class UserInitializer implements UserInitInterface {


    @Override
    public User init(String name, String surname, Type type, int age, long userId, String password, Grade grade, Degree degree, School school) {
        return null;
    }
}
