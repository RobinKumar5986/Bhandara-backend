package com.bhandara.bhandara_api.repository;

import com.bhandara.bhandara_api.entity.BhandaraInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BhandaraRepository extends JpaRepository<BhandaraInfo,Long> {

}
