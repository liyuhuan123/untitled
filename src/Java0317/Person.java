package Java0317;

public class Person {
    private String name;//实例成员变量
    private int age;
    private String sex;
    public Person(){
        System.out.println("I an person init()!");
    }
    //实例代码块
    {
        this.name = "小名";
        this.age = 12;
        this.sex = "男";
        System.out.println("I an instance init()!");
    }
    public void show(){
        System.out.println("name:"+name+"age:"+age+"sex:"+sex);
    }
}
