package com.example.async_job_scheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.example.async_job_scheduler.model.JobRequest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class JobService {

    private final ExecutorService executor = Executors.newFixedThreadPool(5);

    @Autowired
    private ApplicationContext context;

    public void runJob(JobRequest request) {
        String jobName = request.getJobName();

        try {
            JobTask taskBean = (JobTask) context.getBean(jobName);
            executor.submit(() -> taskBean.execute(request.getParameters()));
        } catch (Exception e) {
            throw new IllegalArgumentException("Unknown job: " + jobName);
        }
    }
}
