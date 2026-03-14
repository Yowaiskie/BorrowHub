package com.example.borrowhub.data.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "dashboard_stats")
public class DashboardStatsEntity {

    @PrimaryKey
    public int id = 1;

    public int totalItems;
    public int currentlyBorrowed;
    public int availableNow;
    public int dueToday;

    public DashboardStatsEntity(int totalItems, int currentlyBorrowed, int availableNow, int dueToday) {
        this.totalItems = totalItems;
        this.currentlyBorrowed = currentlyBorrowed;
        this.availableNow = availableNow;
        this.dueToday = dueToday;
    }
}
