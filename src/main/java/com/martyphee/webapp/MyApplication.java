package com.martyphee.webapp;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.ApplicationPath;

/**
 * User: martinphee
 * Date: 7/24/14
 * Time: 2:50 PM
 */
@ApplicationPath("resources")
public class MyApplication extends ResourceConfig {

    public MyApplication() {
        super(MyResource.class);

        register(RolesAllowedDynamicFeature.class);
    }
}
