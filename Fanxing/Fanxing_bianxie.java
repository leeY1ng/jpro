/**
 * Fanxing_bianxie
 */
public class Fanxing_bianxie {

    public static void main(String[] args) {
        Pair2<String, Integer> p = new Pair2<String,Integer>("abc", 123);
    }

    public class Pair<T> {
        private T first;
        private T last;
        public Pair(T fist, T last){
            this.first = first;
            this.last = last;
        }

        public T getFirst() {
            return first;
        };
        public T getLast() {
            return last;
        }
        public static <K> Pair<K> create(K first, K last) {
            return new Pair<K>(first, last);
        }
    }

    public class Pair2<T, R> {
        private T first;
        private R last;
        public Pair2(T first, R last) {
            this.first = first;
            this.last = last;
        }
        public T getFirst() {

        }
        public R getLast() {

        }
    }
}