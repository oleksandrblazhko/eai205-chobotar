package com.company;

import com.company.water.Water;
import com.company.water.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("Aleksandra", "fkfkwaf1324", "chob@gmail.com"); 
        Water water = new Water(); 
        water.recordWater(2, 1, "27.11.2003"); 
        user.setWater(water); 
        System.out.println(user); 
    }
}
