import java.util.Arrays;

class Book {
    public String name;
    public String author;
    public boolean isbn;
    public double price;
}

class City {
    public String name;
    public double latitude;
    public double longitude;
}

class Dog {
    private String name;
    private int age;
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("invalid name");
        }
        this.name=name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

class Person1 {
    private String name;
    private int birth;

    public void setBirth(int birth){
        this.birth = birth;
    }
    public int getAge() {
        return calcAge(2019);
    }
    private int calcAge(int currentYear){
        return currentYear - this.birth;
    }
}

class Group{
    private String[] names;
    // public void setNames(String...names){
        public void setNames(String[] names) {
        this.names = names;
    }
    public String[] getNames(){
        return this.names;
    }
}


class Person {
    public String name;
    public int age;

    public static void main(String[] args) {

        Group nrr = new Group();
        // nrr.setNames("1","2","3","4","5");
        nrr.setNames(new String[]{"1","2","3","4","5"});
        System.out.println(Arrays.toString(nrr.getNames()));

        Person ming = new Person();
        ming.name = "xiaoming";
        ming.age =12;
        System.out.println(ming.name);
        var hong = new Person();
        hong.name = "xiaohong";
        System.out.println(hong.name);

        var dd1 = new Dog();
        int n = 1;
        dd1.setAge(n);
        System.out.println("n=1,dd1.age:");
        System.out.println(dd1.getAge());
        n=2;
        System.out.println("n=2,dd1.age");
        System.out.println(dd1.getAge());
        

        Book injava = new Book();
        injava.author = "bruce";
        injava.name="thinkinginjava";
        injava.isbn=true;

        var d= new Dog();
        d.setName("dog1");
        d.setAge(1);
        System.out.println("dogName: "+d.getName()+" dogAge: "+d.getAge());

        var p = new Person1();
        p.setBirth(2008);
        System.out.println(p.getAge());
    }
}