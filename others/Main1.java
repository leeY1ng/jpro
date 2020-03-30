/**
 * Main1
 */
public class Main1 {

    public static void main(String[] args) {
        Person p = new Students();
        p.run();
    }
}

class Person {
    public void run(){
        System.out.println("person.run");
    }
}

class Students extends Person {
    @Override
    public void run() {
        System.out.println("student.run");
    }
}

class Income {
    protected double income;
    public double getTax() {
        return income * 0.1;
    }
}

class Salary extends Income {
    @Override
    public double getTax(){
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {
    @Override
    public double getTax(){
        return 0;
    }
}

public double totalTax(Income...income){
    double total =0;
    for (Income income : incomes) {
        total = total+income.getTax();
    }
    return total;
}