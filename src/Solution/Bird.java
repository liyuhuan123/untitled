package Solution;

public class Bird {
    public String name;
    //构造方法
    public Bird(String name) {
        this.name = name;
    }
    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
}
