package Lesson22_Incaps;

public class Student {

    private StringBuilder name;
    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder n) {
        if (n.length() > 3) {
            name = n;
        }else{
               name= new StringBuilder("(недопустимое имя)");
        } 
    }
    
    private int course;
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        } else {
            System.out.println("Такого курса нет");
        }
    }
    
    private int grade;
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }
    
    public void shouInfo() {
        System.out.println("Имя студента " + getName() + ". Студент учится на " + getCourse() + 
                " курсе. " + " Оценка студента " + getGrade() + " баллов");
    }
}

class TestStudent {

    public static void main(String[] args) {
        Student st = new Student();
        st.setCourse(1);
        st.setName(new StringBuilder("Ser"));
        st.setGrade(9);
        st.shouInfo();

    }

}
