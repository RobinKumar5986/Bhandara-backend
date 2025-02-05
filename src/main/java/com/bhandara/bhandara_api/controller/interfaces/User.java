package com.bhandara.bhandara_api.controller.interfaces;

import com.bhandara.bhandara_api.dto.UserInfoDto;
import com.bhandara.bhandara_api.response.RestResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public interface User {

    @Operation(summary = "Create new user", description = "Adds a new user to the system")
    @PostMapping("/add")
    RestResponse<UserInfoDto> addUser(@RequestBody UserInfoDto userDto);
}
