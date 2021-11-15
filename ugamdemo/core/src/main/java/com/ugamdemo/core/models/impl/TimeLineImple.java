package com.ugamdemo.core.models.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.ugamdemo.core.models.TimeLine;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.ExporterOption;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Model(
        adaptables = Resource.class,
        adapters = TimeLine.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = TimeLineImple.RESOURCE_TYPE
)
@Exporter(name = "jackson", extensions ="json",selector = "timeline",
        options = {
                @ExporterOption(name = "SerializationFeature.WRAP_ROOT_VALUE", value="true"),
        })
@JsonRootName("timeline")

public class TimeLineImple implements TimeLine {

    final protected static String RESOURCE_TYPE="ugamdemo/components/content/timeline";

    private static final Logger LOG = LoggerFactory.getLogger(TimeLineImple.class);

    @ChildResource
    Resource timelinemulti;

    @JsonProperty(value = "Component Name")
    public String ComponentName(){
        return "Timeline Component";
    }

    @JsonProperty(value = "Timeline Details")
    @Override
    public List<Map<String, String>> getTimeLineDetails() {
        List<Map<String, String>> timeLineMap=new ArrayList<>();
        //try {
        // Resource factAreaDetail=componentResource.getChild("factareamulti");
        if(timelinemulti!=null){
            for (Resource fact : timelinemulti.getChildren()) {
                Map<String,String> timelinearea=new HashMap<>();
                timelinearea.put("title",fact.getValueMap().get("title",String.class));
                timelinearea.put("year",fact.getValueMap().get("year",String.class));
                timelinearea.put("result",fact.getValueMap().get("result",String.class));
                timeLineMap.add(timelinearea);
            }
        }
        // }catch (Exception e){
        //LOG.info("\n ERROR while getting Fact Area Details {} ",e.getMessage());
        //}
        // LOG.info("\n SIZE {} ",factAreaMap.size());
        return timeLineMap;
    }
}
