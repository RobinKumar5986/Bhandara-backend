package com.bhandara.bhandara_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "user",
        uniqueConstraints = @UniqueConstraint(
                name = "unique_row",
                columnNames = {"phone_no", "user_uid", "latitude", "longitude", "city", "state", "country"}
        )
)
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "phone_no", nullable = false)
    private String phoneNo;

    @Column(name = "user_uid", nullable = false)
    private String userUid;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;
}
