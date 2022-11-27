package com.company.water;

public class User {
    private String nickname; 
    private String password; 
    private String mail;
    private Health mental_health; 
    private Info information; 
    private Water water; 

    public User(String nickname, String password, String mail) {
        this.nickname = nickname;
        this.password = password;
        this.mail = mail;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public Health getMental_health() {
        return mental_health;
    }

    public Info getInformation() {
        return information;
    }

    public Sleep getSleep() {
        return sleep;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMental_health(Health mental_health) {
        this.mental_health = mental_health;
    }

    public void setInformation(Info information) {
        this.information = information;
    }

    public void setSleep(Sleep sleep) {
        this.sleep = sleep;
    }

    public boolean authorization(String nickname, String password){
        return this.nickname.equals(nickname) && this.password.equals(password);
    }

    @Override
    public String toString(){
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", mail=" + mail + '\'' +
                ", water=" + water +
                "}";
    }

}
