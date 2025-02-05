package com.bhandara.bhandara_api.config;

import com.bhandara.bhandara_api.repository.BhandaraRepository;
import com.bhandara.bhandara_api.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RepositoryConfig {

    private final UserInfoRepository userInfoRepository;
    private final BhandaraRepository bhandaraRepository;

    @Autowired
    public RepositoryConfig(UserInfoRepository userInfoRepository, BhandaraRepository bhandaraRepository) {
        this.userInfoRepository = userInfoRepository;
        this.bhandaraRepository = bhandaraRepository;
    }

}
