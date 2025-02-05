package com.bhandara.bhandara_api.controller;

import com.bhandara.bhandara_api.dto.UserInfoDto;
import com.bhandara.bhandara_api.service.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserImpl implements User{
    private final UserServices userServices;

    @Override
    public ResponseEntity<UserInfoDto> addUser(@RequestBody UserInfoDto userDto) {
        return ResponseEntity.ok(userServices.addUser(userDto));
    }
}
