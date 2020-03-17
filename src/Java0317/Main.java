package Java0317;

public class Main {
    public static void main(String[] args){
        Person person = new Person();
        person.setName("caocao");
        String name = person.getName();
        System.out.println(name);
        person.show();
    }
}
