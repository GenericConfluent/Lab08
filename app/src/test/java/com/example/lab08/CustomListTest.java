package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList customList = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");
        City vancouver = new City("Vancouver", "BC");
        City toronto = new City("Toronto", "ON");

        customList.addCity(edmonton);
        customList.addCity(calgary);

        assert customList.hasCity(edmonton);
        assert customList.hasCity(calgary);
        assert !customList.hasCity(vancouver);
        assert !customList.hasCity(toronto);
    }
}