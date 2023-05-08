package entity.course;

import entity.util.statics.Department;
import entity.util.statics.School;

public class Lecture {
    //Ders bilgilerini içeren sınıf
    //TODO bu sınıf tamamlanacak.
    private String name;
    private String code;
    private int quota;
    private byte ECTS;
    private String lecturerName;
    private long lecturerId;
    private School lectureSchool;
    private Department lectureDepartment;

    public Lecture(String name, String code, int quota, byte ECTS, String lecturerName, long lecturerId, School lectureSchool, Department lectureDepartment) {
        this.name = name;
        this.code = code;
        this.quota = quota;
        this.ECTS = ECTS;
        this.lecturerName = lecturerName;
        this.lecturerId = lecturerId;
        this.lectureSchool = lectureSchool;
        this.lectureDepartment = lectureDepartment;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public byte getECTS() {
        return ECTS;
    }

    public void setECTS(byte ECTS) {
        this.ECTS = ECTS;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public long getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(long lecturerId) {
        this.lecturerId = lecturerId;
    }

    public School getLectureSchool() {
        return lectureSchool;
    }

    public void setLectureSchool(School lectureSchool) {
        this.lectureSchool = lectureSchool;
    }

    public Department getLectureDepartment() {
        return lectureDepartment;
    }

    public void setLectureDepartment(Department lectureDepartment) {
        this.lectureDepartment = lectureDepartment;
    }
}
