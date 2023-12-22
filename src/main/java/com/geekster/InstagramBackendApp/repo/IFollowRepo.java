package com.geekster.InstagramBackendApp.repo;

import com.geekster.InstagramBackendApp.model.Follow;
import com.geekster.InstagramBackendApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFollowRepo extends JpaRepository<Follow,Integer> {

    List<Follow> findByCurrentUserAndCurrentUserFollower(User targetUser, User follower);
}
