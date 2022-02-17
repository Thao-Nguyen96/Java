package gst.trainingcourse_ex11_thaonx4.java;

public class User {
    String name,nameClass;
    Integer age;
    Double point;

    public User(String name, String nameClass, Integer age, Double point) {
        this.name = name;
        this.nameClass = nameClass;
        this.age = age;
        this.point = point;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getNameClass() {
//        return nameClass;
//    }
//
//    public void setNameClass(String nameClass) {
//        this.nameClass = nameClass;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public Double getPoint() {
//        return point;
//    }
//
//    public void setPoint(Double point) {
//        this.point = point;
//    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", nameClass='" + nameClass + '\'' +
                ", age=" + age +
                ", point=" + point +
                '}';
    }
}
