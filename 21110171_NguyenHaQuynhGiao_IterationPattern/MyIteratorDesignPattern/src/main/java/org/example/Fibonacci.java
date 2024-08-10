package org.example;

public class Fibonacci implements Iterable<Integer> {
    private int maxCount;

    public Fibonacci(int maxCount){
        this.maxCount = maxCount;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }

    public class FibonacciIterator implements Iterator<Integer>{
        private int current = 0;
        private int next = 1;
        private int count = 0;

        @Override
        public boolean hasNext() {
            return this.count < maxCount;
        }

        @Override
        public Integer next() {
            int result = this.current;
            int temp = this.current + this.next;
            this.current = this.next;
            this.next = temp;
            this.count++;
            return result;
        }
    }
}
