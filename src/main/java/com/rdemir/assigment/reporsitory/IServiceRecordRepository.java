package com.rdemir.assigment.reporsitory;

import com.rdemir.assigment.entity.GeoIPServiceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRecordRepository extends JpaRepository<GeoIPServiceRecord,Long> {
}
