package com.ugamdemo.core.models.imple;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.ugamdemo.core.models.Testimonial;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.ExporterOption;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Testimonial.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = TestimonialImple.RESOURCE_TYPE
)
@Exporter(name = "jackson", extensions ="json",selector = "testimonial",
        options = {
                @ExporterOption(name = "SerializationFeature.WRAP_ROOT_VALUE", value="true"),
        })
@JsonRootName("testimonial")
public class TestimonialImple implements Testimonial {

    final protected static String RESOURCE_TYPE="ugamdemo/components/content/testimonial";

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
