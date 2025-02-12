package com.bhandara.bhandara_api.controller;

import com.bhandara.bhandara_api.controller.interfaces.Bhandara;
import com.bhandara.bhandara_api.dto.BhandaraDto;
import com.bhandara.bhandara_api.response.RestResponse;
import com.bhandara.bhandara_api.service.BhandaraService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BhandaraImpl implements Bhandara {
    private final BhandaraService bhandaraService;
    @Override
    public RestResponse<String> addBhandara(@RequestBody BhandaraDto bhandaraDTO) {
        return RestResponse.ok(bhandaraService.addBhandara(bhandaraDTO));
    }

    @Override
    public RestResponse<BhandaraDto> getBhandaraById(Long id) {
        return RestResponse.ok(bhandaraService.getBhandaraById(id));
    }
}
