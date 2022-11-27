package com.company.water;

public class Water {

    private int water_quality; 
    private String data; 
    private User human; 
    private int amount_water; 


    public User getHuman() {
        return human;
    }

    public int recordWater(int water_quality, int amount_water, String data){
        this.amount_water = amount_water; 
        this.water_quality = water_quality; 
        this.data = data; 
        return 0;
    }

    public int[] viewWater(){ 
        int A[] = new int[2]; 
        A[0] = water_quality; 
        A[1] = amount_water; 
        return A; 
    }

    @Override
    public String toString() {
        return "Water{" +
                "water_quality=" + water_quality +
                ", amount_water=" + amount_water +
                ", data=" + data +
                '}';
    }
}
