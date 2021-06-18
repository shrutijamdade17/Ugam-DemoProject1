package com.ugamdemo.core.models.imple;

import com.ugamdemo.core.models.BannerNav;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = BannerNav.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class BannerNavImple implements BannerNav {
    @Inject
    String heading;

    @Inject
    String homecomp;

    @Inject
    String maincomp;

    @Inject
    String path;

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

    @Override
    public String getPath() {
        return path;
    }
}
