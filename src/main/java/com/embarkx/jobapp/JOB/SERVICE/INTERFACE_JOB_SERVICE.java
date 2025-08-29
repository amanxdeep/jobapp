package com.embarkx.jobapp.JOB.SERVICE;

import com.embarkx.jobapp.JOB.MODEL.JOB;

import java.util.List;

public interface INTERFACE_JOB_SERVICE
{
    List<JOB> findAll();
    JOB findById(Long id);
    void createJob(JOB job);
}
