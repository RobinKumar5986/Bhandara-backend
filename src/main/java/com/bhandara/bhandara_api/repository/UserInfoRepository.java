package com.bhandara.bhandara_api.repository;

import com.bhandara.bhandara_api.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
    Optional<UserInfo> findByUserUid(String userUid);

    @Query("SELECT u FROM UserInfo u WHERE u.phoneNo = :phoneNo")
    Optional<UserInfo> findByPhoneNoCustom(String phoneNo);
}
