import java.util.StringJoiner;

/**
 * CentralClass
 */
public class CentralClass {

    public static void main(String[] args) {

        Adder add = new Adder();
        add.add(3).add(5).inc().add(10);
        System.err.println(add.value());

        String[] names = {"bob","alice","grace"};
        var sb = new StringBuilder();
        sb.append("hello ");
        for (String name : names) {
            sb.append(name).append(",");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("!");
        System.out.println(sb.toString());

        String[] names1 = {"alice","bob","cat"};
        var sj = new StringJoiner(", ", "hello ", " !");
        for (String name : names1) {
            sj.add(name);
        }
        System.out.println(sj.toString());


        String[] hs = {"h","e","l","l","o"};
        var h = String.join(", ", hs);
        System.out.println(h);

        Integer n = Integer.valueOf(123);
        int n2 = n.intValue();
        System.out.println(n2);

    }
}

class Adder {
    private int sum = 0;

    public Adder add(int n){
        sum+=n;
        return this;
    }

    public Adder inc(){
        sum++;
        return this;
    }

    public int value(){
        return sum;
    }
}
