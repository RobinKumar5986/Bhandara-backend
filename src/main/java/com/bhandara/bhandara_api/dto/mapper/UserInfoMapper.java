package com.bhandara.bhandara_api.dto.mapper;

import com.bhandara.bhandara_api.dto.UserInfoDto;
import com.bhandara.bhandara_api.entity.UserInfo;

public class UserInfoMapper {

    public static UserInfoDto userInfoToUserDto(UserInfo userInfo) {
        if (userInfo == null) {
            return null;
        }
        return new UserInfoDto(
                userInfo.getId(),
                userInfo.getPhoneNo(),
                userInfo.getUserUid(),
                userInfo.getLatitude(),
                userInfo.getLongitude(),
                userInfo.getCity(),
                userInfo.getState(),
                userInfo.getCountry(),
                userInfo.getCreatedOn(),
                userInfo.getUpdatedOn()
        );
    }

    public static UserInfo userInfoDtoToUserInfo(UserInfoDto userInfoDto) {
        if (userInfoDto == null) {
            return null;
        }
        return new UserInfo(
                userInfoDto.getId(),
                userInfoDto.getPhoneNo(),
                userInfoDto.getUserUid(),
                userInfoDto.getLatitude(),
                userInfoDto.getLongitude(),
                userInfoDto.getCity(),
                userInfoDto.getState(),
                userInfoDto.getCountry(),
                userInfoDto.getCreatedOn(),
                userInfoDto.getUpdatedOn()
        );
    }
}
