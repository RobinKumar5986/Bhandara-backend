package com.bhandara.bhandara_api.controller;

import com.bhandara.bhandara_api.dto.UserInfoDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public interface User {

    @Operation(summary = "Create new user", description = "Adds a new user to the system")
    @PostMapping("/add")
    ResponseEntity<UserInfoDto> addUser(@RequestBody UserInfoDto userDto);
}
