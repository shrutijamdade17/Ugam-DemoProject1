package com.ugamdemo.core.models.imple;

import com.ugamdemo.core.models.Services;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Services.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
        )
public class Servicesimple implements Services {


    @Inject
    String service;

    @Inject
    String desc;

    @Override
    public String getService() {
        return service;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
