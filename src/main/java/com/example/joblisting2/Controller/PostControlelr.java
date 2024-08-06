package com.example.joblisting2.Controller;

import com.example.joblisting2.Models.Post;
import com.example.joblisting2.Repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostControlelr {

    List<Post> posts = new ArrayList<>();
    @GetMapping("/")
    public List<Post> test(){
    String name = "sandesh";
    return posts;
    }

    @PostMapping("/add")
    public void add(@RequestBody Post postt){
        posts.add(postt);
    }

//    @GetMapping("/1")
//    public List<Integer> test2(){
//    List<Integer> arr = new ArrayList<>();
//    arr.add(1);
//    Post p = new Post();
//    p.setProfile("developer");
//    p.setDesc("Java Dev");
//    p.setExp("2 years");
//
//    repo.save(p);


//    return arr;


}

