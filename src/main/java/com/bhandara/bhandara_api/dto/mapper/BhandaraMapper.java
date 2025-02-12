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
                entity.getImage(),
                entity.getBhandaraType()
        );
    }

    // Convert BhandaraDTO to Bhandara Entity
    public static BhandaraInfo BhandaraDTOToBhandaraInfo(BhandaraDto dto) {
        if (dto == null) {
            return null;
        }

        BhandaraInfo bhandaraInfo = new BhandaraInfo();
        bhandaraInfo.setId(dto.getId());
        bhandaraInfo.setName(dto.getName());
        bhandaraInfo.setDescription(dto.getDescription());
        bhandaraInfo.setLatitude(dto.getLatitude());
        bhandaraInfo.setLongitude(dto.getLongitude());
        bhandaraInfo.setCreatedOn(dto.getCreatedOn());
        bhandaraInfo.setUpdatedOn(dto.getUpdatedOn());
        bhandaraInfo.setDateOfBhandara(dto.getDateOfBhandara());
        bhandaraInfo.setStartingTime(dto.getStartingTime());
        bhandaraInfo.setEndingTime(dto.getEndingTime());
        bhandaraInfo.setVerificationType(dto.getVerificationType());
        bhandaraInfo.setFoodType(dto.getFoodType());
        bhandaraInfo.setOrganizationType(dto.getOrganizationType());
        bhandaraInfo.setOrganizationName(dto.getOrganizationName());
        bhandaraInfo.setPhoneNumber(dto.getPhoneNumber());
        bhandaraInfo.setNeedVolunteer(dto.getNeedVolunteer());
        bhandaraInfo.setContactForVolunteer(dto.getContactForVolunteer());
        bhandaraInfo.setSpecialNote(dto.getSpecialNote());
        bhandaraInfo.setCreatedBy(dto.getCreatedBy());
        bhandaraInfo.setImage(dto.getImage());
        bhandaraInfo.setBhandaraType(dto.getBhandaraType());

        return bhandaraInfo;
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

