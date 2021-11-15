package com.ugamdemo.core.models.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.ugamdemo.core.models.Testimonial;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;

import javax.inject.Inject;
import javax.xml.bind.annotation.XmlRootElement;

@Model(adaptables = Resource.class,
        adapters = Testimonial.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = TestimonialImple.RESOURCE_TYPE
)
/*@Exporter(name = "jackson", extensions ="json",selector = "testimonial",
        options = {
                @ExporterOption(name = "SerializationFeature.WRAP_ROOT_VALUE", value="true"),
        })
@JsonRootName("testimonial")*/

@Exporters({
            @Exporter(name = "jackson", extensions ="json",selector = "testimonialjson"),
            @Exporter(name = "testimonialxml", extensions ="xml",selector = "testimonialxml")
})

@JsonRootName("json-exporter")
@XmlRootElement(name = "xml-exporter")
public class TestimonialImple implements Testimonial {

    final protected static String RESOURCE_TYPE="ugamdemo/components/content/testimonial";

    @Inject
    String desc;

    @Inject
    String name;

    @Inject
    String designation;

    @JsonProperty(value = "Component Name")
    public String ComponentName(){
        return "Testimonial Component";
    }

    @JsonProperty(value = "Description")
    @Override
    public String getDesc() {
        return desc;
    }

    @JsonProperty(value = "Name")
    @Override
    public String getName() {
        return name;
    }

    @JsonProperty(value = "Designation")
    @Override
    public String getDesignation() {
        return designation;
    }
}
