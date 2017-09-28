package com.example.aeromvc.models.data;

import com.example.aeromvc.models.enums.WptType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface WptTypeDAO extends CrudRepository<WptType, Integer>{
}
