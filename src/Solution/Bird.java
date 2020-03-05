package Solution;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(this.name + "正在飞");
    }
}
