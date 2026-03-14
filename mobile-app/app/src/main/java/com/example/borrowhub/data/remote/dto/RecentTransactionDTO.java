package com.example.borrowhub.data.remote.dto;

import com.google.gson.annotations.SerializedName;

public class RecentTransactionDTO {

    @SerializedName("id")
    private int id;

    @SerializedName("status")
    private String status;

    @SerializedName("borrowed_at")
    private String borrowedAt;

    // Getters
    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getBorrowedAt() {
        return borrowedAt;
    }
}
