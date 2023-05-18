package service.user_services;

import entity.util.lecture.Lecture;
import entity.user.User;
import entity.util.statics.Days;
import service.Service;

import java.util.ArrayList;
import java.util.HashMap;

public class UserService implements Service<User> {
    //User verilerinin işlendiği katman(sınıf)
    //TODO sınıf tamamlanacak
    void initUser(){

    }
    void listUserAttributes(){

    }
    void removeUser(){

    }
    void modifyUser(){
        //ileride her attribute'a ait olacak şekilde çeşitlendirilecek.
    }
    void listUserLectures(HashMap<Days, ArrayList<Lecture>> list){

    }
}
