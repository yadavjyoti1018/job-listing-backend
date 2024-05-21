package com.example.joblisting.Service;

import com.example.joblisting.Model.Post;
import com.example.joblisting.Repository.SearchRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SearchRepositoryImpl implements SearchRepository {

    @Override
    public List<Post> findByText(String text) {
        final List<Post> posts = new ArrayList<>();
        return posts;
    }
}
