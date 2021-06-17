package com.ugamdemo.core.models.imple;

import com.ugamdemo.core.models.Testimonial;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Testimonial.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TestimonialImple implements Testimonial {

    @Inject
    String desc;

    @Inject
    String name;

    @Inject
    String designation;

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesignation() {
        return designation;
    }
}
