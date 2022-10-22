package Model;

import java.util.ArrayList;

public class School {
    private String course;
    private String semester;
    private Aclass classes;
    public School() {
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public Aclass getClasses() {
        return classes;
    }
    public void setClasses(Aclass aclass) {
        this.classes = aclass;
    }
    @Override
    public String toString() {
        return "School [course=" + course + ", semester=" + semester + ", classes=" + classes + "]";
    }

    
}
