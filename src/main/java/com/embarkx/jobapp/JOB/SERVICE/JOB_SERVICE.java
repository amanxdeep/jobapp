package com.embarkx.jobapp.JOB.SERVICE;

import com.embarkx.jobapp.JOB.MODEL.JOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JOB_SERVICE implements INTERFACE_JOB_SERVICE
{
    private List<JOB> jobs= new ArrayList<>();
    private Long nextid=1L;

    //get all jobs
    @Override
    public List<JOB> findAll()
    {
        return jobs;
    }

    //create job
    @Override
    public void createJob(JOB job)
    {
        job.setId(nextid++);
        jobs.add(job);
    }

    //get job by id
    @Override
    public JOB findById(Long id)
    {
        try
        {
            return jobs.stream()
                    .filter(job -> job.getId().equals(id))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Job not found with id: " + id));
        }
        catch (Exception e)
        {
            throw new RuntimeException("Error finding job with id: " + id, e);
        }
    }
}
