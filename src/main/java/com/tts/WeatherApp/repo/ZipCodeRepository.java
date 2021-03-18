package com.tts.WeatherApp.repo;

import com.tts.WeatherApp.model.ZipCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode, Long> {

//    List<ZipCode> findAll();
////    List<ZipCode> findByZipCode(String zipCode);
//    ZipCode deleteById(long id);
//    ZipCode findById(long id);


}
