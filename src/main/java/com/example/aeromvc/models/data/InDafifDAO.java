package com.example.aeromvc.models.data;

import com.example.aeromvc.models.enums.inDafif;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface InDafifDAO extends CrudRepository<inDafif, Integer>{
}
