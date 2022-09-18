package com.example.demo.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;

@RestController
public class JobInvokerController {

@Autowired
MyService myService;


@Autowired
JobLauncher jobLauncher;

@Autowired
Job processJob;

@RequestMapping("/invokejob")
public String handle() throws Exception {

        JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
                .toJobParameters();
        jobLauncher.run(processJob, jobParameters);

    return "Batch job has been invoked";
}



//@CrossOrigin(origins = "http://localhost:4200")	
 @GetMapping("/Service")
 public String test() 
 {	 
	 return myService.myFunction();
 }
	    	
}
