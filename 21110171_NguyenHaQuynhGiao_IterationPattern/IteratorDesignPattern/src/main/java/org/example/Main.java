package org.example;

public class Main {
    public static void main(String[] args) {
        Integer[][] matrixData = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix<Integer> matrix = new Matrix<>(matrixData);

        // Lặp qua ma trận bằng cách sử dụng iterator
        Iterator<Integer> iterator = matrix.interator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Xóa phần tử thứ 5 của ma trận
        Iterator<Integer> iterator2 = matrix.interator();
        for (int i = 0; i < 4; i++) {
            iterator2.next();
        }
        iterator2.remove();

        // In ma trận sau khi xóa phần tử
        Iterator<Integer> iterator3 = matrix.interator();
        while (iterator3.hasNext()) {
            System.out.print(iterator3.next() + " ");
        }
        System.out.println();
    }
}