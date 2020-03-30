class Person1 {
    private String[] name;

    public void setName(String[] name){
        this.name=name;
    }
    public String getName(){
        return this.name[0] + " " + this.name[1];
    }

    public static void main(String[] args) {
        var pp1 = new Person1();
        String[] fullname = new String[]{"homer","simpons"};
        pp1.setName(fullname);
        System.out.println(pp1.getName());
        fullname[0] = "summer";
        System.out.println(pp1.getName());     

        var pp2 = new Person();
        String bob = "bob";
        pp2.setName(bob);
        System.out.println(pp2.getName());
        bob = "alice";
        System.out.println(pp2.getName());
    }
}

class Person {
    private String name;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}