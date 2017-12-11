package com.gro.model;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public class FixedTimeScheduleJob extends AbstractScheduleJob {
    
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
    
    public FixedTimeScheduleJob() {}
    
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }

}
