package com.example.async_job_scheduler.service;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component("TaskB")
public class TaskB implements JobTask {
    @Override
    public void execute(Map<String, String> params) {
        System.out.println("Task B running with params: " + params);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {}
        System.out.println("Task B completed");
    }
}
