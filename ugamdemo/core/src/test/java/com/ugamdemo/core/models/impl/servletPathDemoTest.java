package com.ugamdemo.core.models.impl;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.testing.mock.sling.servlet.MockSlingHttpServletRequest;
import org.apache.sling.testing.mock.sling.servlet.MockSlingHttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class servletPathDemoTest {

    private servletPathDemo unitTest = new servletPathDemo();
    //private final AemContext aemContext = new AemContext();

    @BeforeEach
    void setUp() {
    }

    @Test
    void doGet(AemContext aemContext) throws IOException {
        MockSlingHttpServletRequest mockSlingRequest = aemContext.request();
        MockSlingHttpServletResponse mockSlingResponse = aemContext.response();
        Map<String, Object> parameterMap = new HashMap<String, Object>();
        parameterMap.put("val1", 11);
        parameterMap.put("val2", 11);
        mockSlingRequest.setParameterMap(parameterMap);
        unitTest.doGet(mockSlingRequest,mockSlingResponse);
        int result =  Integer.parseInt(mockSlingResponse.getOutputAsString());
        assertEquals(22,result);


    }
}