package com.balconyjhtest.homework;

public class Course {
    public int courseID;
    public String courseName;
    public int credit;
    public String teacher;

    public Course() {
    }

    public Course(int courseID) {
        this.courseID = courseID;
    }

    public Course(int courseID, String courseName) {
        this(courseID);
        this.courseName = courseName;
    }

    public Course(int courseID, String courseName, int credit) {
        this(courseID, courseName);
        this.credit = credit;
    }

    public Course(int courseID, String courseName, int credit, String teacher) {
        this(courseID, courseName, credit);
        this.teacher = teacher;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credit=" + credit +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
