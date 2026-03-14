package com.example.borrowhub.data.remote.dto;

import com.google.gson.annotations.SerializedName;

public class DashboardStatsDTO {

    @SerializedName("total_items")
    private int totalItems;

    @SerializedName("currently_borrowed")
    private int currentlyBorrowed;

    @SerializedName("available_now")
    private int availableNow;

    @SerializedName("due_today")
    private int dueToday;

    // Getters
    public int getTotalItems() {
        return totalItems;
    }

    public int getCurrentlyBorrowed() {
        return currentlyBorrowed;
    }

    public int getAvailableNow() {
        return availableNow;
    }

    public int getDueToday() {
        return dueToday;
    }
}
