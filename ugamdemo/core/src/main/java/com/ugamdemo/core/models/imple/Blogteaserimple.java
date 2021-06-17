package com.ugamdemo.core.models.imple;

import com.ugamdemo.core.models.Blogteaser;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Blogteaser.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class Blogteaserimple implements Blogteaser {
    @Inject
    String title;

    @Inject
    String desc;

    @Inject
    String img;



    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public String getImg() { return img ;}


}
