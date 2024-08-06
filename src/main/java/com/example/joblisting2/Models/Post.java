package com.example.joblisting2.Models;

//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collation = "JobPosts")
public class Post {
    private  String profile;
    private  String exp;
    private  String tech[];
    private  String desc;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String[] getTech() {
        return tech;
    }

    public void setTech(String[] tech) {
        this.tech = tech;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
