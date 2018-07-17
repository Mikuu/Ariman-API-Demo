package com.arxman.apidemo.response;

public class CompareResponseDTO {
    String compareId;

    public CompareResponseDTO(String compareId) {
        this.compareId = compareId;
    }

    public String getCompareId() {
        return compareId;
    }

    public void setCompareId(String compareId) {
        this.compareId = compareId;
    }
}
