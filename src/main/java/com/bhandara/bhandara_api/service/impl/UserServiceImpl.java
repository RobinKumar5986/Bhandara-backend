package com.bhandara.bhandara_api.service.impl;

import com.bhandara.bhandara_api.dto.UserInfoDto;
import com.bhandara.bhandara_api.dto.mapper.UserInfoMapper;
import com.bhandara.bhandara_api.entity.UserInfo;
import com.bhandara.bhandara_api.repository.UserInfoRepository;
import com.bhandara.bhandara_api.service.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServices {

    private final UserInfoRepository userInfoRepository;

    @Override
    public UserInfoDto addUser(UserInfoDto userInfoDto) {
        UserInfo userInfo = UserInfoMapper.userInfoDtoToUserInfo(userInfoDto);
        return UserInfoMapper.userInfoToUserDto(userInfoRepository.save(userInfo));
    }
}
