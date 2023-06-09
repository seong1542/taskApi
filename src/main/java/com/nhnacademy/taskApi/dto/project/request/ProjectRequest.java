package com.nhnacademy.taskApi.dto.project.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectRequest {
    private Long projectId;
    private String projectName;
    private String projectDescription;
    private Long statusId;
}