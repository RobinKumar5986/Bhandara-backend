package com.bhandara.bhandara_api.repository;

import com.bhandara.bhandara_api.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
}
