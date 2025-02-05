package com.bhandara.bhandara_api.service.impl;

import com.bhandara.bhandara_api.dto.BhandaraDto;
import com.bhandara.bhandara_api.dto.mapper.BhandaraMapper;
import com.bhandara.bhandara_api.entity.BhandaraInfo;
import com.bhandara.bhandara_api.exceptions.ResourceNotFoundException;
import com.bhandara.bhandara_api.repository.BhandaraRepository;
import com.bhandara.bhandara_api.service.BhandaraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BhandataServiceImpl implements BhandaraService {
    private final BhandaraRepository bhandaraRepository;

    @Override
    public BhandaraDto addBhandara(BhandaraDto bhandaraDTO) {
        BhandaraInfo bhandaraInfo = BhandaraMapper.BhandaraDTOToBhandaraInfo(bhandaraDTO);
        return BhandaraMapper.BhandaraInfoToBhandaraDTO(bhandaraRepository.save(bhandaraInfo));
    }

    @Override
    public BhandaraDto getBhandaraById(Long id) {
        BhandaraInfo bhandaraInfo = bhandaraRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with the id: " + id));
        return BhandaraMapper.BhandaraInfoToBhandaraDTO(bhandaraInfo);
    }
}
