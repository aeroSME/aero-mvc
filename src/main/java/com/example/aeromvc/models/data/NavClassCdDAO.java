package com.example.aeromvc.models.data;

import com.example.aeromvc.models.enums.NavClassCd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface NavClassCdDAO extends CrudRepository<NavClassCd, Integer>{
}
