/**
 * Main2
 */
public class Main2 {

    public static void main(String[] args) {
        Income[] incomes = new Income[] {
            new Income(3000),
            new Salary(7500),
            new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income[] incomes){

        double total =0;
        for (Income income : incomes) {
            total = total+income.getTax();
        }
        return total;
    }
}

/**
 * 定义私有变量收入 并内部方法计算收入应缴纳税费
 */

class Income {
    protected double income; 

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1;
    }
}

/**
 * 工资继承自收入方法 通过覆写税费方法计算应缴纳税
 */

class Salary extends Income {

    public Salary(double income){
        super(income);
    }

    @Override
    public double getTax(){
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

/**
 * 国务院特殊津贴工资计算方法
 */

class StateCouncilSpecialAllowance extends Income {

    public StateCouncilSpecialAllowance(double income){
        super(income);
    }
    @Override
    public double getTax(){
        return 0;
    }
}

