package com.rdemir.assigment.service;

import com.rdemir.assigment.client.GeoIPWSClient;
import com.rdemir.assigment.client.ServisIdWSClient;
import com.rdemir.assigment.entity.GeoIPServiceRecord;
import com.rdemir.assigment.model.GeoIPWSModel;
import com.rdemir.assigment.model.ServiceIdGeneratorModel;
import com.rdemir.assigment.reporsitory.IServiceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class GeoIpServiceImp implements GeoIPService {

    @Autowired
    GeoIPWSClient serviceClient;

    @Autowired
    ServisIdWSClient IdWSClient;
    @Autowired
    IServiceRecordRepository serviceRecordRepo;


    @Override
    public void save() {
        saveToDb(serviceClient.getIpFromService());
    }

    private void saveToDb(GeoIPWSModel fromService) {

        ServiceIdGeneratorModel idModel= IdWSClient.getIdFromService();;

        GeoIPServiceRecord record = new GeoIPServiceRecord();
        record.setCountryCode(fromService.getCountryCode());
        record.setCountryName(fromService.getCountryName());
        record.setIp(fromService.getIp());
        record.setReturnCode(fromService.getReturnCode());
        record.setReturnCodeDetails(fromService.getReturnCodeDetails());
        record.setId(idModel.getId());//burası2. servis çaprıldığında gelen değerden dolacak

        serviceRecordRepo.save(record);

    }
}
