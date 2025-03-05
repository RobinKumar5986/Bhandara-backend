package com.bhandara.bhandara_api.controller.interfaces;

import com.bhandara.bhandara_api.response.RestResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/startServer")
public interface ServerStarer {

    @Operation(summary = "Start Server", description = "this API end point is use to check if the server is up and running")
    @GetMapping("")
    RestResponse<Integer> StartServer();
}
