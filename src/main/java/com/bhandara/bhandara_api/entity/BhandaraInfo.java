package com.bhandara.bhandara_api.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
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

    @Column(nullable = false, length = 255)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date createdOn;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dateOfBhandara;

    @Column(nullable = false)
    private LocalDateTime startingTime;

    @Column(nullable = false)
    private LocalDateTime endingTime;

    @Column(length = 50)
    private String verificationType;

    @Column(nullable = false, length = 10)
    private String foodType; // Veg or Non-Veg

    @Column(nullable = false, length = 20)
    private String organizationType; // Individual or Organization

    @Column(length = 255, nullable = true)
    private String organizationName; // Can be null

    @Column(nullable = false, length = 15, unique = true)
    private String phoneNumber;

    private Boolean needVolunteer;

    private String contactForVolunteer;

    @Column(columnDefinition = "TEXT")
    private String specialNote;

    @Column(nullable = false, length = 50)
    private String createdBy; // userId

    @Column(columnDefinition = "LONGTEXT")
    private String image;
}


