package com.geekster.InstagramBackendApp.repo;

import com.geekster.InstagramBackendApp.model.Comment;
import com.geekster.InstagramBackendApp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICommentRepo extends JpaRepository<Comment,Integer> {
    List<Comment> findByInstaPost(Post myPost);
}
