package com.bhandara.bhandara_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "bhandara")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BhandaraInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description" ,columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @CreationTimestamp
    @Column(name = "created_on")
    private Date createdOn;

    @UpdateTimestamp
    @Column(name = "updated_on")
    private Date updatedOn;

    @Column(name = "date_of_bhandara")
    private Long dateOfBhandara;

    @Column(name = "start_time")
    private Double startingTime;

    @Column(name = "end_time")
    private Double endingTime;

    @Column(name = "verification_type")
    private String verificationType;

    @Column(name = "food_type")
    private String foodType; // Veg or Non-Veg

    @Column(name =  "organization_type")
    private String organizationType; // Individual or Organization

    @Column(name = "organization_name")
    private String organizationName; // Can be null

    @Column(name = "phone_no")
    private String phoneNumber;

    @Column(name = "need_volunteer")
    private Boolean needVolunteer;

    @Column(name = "contact_for_volunteer")
    private String contactForVolunteer;

    @Column(name = "special_note", columnDefinition = "TEXT")
    private String specialNote;

    @Column(nullable = false,columnDefinition = "LONGTEXT")
    private String createdBy; // userId

    @Column(columnDefinition = "LONGTEXT")
    private String image;

    @Column(name = "bhandaraType")
    private String bhandaraType; //tells about if it is a everyday or single day bhandara
}


