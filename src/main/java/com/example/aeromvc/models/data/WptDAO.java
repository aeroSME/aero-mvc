package com.example.aeromvc.models.data;

import com.example.aeromvc.models.forms.Wpt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface WptDAO extends CrudRepository<Wpt, Integer> {

}
