package com.mariia.ppmtoolfullstack.services;

import com.mariia.ppmtoolfullstack.domain.ProjectTask;
import com.mariia.ppmtoolfullstack.repositories.BacklogRepository;
import com.mariia.ppmtoolfullstack.repositories.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    @Autowired
    private BacklogRepository backlogRepository;

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask addProjectTask(){
        //PTs to be added to specific project, project != null, BL exists
        //set the bl to pt
        // we want our project sequence to be like this: IDPRO-1 IDPRO-2 .... 100 101
        // Update the BL SEQUENCE

        //INITIAL priority when priority null
        // INITIAL status when status is nill


    }

}
