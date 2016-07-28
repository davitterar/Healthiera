package com.healthiera.models.dbo;

public class Schedule extends DBObject
{
    public int Id;
    public int EventId;
    public RepeatType repeat_type;
    public int repeat_count;
    public int interval;
    public DateTime repeat_type_start;
    public DateTime repeat_type_end;
}