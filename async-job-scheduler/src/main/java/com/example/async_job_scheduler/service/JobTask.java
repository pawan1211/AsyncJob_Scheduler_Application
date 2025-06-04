package com.example.async_job_scheduler.service;

import java.util.Map;

public interface JobTask {
    void execute(Map<String, String> params);
}