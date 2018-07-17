package com.arxman.apidemo.model;

import java.nio.file.Paths;

public class DiffResultVO {
    private String CompareId;
    private String uuid;

    private String imagePathDiff;
    private byte[] imageDiff;

    private String DiffOutput;
    private Float DiffValue;

    public String getCompareId() {
        return CompareId;
    }

    public void setCompareId(String compareId) {
        CompareId = compareId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getImagePathDiff() {
        return imagePathDiff;
    }

    public void setImagePathDiff(String imagePathDiff) {
        this.imagePathDiff = Paths.get(imagePathDiff).toAbsolutePath().toString();
    }

    public byte[] getImageDiff() {
        return imageDiff;
    }

    public void setImageDiff(byte[] imageDiff) {
        this.imageDiff = imageDiff;
    }

    public String getDiffOutput() {
        return DiffOutput;
    }

    public void setDiffOutput(String diffOutput) {
        DiffOutput = diffOutput;
    }

    public Float getDiffValue() {
        return DiffValue;
    }

    public void setDiffValue(String diffValue) {
        DiffValue = Float.valueOf(diffValue);
    }
}
