package com.geekster.InstagramBackendApp.service;

import com.geekster.InstagramBackendApp.repo.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    IAdminRepo adminRepo;
}
