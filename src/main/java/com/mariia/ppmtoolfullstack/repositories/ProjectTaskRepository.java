package com.mariia.ppmtoolfullstack.repositories;

import com.mariia.ppmtoolfullstack.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {
}
