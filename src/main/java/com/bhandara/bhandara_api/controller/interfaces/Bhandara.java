package com.bhandara.bhandara_api.controller.interfaces;

import com.bhandara.bhandara_api.dto.BhandaraDto;
import com.bhandara.bhandara_api.response.RestResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/bhandara")
public interface Bhandara {
    @Operation(summary = "Create new bhandara", description = "Adds a new bhandara to the system")
    @PostMapping("/add")
    RestResponse<String> addBhandara(@RequestBody BhandaraDto bhandaraDTO);

    @Operation(summary = "Create new bhandara", description = "Adds a new bhandara to the system")
    @PostMapping("/get/{id}")
    RestResponse<BhandaraDto> getBhandaraById(@PathVariable Long id);
}
