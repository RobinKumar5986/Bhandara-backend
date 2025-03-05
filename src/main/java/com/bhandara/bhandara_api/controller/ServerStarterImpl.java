package com.bhandara.bhandara_api.controller;

import com.bhandara.bhandara_api.controller.interfaces.ServerStarer;
import com.bhandara.bhandara_api.response.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ServerStarterImpl implements ServerStarer {
    @Override
    public RestResponse<Integer> StartServer() {
        return  RestResponse.ok(1);
    }
}
