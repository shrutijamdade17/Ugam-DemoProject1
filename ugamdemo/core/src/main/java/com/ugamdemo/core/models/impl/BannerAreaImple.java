package com.ugamdemo.core.models.impl;

import com.ugamdemo.core.models.BannerArea;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = BannerArea.class,
        resourceType = BannerAreaImple.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class BannerAreaImple implements BannerArea {

    final protected static String RESOURCE_TYPE="ugams/components/content/bannerarea";

    @Inject
    String title;

    @Inject
    String name;

    @Inject
    String info;

    @Inject
    String buttontxt;

    @Inject
    String img;

    @Inject
    String path;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public String getButtontxt() {
        return buttontxt;
    }

    @Override
    public String getImg() {
        return img;
    }

    @Override
    public String getPath() {
        return path;
    }
}
