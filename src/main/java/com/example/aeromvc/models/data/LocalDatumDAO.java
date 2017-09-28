package com.example.aeromvc.models.data;

import com.example.aeromvc.models.enums.LocalDatum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface LocalDatumDAO extends CrudRepository<LocalDatum, Integer>{
}
