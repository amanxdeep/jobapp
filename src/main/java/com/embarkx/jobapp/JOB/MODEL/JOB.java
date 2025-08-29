package com.embarkx.jobapp.JOB.MODEL;

import java.util.List;

public class JOB
{
    private Long id;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;

    public JOB(String location, String maxSalary, String minSalary, String description, String title, Long id)
    {
        this.location = location;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.description = description;
        this.title = title;
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getMinSalary()
    {
        return minSalary;
    }

    public void setMinSalary(String minSalary)
    {
        this.minSalary = minSalary;
    }

    public String getMaxSalary()
    {
        return maxSalary;
    }

    public void setMaxSalary(String maxSalary)
    {
        this.maxSalary = maxSalary;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }
}
