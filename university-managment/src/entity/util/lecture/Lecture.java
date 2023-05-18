package entity.util.lecture;

import entity.util.Util;
import entity.util.statics.Department;
import entity.util.statics.School;

import java.util.Date;

public class Lecture implements Util {
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
    private Date weeklyStart;
    private Date weeklyEnd;

    public Lecture(String name, String code, int quota, byte ECTS, String lecturerName, long lecturerId, School lectureSchool, Department lectureDepartment,Date weeklyStart,Date weeklyEnd) {
        this.name = name;
        this.code = code;
        this.quota = quota;
        this.ECTS = ECTS;
        this.lecturerName = lecturerName;
        this.lecturerId = lecturerId;
        this.lectureSchool = lectureSchool;
        this.lectureDepartment = lectureDepartment;
        this.weeklyStart = weeklyStart;
        this.weeklyEnd = weeklyEnd;
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

    public Date getWeeklyStart() {
        return weeklyStart;
    }

    public void setWeeklyStart(Date weeklyStart) {
        this.weeklyStart = weeklyStart;
    }

    public Date getWeeklyEnd() {
        return weeklyEnd;
    }

    public void setWeeklyEnd(Date weeklyEnd) {
        this.weeklyEnd = weeklyEnd;
    }
}
