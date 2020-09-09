import java.util.ArrayList;
import java.util.List;

class C  {
    public static void main(String[] args) {
        ArrayList<Animal> list=new ArrayList<Animal>();
        ArrayList<Dog> list1=new ArrayList<Dog>();
       add(list);
       add1(list1);
       add(list);
       print(list);
       print(list1);
    }
    public static void add(ArrayList<Animal>animals){
        animals.add(new Animal());
    }
    public static void add1(ArrayList<Dog>animals){
        animals.add(new Dog());
    }
    public static void print(ArrayList<? extends Animal> animals){
        for (Animal a:animals) {
           a.eat();
        }
    }
}
