package com.mariia.ppmtoolfullstack.repositories;

import com.mariia.ppmtoolfullstack.domain.Backlog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, Long> {
}
