package com.healthiera.models.dbo;

public class Event extends DBObject
{
    public int Id;
    public string description;
    public EventType type;
    public DateTime start_date_time;
    public DateTime end_date_time;
    public string location;
}
