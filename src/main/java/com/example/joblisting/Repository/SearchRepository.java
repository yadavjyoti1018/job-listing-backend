package com.example.joblisting.Repository;

import com.example.joblisting.Model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
