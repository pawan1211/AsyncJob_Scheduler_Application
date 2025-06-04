package com.example.async_job_scheduler.model;


import java.util.Map;

public class JobRequest {
    private String jobName;
    private Map<String, String> parameters;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }
}
