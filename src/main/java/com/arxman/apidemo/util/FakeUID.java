package com.arxman.apidemo.util;

import java.util.UUID;

public class FakeUID {

    public static String getFakeUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String getFakeUCID() {
        return String.valueOf(System.currentTimeMillis());
    }
}
