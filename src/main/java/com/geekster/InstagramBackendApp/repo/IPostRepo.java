package com.geekster.InstagramBackendApp.repo;

import com.geekster.InstagramBackendApp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Integer> {
}
