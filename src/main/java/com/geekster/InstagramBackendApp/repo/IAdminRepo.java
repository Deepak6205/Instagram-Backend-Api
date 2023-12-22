package com.geekster.InstagramBackendApp.repo;

import com.geekster.InstagramBackendApp.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
