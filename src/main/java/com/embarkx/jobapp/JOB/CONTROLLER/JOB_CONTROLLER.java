package com.embarkx.jobapp.JOB.CONTROLLER;

import com.embarkx.jobapp.JOB.SERVICE.JOB_SERVICE;
import com.embarkx.jobapp.JOB.MODEL.JOB;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JOB_CONTROLLER
{


    //dependency injection of job_service
    //reason>> to use the methods of job_service in this class
   private JOB_SERVICE job_service;

    public JOB_CONTROLLER(JOB_SERVICE job_service)
    {
        this.job_service = job_service;
    }

    //get all jobs
    @GetMapping("/jobs")
    public List<JOB> findAll()
    {
        return job_service.findAll();
    }

    //create job
    @PostMapping("/jobs")
    public String createJob(@RequestBody JOB job)
    {
        job_service.createJob(job);
        return "Job created successfully";
    }

    //get job by id
    @GetMapping("/jobs/{id}")

//    public JOB findById (@PathVariable Long id)
//    {
//        return job_service.findById(id);
//    }


    public ResponseEntity<JOB> findById(@PathVariable Long id)
	{
		JOB job = job_service.findById(id);
		if(job!=null)
		{
			return  new ResponseEntity<>(job, HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}





}
