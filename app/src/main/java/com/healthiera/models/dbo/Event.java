package com.healthiera.models.dbo;

import java.util.Date;

public class Event extends DBObject
{
    public int Id;
    public String description;
    public EventType type;
    public Date start_date_time;
    public Date end_date_time;
    public String location;
}
