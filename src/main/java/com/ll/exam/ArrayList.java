package com.ll.exam;

public class ArrayList {

    int[] arr;
    int size;

    public ArrayList() {
        arr = new int[2];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(int data) {

        sizeUpIFFull();

        arr[size] = data;
        size++;
    }

    private void sizeUpIFFull() {
        if(isFull()){
            sizeUp();
        }
    }

    private void sizeUp() {
        int[] newArr = new int[arr.length * 2];

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    private boolean isFull() {

        return size == arr.length;
    }

    public int get(int i) {
        return arr[i];
    }

    public void removeAt(int index) {

        for(int i = index + 1; i < size; i++){

            arr[i - 1] = arr[i];
        }

        size--;
    }

    public int getArrayLength() {
        return arr.length;
    }

    public void showAllValues() {

        System.out.println("== 전체 데이터 출력 ==");

        for(int i = 0; i < size; i++){
            System.out.printf("%d : %d\n", i, arr[i]);
        }
    }
}
