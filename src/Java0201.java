public class Java0201{
    private String name;//实例成员变量
    private int age;
    private String sex;
    //默认构造函数   构造对象
    public Java0201(){
        this.name = "caocao";
        this.age = 10;
        this.sex = "男";
    }
    //带有三个参数的构造函数
    public Java0201(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show(){
        System.out.println("name:"+name+"age:"+age+"sex:"+sex);
    }
}