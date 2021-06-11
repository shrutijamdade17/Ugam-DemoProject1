package com.ugamdemo.core.models.imple;

import com.ugamdemo.core.models.Bannerarea;
import com.ugamdemo.core.models.Practice;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Bannerarea.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class Bannerareaimple implements Bannerarea {
    @Inject
    String heading;

    @Inject
    String homecomp;

    @Inject
    String maincomp;

    @Override
    public String getHeading() {
        return heading;
    }

    @Override
    public String getHomecomp() {
        return homecomp;
    }

    @Override
    public String getMaincomp() {
        return maincomp;
    }
}
