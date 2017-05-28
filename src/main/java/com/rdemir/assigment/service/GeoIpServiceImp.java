package com.rdemir.assigment.service;

import com.rdemir.assigment.client.GeoIPWSClient;
import com.rdemir.assigment.client.ServiceIdWSClient;
import com.rdemir.assigment.entity.GeoIPServiceRecord;
import com.rdemir.assigment.model.GeoIPWSModel;
import com.rdemir.assigment.model.ServiceIdModel;
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
    //@Qualifier(value = "serviceIdWSClient")
    ServiceIdWSClient serviceIdWSClient;

    @Autowired
    IServiceRecordRepository serviceRecordRepo;


    @Override
    public void save() {
        saveToDb(serviceClient.getIpFromService());
    }

    private void saveToDb(GeoIPWSModel fromService) {

        ServiceIdModel idModel = serviceIdWSClient.getIdFromService();

        GeoIPServiceRecord record = new GeoIPServiceRecord();
        record.setCountryCode(fromService.getCountryCode());
        record.setCountryName(fromService.getCountryName());
        record.setIp(fromService.getIp());
        record.setReturnCode(fromService.getReturnCode());
        record.setReturnCodeDetails(fromService.getReturnCodeDetails());
        record.setId(idModel.getValue().getId());//burası2. servis çaprıldığında gelen değerden dolacak

        serviceRecordRepo.save(record);

    }
}
