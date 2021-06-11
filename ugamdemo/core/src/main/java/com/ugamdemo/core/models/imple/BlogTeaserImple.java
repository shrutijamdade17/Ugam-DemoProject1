package com.ugamdemo.core.models.imple;

import com.ugamdemo.core.models.BlogTeaser;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = BlogTeaser.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class BlogTeaserImple implements BlogTeaser {
    @Inject
    String title;

    @Inject
    String desc;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
