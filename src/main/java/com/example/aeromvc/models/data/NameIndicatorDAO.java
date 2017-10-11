package com.example.aeromvc.models.data;

import com.example.aeromvc.models.enums.NameIndicator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface NameIndicatorDAO extends CrudRepository<NameIndicator, Integer>{
}
