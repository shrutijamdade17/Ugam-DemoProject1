package com.ugamdemo.core.utils;

import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ResolverUtils {

    private ResolverUtils() {

    }
    public static final String SERVICE_USER = "ugamdemoserviceuser";

    public static ResourceResolver newResolver(ResourceResolverFactory resourceResolverFactory) throws LoginException {
        final Logger LOG = LoggerFactory.getLogger(ResolverUtils.class);
        final Map <String, Object > param = Collections.singletonMap(ResourceResolverFactory.SUBSERVICE, (Object) "getResourceResolver");
        ResourceResolver resourceResolver = resourceResolverFactory.getServiceResourceResolver(param);
        //final Map<String, Object> paramMap = new HashMap<String, Object>();
        LOG.info("\n inside ResolverUtils");
        //paramMap.put(resourceResolverFactory.SUBSERVICE, SERVICE_USER);
        LOG.info("\n inside ResolverUtils");
       // ResourceResolver resolver = null;
        LOG.info("Map Values"+param.toString());
        //resolver = resourceResolverFactory.getServiceResourceResolver(paramMap);

        LOG.info("\n inside ResolverUtils-----------"+resourceResolver);
        return resourceResolver;
    }
}

