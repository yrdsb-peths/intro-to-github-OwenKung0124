public class Dog {
    private String breed;
    private int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.println("Woof!");
    }
}