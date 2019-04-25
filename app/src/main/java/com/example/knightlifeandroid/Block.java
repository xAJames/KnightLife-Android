package com.example.knightlifeandroid;

import java.sql.Time;

public class Block {
    protected static int startTime;
    protected static long startMilli;
    protected static int endTime;
    protected static long endMilli;

    public Block(long startMilli, long endMilli) {
        this.startMilli = startMilli;
        this.endMilli = endMilli;
    }

    public long getStartMilli() {
        return startMilli;
    }

    public long getEndMilli() {
        return endMilli;
    }
}

