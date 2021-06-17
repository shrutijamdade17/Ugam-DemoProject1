package com.ugamdemo.core.models.imple;

import com.ugamdemo.core.models.Portfolio;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Portfolio.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class PortfolioImple implements Portfolio {

    @Inject
    String img;

    @Inject
    String title;

    @Inject
    String text;

    @Inject
    String preview;

    @Override
    public String getImg() {
        return img;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getPreview() {
        return preview;
    }

}
