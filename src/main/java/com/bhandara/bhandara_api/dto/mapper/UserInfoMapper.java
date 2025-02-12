package com.bhandara.bhandara_api.dto.mapper;

import com.bhandara.bhandara_api.dto.UserInfoDto;
import com.bhandara.bhandara_api.entity.UserInfo;

public class UserInfoMapper {

    public static UserInfoDto userInfoToUserDto(UserInfo userInfo) {
        if (userInfo == null) {
            return null;
        }

        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setId(userInfo.getId());
        userInfoDto.setPhoneNo(userInfo.getPhoneNo());
        userInfoDto.setUserUid(userInfo.getUserUid());
        userInfoDto.setLatitude(userInfo.getLatitude());
        userInfoDto.setLongitude(userInfo.getLongitude());
        userInfoDto.setCity(userInfo.getCity());
        userInfoDto.setState(userInfo.getState());
        userInfoDto.setCountry(userInfo.getCountry());
        userInfoDto.setCreatedOn(userInfo.getCreatedOn());
        userInfoDto.setUpdatedOn(userInfo.getUpdatedOn());

        return userInfoDto;
    }

    public static UserInfo userInfoDtoToUserInfo(UserInfoDto userInfoDto) {
        if (userInfoDto == null) {
            return null;
        }

        UserInfo userInfo = new UserInfo();
        userInfo.setId(userInfoDto.getId());
        userInfo.setPhoneNo(userInfoDto.getPhoneNo());
        userInfo.setUserUid(userInfoDto.getUserUid());
        userInfo.setLatitude(userInfoDto.getLatitude());
        userInfo.setLongitude(userInfoDto.getLongitude());
        userInfo.setCity(userInfoDto.getCity());
        userInfo.setState(userInfoDto.getState());
        userInfo.setCountry(userInfoDto.getCountry());
        userInfo.setCreatedOn(userInfoDto.getCreatedOn());
        userInfo.setUpdatedOn(userInfoDto.getUpdatedOn());

        return userInfo;
    }
}
