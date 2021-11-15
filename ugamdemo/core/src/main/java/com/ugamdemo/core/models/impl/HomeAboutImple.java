package com.ugamdemo.core.models.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.ugamdemo.core.models.HomeAbout;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.ExporterOption;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
@Model(adaptables = Resource.class,
        adapters = HomeAbout.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = HomeAboutImple.RESOURCE_TYPE
)
@Exporter(name = "jackson", extensions ="json",selector = "homeabout",
        options = {
                @ExporterOption(name = "SerializationFeature.WRAP_ROOT_VALUE", value="true"),
        })
@JsonRootName("HomeAbout")
public class HomeAboutImple implements HomeAbout {

    final protected static String RESOURCE_TYPE="ugamdemo/components/content/homeabout";

    @Inject
    String img;

    @Inject
    String text;

    @Inject
    String title;

    @Inject
    String desc;

    @Inject
    String btntxt;

    @Inject
    String path;

    @JsonProperty(value = "Component Name")
    public String ComponentName(){
        return "HomeAbout Component";
    }

    @JsonProperty(value = "Image Path")
    @Override
    public String getImg() {
        return img;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @JsonProperty(value = "Description")
    @Override
    public String getDesc() {
        return desc;
    }

    @JsonProperty(value = "Text on Button")
    @Override
    public String getBtntxt() {
        return btntxt;
    }

    @Override
    public String getPath() {
        return path;
    }
}
