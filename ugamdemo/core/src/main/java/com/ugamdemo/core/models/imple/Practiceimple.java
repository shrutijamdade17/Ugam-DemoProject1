package com.ugamdemo.core.models.imple;

import com.ugamdemo.core.models.Practice;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Practice.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class Practiceimple implements Practice {

    @Inject
    String text;

    @Override
    public String getText() {
        return text;
    }
}
