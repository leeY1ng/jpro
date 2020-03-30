import java.util.List;

/**
 * Fanxing_extends
 */
public class Fanxing_extends {

    public static void main(String[] args) {

        Pair<Integer> p = new Pair<>(123, 456);
        int n = add(p);
        System.out.println(n);

        Pair<Number> p1 = new Pair(12.3, 4.56);
        Pair<Integer> p2 = new Pair(123, 456);
        setSame(p1, 100);
        setSame(p2, 200);
        System.out.println(p1.getFirst() + " , " + p1.getLast());
        System.out.println(p2.getFirst() + " , " + p2.getLast());

        Pair<Integer> pp = new Pair(123, 456);
        Pair<?> ppp = pp;
        System.out.println(ppp.getFirst()+" , "+ppp.getLast());

    }

    public class Pair2<T extends Number> {

    }

    public static void setSame(Pair<? super Integer> p, Integer n) {
        p.setFirst(n);
        p.setLast(n);
    }

    public static int add(Pair<? extends Number> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
        p.setFirst(null);
        p.setLast(null);
        return first.intValue() + last.intValue();
    }

    // 只能读list数据 不能修改list数据
    public int sumOfList(List<? extends Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer n = list.get(i);
            sum = sum + n;
        }
        return sum;
    }
}

class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setLast(T last) {
        this.last = last;
    }
}