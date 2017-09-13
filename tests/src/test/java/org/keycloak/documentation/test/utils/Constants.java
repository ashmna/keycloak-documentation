package org.keycloak.documentation.test.utils;

import java.util.concurrent.TimeUnit;

public class Constants {

    public static final int HTTP_RETRY = 3;
    public static final int HTTP_CONNECTION_TIMEOUT = 5000;
    public static final int HTTP_READ_TIMEOUT = 10000;
    public static final long LINK_CHECK_EXPIRATION = TimeUnit.DAYS.toMillis(1);

}