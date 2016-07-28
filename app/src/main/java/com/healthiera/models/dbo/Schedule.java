package com.healthiera.models.dbo;

import java.util.Date;

public class Schedule extends DBObject
{
    public int Id;
    public int EventId;
    public RepeatType repeat_type;
    public int repeat_count;
    public int interval;
    public Date repeat_type_start;
    public Date repeat_type_end;
}