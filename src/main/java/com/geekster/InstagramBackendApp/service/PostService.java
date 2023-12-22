package com.geekster.InstagramBackendApp.service;


import com.geekster.InstagramBackendApp.model.Post;
import com.geekster.InstagramBackendApp.repo.IPostRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;


    @Autowired
    LikeService likeService;

    @Autowired
    CommentService commentService;





    public void createInstaPost(Post instaPost) {

        //set creation time before saving :
        instaPost.setPostCreatedTimeStamp(LocalDateTime.now());

        postRepo.save(instaPost);
    }

    public Post getPostById(Integer postId) {
        return  postRepo.findById(postId).orElseThrow();

    }


    @Transactional // iss annotation ka matlab ki niche jo 3 kaam kiye hai hum wo tino execute hona chahiye
    public void removeById(Integer postId) {

        Post myPost = postRepo.findById(postId).orElseThrow();

        //delete all likes
        likeService.clearLikesByPost(myPost);


        // delete all comments
        commentService.clearCommentsByPost(myPost);

        //finally delete post
        postRepo.deleteById(postId);
    }
}
