package com.healthiera.models.dbo;

import java.util.Date;

public class Schedule extends DBObject
{
    public int Id;
    public int EventId;
    public RepeatType RepeatType;
    public int RepeatCount;
    public int Interval;
    public Date RepeatTypeStart;
    public Date RepeatTypeEnd;
}