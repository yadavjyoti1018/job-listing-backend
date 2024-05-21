package com.example.joblisting.Controller;

import com.example.joblisting.Model.Post;
import com.example.joblisting.Repository.PostRepository;
import com.example.joblisting.Repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.util.List;

@RestController
public class PostController {


    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;


    @RequestMapping(value="/")
    public void  redirect(HttpServletResponse response ) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

    @GetMapping("/posts/{texts}")
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    public Post  addPost(@RequestBody Post post){
        return repo.save(post);

    }

}
