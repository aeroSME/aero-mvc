package com.example.aeromvc.models.data;

import com.example.aeromvc.models.forms.AerNavSvc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AerNavSvcDAO extends CrudRepository<AerNavSvc, Integer> {
}
