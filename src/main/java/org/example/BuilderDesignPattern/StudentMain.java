package org.example.BuilderDesignPattern;

public class StudentMain {
    public static void main(String[] args) {

        Student.StudentBuilder builder= new Student.StudentBuilder();
        builder.setName("ajay");
        builder.setAddress("hyd");
        builder.setAge(20);
        builder.setBatch("2022");
        builder.setCollege("bvrit");
        Student student=builder.build();

        System.out.println(student);

    }
}
