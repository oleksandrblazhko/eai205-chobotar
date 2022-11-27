package com.company.water;

public class Health {
    private int psychological_state; 
    private User human_health; 
    private int emotional_condition; 
    private String data; 
    private Сourses course; 

    
    
    public int getPsychological_state() {
        return psychological_state;
    }

    public User getHuman_health() {
        return human_health;
    }

    public int getEmotional_condition() {
        return emotional_condition;
    }

    public String getData() {
        return data;
    }

    public Сourses getCourse() {
        return course;
    }

    public void setPsychological_state(int psychological_state) {
        this.psychological_state = psychological_state;
    }

    public void setHuman_health(User human_health) {
        this.human_health = human_health;
    }

    public void setEmotional_condition(int emotional_condition) {
        this.emotional_condition = emotional_condition;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setCourse(Сourses course) {
        this.course = course;
    }
}
