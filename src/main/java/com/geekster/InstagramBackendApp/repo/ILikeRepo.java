package com.geekster.InstagramBackendApp.repo;

import com.geekster.InstagramBackendApp.model.Like;
import com.geekster.InstagramBackendApp.model.Post;
import com.geekster.InstagramBackendApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILikeRepo extends JpaRepository<Like,Integer> {

    List<Like> findByInstaPost(Post myPost);

    List<Like> findByInstaPostAndLiker(Post instaPostToBeLiked, User liker);
}
