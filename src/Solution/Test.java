package Solution;

public class Test{
    public static void main(String[] args){
        Cat cat = new Cat("小黑");
        cat.eat("猫粮");
        Bird bird = new Bird("圆圆");
        bird.fly();
        Animal animal = new Animal("小动物");
        System.out.println(animal.name);
    }
}