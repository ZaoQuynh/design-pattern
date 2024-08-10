package org.example;

import java.util.NoSuchElementException;

public class Matrix<T> implements Iterable<T> {
    private T[][] data;
    private int rows;
    private int cols;

    public Matrix(T[][] data){
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    @Override
    public Iterator<T> interator() {
        return new MatrixInterator();
    }

    public class MatrixInterator implements Iterator<T> {

        private int currentRow = 0;
        private int currentCol = 0;

        @Override
        public boolean hasNext() {
            return this.currentRow < rows
                    && this.currentCol < cols
                    && data[this.currentCol][this.currentRow]!=null;
        }

        @Override
        public T next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException("Không còn phần tử nào trong ma trận.");
            }
            T temp = data[this.currentRow][this.currentCol++];
            if (this.currentCol >= cols){
                this.currentCol = 0;
                this.currentRow ++;
            }
            return temp;
        }

        @Override
        public void remove() {
            if (rows == 0 && cols == 0) {
                throw new IllegalStateException("Không có phần tử nào để xóa.");
            }
            
            int nextRow = 0;
            int nextCol = 0;

            for(int i = currentRow; i < rows; i++){
                for(int j = (i != currentRow)? 0 : currentCol; j < cols; j++){
                    System.out.println(i + ":" + j);
                    if(j == cols - 1){
                        if((i+1) == rows){
                            data[rows - 1][cols - 1] = null;
                            return;
                        }
                        data[i][j] = data[i+1][0];
                    } else {
                        data[i][j] = data[i][j + 1];
                    }
                }
            }

        }
    }
}
