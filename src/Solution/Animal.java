package Solution;

public class Animal {
    protected String name;
    //构造方法
    public Animal(String name) {
        this.name = name;
    }
    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
}
