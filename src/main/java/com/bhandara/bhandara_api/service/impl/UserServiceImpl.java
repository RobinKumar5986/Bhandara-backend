package com.bhandara.bhandara_api.service.impl;

import com.bhandara.bhandara_api.dto.UserInfoDto;
import com.bhandara.bhandara_api.dto.mapper.UserInfoMapper;
import com.bhandara.bhandara_api.entity.UserInfo;
import com.bhandara.bhandara_api.repository.UserInfoRepository;
import com.bhandara.bhandara_api.service.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServices {

    private final UserInfoRepository userInfoRepository;

    @Override
    public UserInfoDto addUser(UserInfoDto userInfoDto) {
        String phoneNo = userInfoDto.getPhoneNo();
        Optional<UserInfo> existingUserOptional = userInfoRepository.findByPhoneNoCustom(phoneNo);

        UserInfo userInfo;
        if (existingUserOptional.isPresent()) {
            UserInfo existingUser = existingUserOptional.get();
            userInfoDto.setId(existingUser.getId());
            userInfoDto.setCreatedOn(existingUser.getCreatedOn());
        }

        userInfo = UserInfoMapper.userInfoDtoToUserInfo(userInfoDto);
        return UserInfoMapper.userInfoToUserDto(userInfoRepository.save(userInfo));
    }
}
