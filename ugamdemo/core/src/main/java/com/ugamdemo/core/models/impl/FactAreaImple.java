package com.ugamdemo.core.models.impl;

import com.ugamdemo.core.models.FactArea;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = FactArea.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class FactAreaImple implements FactArea {
    private static final Logger LOG = LoggerFactory.getLogger(FactAreaImple.class);

    @ChildResource
    Resource factareamulti;

    @Override
    public List<Map<String, String>> getFactAreaDetails() {
        List<Map<String, String>> factAreaMap=new ArrayList<>();
        //try {
           // Resource factAreaDetail=componentResource.getChild("factareamulti");
            if(factareamulti!=null){
                for (Resource fact : factareamulti.getChildren()) {
                    Map<String,String> factarea=new HashMap<>();
                    factarea.put("value",fact.getValueMap().get("value",String.class));
                    factarea.put("text",fact.getValueMap().get("text",String.class));
                    factAreaMap.add(factarea);
                }
            }
       // }catch (Exception e){
            //LOG.info("\n ERROR while getting Fact Area Details {} ",e.getMessage());
        //}
       // LOG.info("\n SIZE {} ",factAreaMap.size());
        return factAreaMap;
    }
}
