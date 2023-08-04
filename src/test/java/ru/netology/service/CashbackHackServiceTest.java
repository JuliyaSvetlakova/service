package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class CashbackHackServiceTest {

    /*@Test
    public void theAmountIs1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int expected  = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }*/
    @Test
    public void theAmountIsMoreThan1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1_001;

        int expected  = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void theAmountIsLessThan1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected  = 1;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
