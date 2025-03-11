package org.example.BuilderDesignPattern;

public class Student {
        private  String name;
        private String address;
        private int age;
        private String college;
        private String batch;

    @Override
    public String toString() {
        return this.name+" " +
                this.age+" " +
                this.college+" "+
                this.address+" "+
                this.batch;
    }

    public static class StudentBuilder{

            public StudentBuilder() {
            }

            private  String name;
            private String address;
            private int age;
            private String college;
            private String batch;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getCollege() {
                return college;
            }

            public void setCollege(String college) {
                this.college = college;
            }

            public String getBatch() {
                return batch;
            }

            public void setBatch(String batch) {
                this.batch = batch;
            }

            public Student build(){

                 Student student=new Student();
                 student.name=this.name;
                 student.address=this.address;
                 student.age=this.age;
                 student.batch=this.batch;
                 student.college=this.college;

                 return  student;

            }



        }



}
