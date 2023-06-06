package Dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    MyArrayList teeList;

    @BeforeEach

    public void setUp(){
        teeList = new MyArrayList();
    }

    @Test

    public void addElementTest(){

        List list = new MyArrayList();

        list.add("A-String");

        assertEquals(1, teeList.size() );
    }

}