package com.bhandara.bhandara_api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BhandaraDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("latitude")
    private Double latitude;

    @JsonProperty("longitude")
    private Double longitude;

    @JsonProperty("createdOn")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date createdOn;

    @JsonProperty("updatedOn")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date updatedOn;

    @JsonProperty("dateOfBhandara")
    private Date dateOfBhandara;

    @JsonProperty("startingTime")
    private LocalDateTime startingTime;

    @JsonProperty("endingTime")
    private LocalDateTime endingTime;

    @JsonProperty("verificationType")
    private String verificationType;

    @JsonProperty("foodType")
    private String foodType; // Veg || Non-Veg TODO: later I may need to create enum type for this...

    @JsonProperty("organizationType")
    private String organizationType; // Individual or Organization

    @JsonProperty("organizationName")
    private String organizationName; // Nullable

    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("needVolunteer")
    private Boolean needVolunteer;

    @JsonProperty("contactForVolunteer")
    private String contactForVolunteer;

    @JsonProperty("specialNote")
    private String specialNote;

    @JsonProperty("createdBy")
    private String createdBy; // userId

    @JsonProperty("image")
    private String image;
}
