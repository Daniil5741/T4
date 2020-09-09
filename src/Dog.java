class Dog extends Animal {
    String s = "Dog";

    @Override
    void eat() {
        System.out.println(s);
    }
}