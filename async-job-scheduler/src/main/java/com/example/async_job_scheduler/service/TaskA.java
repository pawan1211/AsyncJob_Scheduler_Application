package com.example.async_job_scheduler.service;



import org.springframework.stereotype.Component;

import java.util.Map;

@Component("TaskA")
public class TaskA implements JobTask {
    @Override
    public void execute(Map<String, String> params) {
        System.out.println("Task A running with params: " + params);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {}
        System.out.println("Task A completed");
    }
}
