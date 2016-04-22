/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wright.dirsyncpro.tools;

import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joe Hendrix <hendrix.11@wright.edu>
 */
public class DateToolTest {

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCmpDates() {
        System.out.println("cmpDates");
        long fAD = 0L;
        long fBD = 0L;
        int gran = 0;
        boolean idlsgran = false;
        int expResult = 0;
        int result = DateTool.cmpDates(fAD, fBD, gran, idlsgran);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNextCompleteHour_0args() {
        System.out.println("getNextCompleteHour");
        Date expResult = null;
        Date result = DateTool.getNextCompleteHour();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNextDayAtThisTime() {
        System.out.println("getNextDayAtThisTime");
        Date time = null;
        Date expResult = null;
        Date result = DateTool.getNextDayAtThisTime(time);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNextDateAtThisTimeAndNumber() {
        System.out.println("getNextDateAtThisTimeAndNumber");
        Date time = null;
        int day = 0;
        Date date = null;
        Date expResult = null;
        Date result = DateTool.getNextDateAtThisTimeAndNumber(time, day, date);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNextCompleteHour_Date() {
        System.out.println("getNextCompleteHour");
        Date time = null;
        Date expResult = null;
        Date result = DateTool.getNextCompleteHour(time);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Date before = Calendar.getInstance().getTime();
        int field = Calendar.DATE;
        int amount = 5;
        Date result = DateTool.add(before, field, amount);
        assert result.after(before);
        result = DateTool.add(result, field, -amount);
        assert result.equals(before) : "result: " + result + "\tbefore: " + before;
    }
}
