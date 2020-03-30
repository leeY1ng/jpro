import java.util.Arrays;

/**
 * Main3
 */
public class Main3 {

    public static void main(String[] args) {
        Income[] incomes = new Income[] {
            new Income(3000),
            new Salary(7500),
            new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    
        
        Person1 per1 = new Person1("summer");
        Person1 per2 = new Person2("spring");
        // Person2 per3 = new Person1("autumn");
        Person2 per4 = new Person2("winter");

        System.out.println(per1.sayHello());
        System.out.println(per2.sayHello());
        // System.out.println(per3.sayHello());
        System.out.println(per4.sayHello());
    }

    public static double totalTax(Income[] incomes){
        double tax = 0;
        for (Income income : incomes) {
            tax = tax + income.getTax();
        }
        return tax;
    }
}

class Income {
    protected double income;

    public Income (double income){
        this.income = income;
    }

    public double getTax(){
        return income*0.1;
    }
}

class Salary extends Income {

    public Salary (double income){
        super(income);
    }

    @Override
    public double getTax(){
        if (income<=5000) {
            return 0;
        }
        return (income-5000)*0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {

    public StateCouncilSpecialAllowance (double income) {
        super(income);
    }

    @Override
    public double getTax(){
        return 0;
    }
}

// class Person {

//     protected String name;
//     @Override
//     public String toString(){
//         return "person.name"+name;
//     }

//     @Override
//     public boolean equals(Object o){
//        if (o instanceof Person) {
//            Person p = (Person) o;

//            return this.name.equals(p.name);
//        }
//        return false;
//     }

//     @Override
//     public int hasCode(){
//         return this.name.hashCode();
//     }
// }

// final
 class Person1 {
    protected final String name;

    public Person1 (String name) {
        this.name = name;
    }
    public String sayHello(){
        return "hello"+name;
    }
    public final String eating(){
        return "p1 eatsth";
    }
}

class Person2 extends Person1 {
    public Person2(String name) {
        super(name);
    }
    @Override
    public String sayHello(){
        return super.sayHello()+"!";
    }
    // @Override
    // public String eating(){
    //     return "p2 eatsth";
    // }
}