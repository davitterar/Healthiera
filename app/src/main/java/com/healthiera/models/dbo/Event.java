package com.healthiera.models.dbo;

import java.util.Date;

public class Event extends DBObject
{
    public int Id;
    public String Description;
    public EventType Type;
    public Date StartDateTime;
    public Date EndDateTime;
    public String Location;
}
