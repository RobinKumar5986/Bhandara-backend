package com.bhandara.bhandara_api.controller.interfaces;

import com.bhandara.bhandara_api.dto.BhandaraDto;
import com.bhandara.bhandara_api.response.RestResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/bhandara")
public interface Bhandara {
    @Operation(summary = "Create new bhandara", description = "Adds a new bhandara to the system")
    @PostMapping("/add")
    RestResponse<String> addBhandara(@RequestBody BhandaraDto bhandaraDTO);

    @Operation(summary = "Finds the bhandara by Id", description = "finds a new bhandara by a particular index")
    @PostMapping("/get/{id}")
    RestResponse<BhandaraDto> getBhandaraById(@PathVariable Long id);

    @Operation(summary = "Get all the bhandara", description = "It gets all the bhandara.")
    @GetMapping("/upcoming")
    RestResponse<List<BhandaraDto>> getAllUpcoming();

    @Operation(summary = "Api to delete all the bhandara" , description = "this api will be used to delete all the bhandaras created")
    @DeleteMapping("/delete/all")
    RestResponse<String> deleteAll();
}
