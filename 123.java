/**
 * Main
 * 多级继承 访问超类属性
 */
public class Main_super {

    public static void main(String[] args) {
        var str  = new C();
        str.pr();
    }
}

class A {
    protected final String name = "a";
}

class B extends A {
    protected final String name = "b";

    protected String getSuperName() {
        return super.name;
    }
}

class C extends B {
    protected final String name = "c";

    public void pr(){
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(super.getSuperName());
    }
}