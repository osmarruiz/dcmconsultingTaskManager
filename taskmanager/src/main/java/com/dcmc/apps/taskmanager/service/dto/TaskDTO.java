package com.dcmc.apps.taskmanager.service.dto;

import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A DTO for the {@link com.dcmc.apps.taskmanager.domain.Task} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class TaskDTO implements Serializable {

    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private Instant createTime;

    @NotNull
    private Instant updateTime;

    private ZonedDateTime deadline;

    private Boolean archived;

    private ZonedDateTime archivedDate;

    @NotNull
    private WorkGroupDTO workGroup;

    @NotNull
    private PriorityDTO priority;

    @NotNull
    private TaskStatusCatalogDTO status;

    private ProjectDTO parentProject;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }

    public ZonedDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(ZonedDateTime deadline) {
        this.deadline = deadline;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public ZonedDateTime getArchivedDate() {
        return archivedDate;
    }

    public void setArchivedDate(ZonedDateTime archivedDate) {
        this.archivedDate = archivedDate;
    }

    public WorkGroupDTO getWorkGroup() {
        return workGroup;
    }

    public void setWorkGroup(WorkGroupDTO workGroup) {
        this.workGroup = workGroup;
    }

    public PriorityDTO getPriority() {
        return priority;
    }

    public void setPriority(PriorityDTO priority) {
        this.priority = priority;
    }

    public TaskStatusCatalogDTO getStatus() {
        return status;
    }

    public void setStatus(TaskStatusCatalogDTO status) {
        this.status = status;
    }

    public ProjectDTO getParentProject() {
        return parentProject;
    }

    public void setParentProject(ProjectDTO parentProject) {
        this.parentProject = parentProject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskDTO)) {
            return false;
        }

        TaskDTO taskDTO = (TaskDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, taskDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "TaskDTO{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", description='" + getDescription() + "'" +
            ", createTime='" + getCreateTime() + "'" +
            ", updateTime='" + getUpdateTime() + "'" +
            ", deadline='" + getDeadline() + "'" +
            ", archived='" + getArchived() + "'" +
            ", archivedDate='" + getArchivedDate() + "'" +
            ", workGroup=" + getWorkGroup() +
            ", priority=" + getPriority() +
            ", status=" + getStatus() +
            ", parentProject=" + getParentProject() +
            "}";
    }
}
