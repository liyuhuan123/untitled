package Java0317;

public class Main {
    public static void main(String[] args){
        //产生对象 实例化对象
        Person person = new Person();//person为对象的引用
        System.out.println(person.name);
        System.out.println(person.age);
        //System.out.println(person.count);//会有警告
        //正确访问方式
        System.out.println(Person.count);
        System.out.println(Person.COUNT);
        Person.staticTest();
        //总结：所有被static所修饰的方法或者属性，全部不依赖于对象
        person.eat();
        person.sleep();
    }
}
