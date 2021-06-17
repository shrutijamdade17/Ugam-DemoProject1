package com.ugamdemo.core.models.imple;

import com.ugamdemo.core.models.TitleText;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = TitleText.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class TitleTextImple implements TitleText {

    @Inject
    String title;

    @Inject
    String text;

    @Inject
    Boolean paddingBottom;

    @Inject
    Boolean sectionGap;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public Boolean getPaddingBottom() {
        return paddingBottom;
    }

    @Override
    public Boolean getSectionGap() {
        return sectionGap;
    }
}
