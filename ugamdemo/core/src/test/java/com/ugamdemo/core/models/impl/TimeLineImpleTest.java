package com.ugamdemo.core.models.impl;

import com.ugamdemo.core.models.TimeLine;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.api.resource.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class TimeLineImpleTest {

    private final AemContext aemContext=new AemContext();

    private TimeLine timeLine;

    @BeforeEach
    void setUp() {
        aemContext.load().json("/timeline.json","/content");
    }

    @Test
    void getTimeLineDetails() {
        Resource json = aemContext.resourceResolver().getResource("/content/timeline");
        TimeLine timeline = json.adaptTo(TimeLine.class);
        List<Map<String, String>> TimeLineInfo = new ArrayList<>();
        assertNotNull(timeline.getTimeLineDetails());
    }
}