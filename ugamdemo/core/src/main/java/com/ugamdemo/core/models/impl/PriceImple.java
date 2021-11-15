package com.ugamdemo.core.models.impl;

import com.ugamdemo.core.models.Price;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Price.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class PriceImple implements Price {

    @Inject
    String number;

    @Inject
    String className;

    @Inject
    String text;

    @Inject
    String feature1;

    @Inject
    String feature2;

    @Inject
    String feature3;

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getFeature1() {
        return feature1;
    }

    @Override
    public String getFeature2() {
        return feature2;
    }

    @Override
    public String getFeature3() {
        return feature3;
    }
}
