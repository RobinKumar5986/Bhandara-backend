package com.bhandara.bhandara_api.config;

import com.bhandara.bhandara_api.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class RepositoryConfig {
    private final UserInfoRepository userInfoRepository;

    @Autowired
    public RepositoryConfig(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @Bean
    public UserInfoRepository userInfoRepository() {
        return this.userInfoRepository;
    }
}