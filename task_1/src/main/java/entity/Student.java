package entity;

public class Student {
    String name;
    String gender;
    String classLevel;
    String homeState;
    String major;
    String extracurricularActivity;

    {
        name = null;
        gender = null;
        classLevel = null;
        homeState = null;
        major = null;
        extracurricularActivity = null;
    }

    public Student() {};

    public Student(String name, String gender, String classLevel, String homeState, String major, String extracurricularActivity) {
        this.name = name;
        this.gender = gender;
        this.classLevel = classLevel;
        this.homeState = homeState;
        this.major = major;
        this.extracurricularActivity = extracurricularActivity;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getClassLevel() {
        return classLevel;
    }

    public String getHomeState() {
        return homeState;
    }

    public String getMajor() {
        return major;
    }

    public String getExtracurricularActivity() {
        return extracurricularActivity;
    }

    @Override
    public String toString() {
        return "Student {" +
                "\n\tname: " + name +
                ",\n\tgender: " + gender +
                ",\n\tclass level: " + classLevel +
                ",\n\thome state: " + homeState +
                ",\n\tmajor: " + major +
                ",\n\textracurricular activity: " + extracurricularActivity +
                "\n}";
    }
}
