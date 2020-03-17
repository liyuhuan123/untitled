package Java0317;

public class Person {
    private String name = "张三";
    private int age = 18;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("我叫"+name+",今年"+age+"岁");
    }

}
