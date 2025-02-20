package com.bhandara.bhandara_api.service.impl;

import com.bhandara.bhandara_api.dto.BhandaraDto;
import com.bhandara.bhandara_api.dto.mapper.BhandaraMapper;
import com.bhandara.bhandara_api.entity.BhandaraInfo;
import com.bhandara.bhandara_api.exceptions.ResourceNotFoundException;
import com.bhandara.bhandara_api.repository.BhandaraRepository;
import com.bhandara.bhandara_api.service.BhandaraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BhandataServiceImpl implements BhandaraService {
    private final BhandaraRepository bhandaraRepository;

    @Override
    public String addBhandara(BhandaraDto bhandaraDTO) {
        BhandaraInfo bhandaraInfo = BhandaraMapper.BhandaraDTOToBhandaraInfo(bhandaraDTO);
        bhandaraRepository.save(bhandaraInfo);
        return "Success";
    }

    @Override
    public BhandaraDto getBhandaraById(Long id) {
        BhandaraInfo bhandaraInfo = bhandaraRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bhandara not found with the id: " + id));
        return BhandaraMapper.BhandaraInfoToBhandaraDTO(bhandaraInfo);
    }

    @Override
    public List<BhandaraDto> getAllUpcoming() {
//        long currentTime = System.currentTimeMillis();
        List<BhandaraInfo> bhandaraList = bhandaraRepository.findAll();
        return BhandaraMapper.BhandaraToBhandaraDTOList(bhandaraList);
    }

    @Override
    public String deleteAll() {
        long countBefore = bhandaraRepository.count();
        bhandaraRepository.deleteAll();
        long countAfter = bhandaraRepository.count();
        return countAfter == 0 ? "success no. of rows effected: " + countBefore : "failure";
    }
}
