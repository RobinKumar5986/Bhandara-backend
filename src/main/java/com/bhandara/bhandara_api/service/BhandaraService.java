package com.bhandara.bhandara_api.service;

import com.bhandara.bhandara_api.dto.BhandaraDto;

public interface BhandaraService {
    BhandaraDto addBhandara(BhandaraDto bhandaraDTO);
    BhandaraDto getBhandaraById(Long id);
}
