package com.ugamdemo.core.models.imple;
import com.ugamdemo.core.models.TestimonialMulti;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = TestimonialMulti.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)

public class TestimonialMultiImple implements TestimonialMulti{

    @ChildResource
    Resource testimonialmulti;

    @Override
    public List<Map<String, String>> getTestimonialMultiDetails() {
        List<Map<String, String>> testimonialMap=new ArrayList<>();
        //try {
        // Resource factAreaDetail=componentResource.getChild("factareamulti");
        if(testimonialmulti!=null){
            for (Resource testimonial : testimonialmulti.getChildren()) {
                Map<String,String> testimonialarea=new HashMap<>();
                testimonialarea.put("desc",testimonial.getValueMap().get("desc",String.class));
                testimonialarea.put("name",testimonial.getValueMap().get("name",String.class));
                testimonialarea.put("designation",testimonial.getValueMap().get("designation",String.class));
                testimonialMap.add(testimonialarea);
            }
        }
        // }catch (Exception e){
        //LOG.info("\n ERROR while getting Fact Area Details {} ",e.getMessage());
        //}
        // LOG.info("\n SIZE {} ",factAreaMap.size());
        return testimonialMap;
    }
}
