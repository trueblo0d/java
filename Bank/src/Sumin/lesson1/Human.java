package Sumin.lesson1;

public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void man(int speed) {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "run";
            if (i == speed - 1){
                result += ".";
            } else result += ", ";
        }
        System.out.println(result);
    }
}
