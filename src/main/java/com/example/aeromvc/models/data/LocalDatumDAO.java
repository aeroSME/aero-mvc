package com.example.aeromvc.models.data;

import com.example.aeromvc.models.enums.LocalDatum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface LocalDatumDAO extends CrudRepository<LocalDatum, Integer> {
}
