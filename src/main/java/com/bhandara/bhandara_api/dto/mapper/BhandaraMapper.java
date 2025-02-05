package com.bhandara.bhandara_api.dto.mapper;

import com.bhandara.bhandara_api.dto.BhandaraDto;
import com.bhandara.bhandara_api.entity.BhandaraInfo;

import java.util.List;
import java.util.stream.Collectors;

public class BhandaraMapper {

    // Convert Bhandara Entity to BhandaraDTO
    public static BhandaraDto BhandaraInfoToBhandaraDTO(BhandaraInfo entity) {
        if (entity == null) {
            return null;
        }
        return new BhandaraDto(
                entity.getId(),
                entity.getName(),
                entity.getDescription(),
                entity.getLatitude(),
                entity.getLongitude(),
                entity.getCreatedOn(),
                entity.getUpdatedOn(),
                entity.getDateOfBhandara(),
                entity.getStartingTime(),
                entity.getEndingTime(),
                entity.getVerificationType(),
                entity.getFoodType(),
                entity.getOrganizationType(),
                entity.getOrganizationName(),
                entity.getPhoneNumber(),
                entity.getNeedVolunteer(),
                entity.getContactForVolunteer(),
                entity.getSpecialNote(),
                entity.getCreatedBy(),
                entity.getImage()
        );
    }

    // Convert BhandaraDTO to Bhandara Entity
    public static BhandaraInfo BhandaraDTOToBhandaraInfo(BhandaraDto dto) {
        if (dto == null) {
            return null;
        }
        return new BhandaraInfo(
                dto.getId(),
                dto.getName(),
                dto.getDescription(),
                dto.getLatitude(),
                dto.getLongitude(),
                dto.getCreatedOn(),
                dto.getUpdatedOn(),
                dto.getDateOfBhandara(),
                dto.getStartingTime(),
                dto.getEndingTime(),
                dto.getVerificationType(),
                dto.getFoodType(),
                dto.getOrganizationType(),
                dto.getOrganizationName(),
                dto.getPhoneNumber(),
                dto.getNeedVolunteer(),
                dto.getContactForVolunteer(),
                dto.getSpecialNote(),
                dto.getCreatedBy(),
                dto.getImage()
        );
    }

    // Convert List of Bhandara Entities to List of BhandaraDTOs
    public static List<BhandaraDto> BhandaraToBhandaraDTOList(List<BhandaraInfo> entities) {
        return entities.stream().map(BhandaraMapper::BhandaraInfoToBhandaraDTO).collect(Collectors.toList());
    }

    // Convert List of BhandaraDTOs to List of Bhandara Entities
    public static List<BhandaraInfo> BhandaraDTOToBhandaraList(List<BhandaraDto> dtos) {
        return dtos.stream().map(BhandaraMapper::BhandaraDTOToBhandaraInfo).collect(Collectors.toList());
    }
}

