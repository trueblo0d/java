package Sumin.lesson9;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Cooking");
            }
        });
    }
}
