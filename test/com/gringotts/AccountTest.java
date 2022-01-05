package com.gringotts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account = new Account(154548, 595985);

    @Test
    void getPnr() {
        assertEquals(154548, account.getPnr());
    }


    @Test
    void getNumber() {
        assertEquals(595985, account.getNumber());
    }

}