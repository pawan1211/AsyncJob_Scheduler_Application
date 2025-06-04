package com.example.async_job_scheduler.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.async_job_scheduler.model.JobRequest;
import com.example.async_job_scheduler.service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/run")
    public String triggerJob(@RequestBody JobRequest request) {
        jobService.runJob(request);
        return "Job submitted: " + request.getJobName();
    }
}
