package com.company.water;

public class Info {
    private String[] video; 
    private String[] articles; 
    private String[] news; 
    private String support; 
    private String[] courses; 


    public String[] viewVideo(){
        return video;
    }
    public String[] viewArticles(){
        return articles;
    }
    public String[] viewNews(){
        return news;
    }
    public String[] viewCourses(){
        return courses;
    }

    public void setVideo(String[] video) {
        this.video = video;
    }

    public void setArticles(String[] articles) {
        this.articles = articles;
    }

    public void setNews(String[] news) {
        this.news = news;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
