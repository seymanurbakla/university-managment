package service.init_services.user_init.conc;

import entity.user.User;
import entity.util.statics.Degree;
import entity.util.statics.Grade;
import entity.util.statics.School;
import entity.util.statics.Type;
import service.init_services.user_init.abs.UserInitInterface;

public class UserInitializer implements UserInitInterface {
    //kullanıcıların bilgilerini işleyip tek bir obje oluşturan servis sınıfı.
    @Override
    public User init(String name, String surname,String mail,Type type, int age, long userId, String password, Grade grade, Degree degree, School school) {
        User user = new User(name,surname,mail,type,age,userId,password,grade,degree,school);
        return user;
    }
}
