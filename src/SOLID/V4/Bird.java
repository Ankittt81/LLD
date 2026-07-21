package SOLID.V4;

public abstract class Bird {
    private String name;
    private int age;
    private String color;
    private int noOfWings;
    private String type;

//    public  void fly(){
//        if(type.equals("Peacock")){
//            System.out.println(" Peacock is Flying");
//        }else if(type.equals("Crow")){
//            System.out.println(" Crow is Flying");
//        }
//    }

    //    public void makeSound(){
//        // makeSound function will have implementation of all the sounds of every possible type of bird
//        if(type.equals("Peacock")){
//            System.out.println("EWEWEWEEWEWEWEWEW");
//        } else if (type.equals("Crow")){
//            System.out.println("COW COW COW");
//        } else if (type.equals("new Type")){
//            System.out.println("New Type");
//        }
//    }
    public abstract void makeSound();
    public void eat(){
        System.out.println("Bird : " + name + " is eating!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfWings() {
        return noOfWings;
    }

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
//Now Adding new bird is easy, no need to change a lot of code (OCP)