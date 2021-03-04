package com.tts.WeatherApp.repository;

import com.tts.WeatherApp.model.ZipCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode, Long> {



//    List<ZipCode> findAll();
//    List<ZipCode> findByZipCode(String zipCode);
//    ZipCode deleteById(long id);
//    ZipCode findById(long id);
}
