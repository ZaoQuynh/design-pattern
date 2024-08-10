package org.example;

public class Main {
    public static void main(String[] args) {
//        10 phần tử đầu trong chuỗi Fibonacci
        Fibonacci fibonacci = new Fibonacci(10);
        Iterator<Integer> iterator = fibonacci.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}