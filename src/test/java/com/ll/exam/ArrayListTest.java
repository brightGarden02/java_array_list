package com.ll.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    private ArrayList al;

    @BeforeEach
    void beforeEach() {
        al = new ArrayList();

    }

    @Test
    void ArrayList_클래스가_존재한다() {
    }

    @Test
    void size() {
        assertEquals(0, al.size());
    }

    @Test
    void add() {
        al.add(100);
    }

    @Test
    void get() {

        al.add(100);
        int rs = al.get(0);

        assertEquals(100, rs);
    }




}