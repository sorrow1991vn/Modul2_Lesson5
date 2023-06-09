package Lesson5.ClassOnlyWrite;

public class Student {
    private String name = "Bach", classes = "C04";
    public Student(){
    }
    private void setName(String name){
        this.name=name;
    }
    protected void setClasses(String classes){
        this.classes=classes;
    }
}
