package com.du.folli.dio.entities.repositories;


import com.du.folli.dio.entities.InstrumentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentRepository extends CrudRepository<InstrumentEntity, Long> {
}
