package com.dcmc.apps.taskmanager.service.mapper;

import com.dcmc.apps.taskmanager.domain.Project;
import com.dcmc.apps.taskmanager.domain.Task;
import com.dcmc.apps.taskmanager.domain.WorkGroup;
import com.dcmc.apps.taskmanager.service.dto.ProjectDTO;
import com.dcmc.apps.taskmanager.service.dto.TaskDTO;
import com.dcmc.apps.taskmanager.service.dto.WorkGroupDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring")
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {
    @Mapping(target = "workGroup", source = "workGroup", qualifiedByName = "workGroupId")
    @Mapping(target = "parentProject", source = "parentProject", qualifiedByName = "projectId")
    TaskDTO toDto(Task s);

    @Named("workGroupId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    WorkGroupDTO toDtoWorkGroupId(WorkGroup workGroup);

    @Named("projectId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ProjectDTO toDtoProjectId(Project project);
}
