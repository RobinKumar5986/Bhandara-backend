package com.bhandara.bhandara_api.service;

import com.bhandara.bhandara_api.dto.BhandaraDto;

import java.util.List;

public interface BhandaraService {
    String addBhandara(BhandaraDto bhandaraDTO);
    BhandaraDto getBhandaraById(Long id);
    List<BhandaraDto> getAllUpcoming();

    String deleteAll();
}
