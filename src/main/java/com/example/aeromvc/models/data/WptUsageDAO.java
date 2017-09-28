package com.example.aeromvc.models.data;

import com.example.aeromvc.models.enums.WptUsage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface WptUsageDAO extends CrudRepository<WptUsage, Integer>{
}
