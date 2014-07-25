package com.martyphee.webapp;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * User: martinphee
 * Date: 7/24/14
 * Time: 2:50 PM
 */
@ApplicationPath("resources")
public class MyApplication extends Application {

    public MyApplication() {
//        super(MyResource.class);

//        register(RolesAllowedDynamicFeature.class);
        System.out.println("Startup");
    }
}
