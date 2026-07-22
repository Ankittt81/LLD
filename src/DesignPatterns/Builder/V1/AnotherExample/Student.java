package DesignPatterns.Builder.V1.AnotherExample;

public class Student {
    private int id;
    private String name;
    private String batchName;
    private int age;
    private int gradYear;

    public Student(StudentBuilder builder){
        this.id = builder.getId();
        if(builder.getAge()<18){
            throw new IllegalArgumentException("Student age can't be less than 18");
        }
        this.age=builder.getAge();
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}
