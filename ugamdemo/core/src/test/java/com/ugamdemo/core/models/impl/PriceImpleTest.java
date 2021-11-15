package com.ugamdemo.core.models.impl;

import com.ugamdemo.core.models.Price;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.api.resource.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class PriceImpleTest {

    private final AemContext aemContext=new AemContext();
    private Price price;

    @BeforeEach
    void setUp() {
        Resource json = aemContext.load().json("/price.json","/content");
       // aemContext.addModelsForClasses(PriceImple.class);
        //aemContext.load().json("/price.json","/content");
    }

    @Test
    void getNumber() {
        Resource json = aemContext.currentResource("/content/price");
        Price price = json.adaptTo(Price.class);
        assertEquals("4", price.getNumber());
    }

    @Test
    void getClassName() {
        Resource json = aemContext.currentResource("/content/price");
        Price price = json.adaptTo(Price.class);
        assertEquals("Exclusive", price.getClassName());
    }

    @Test
    void getText() {
        Resource json = aemContext.currentResource("/content/price");
        Price price = json.adaptTo(Price.class);
        assertEquals("For the individuals", price.getText());
    }

    @Test
    void getFeature1() {
        Resource json = aemContext.currentResource("/content/price");
        Price price = json.adaptTo(Price.class);
        assertEquals("Secure Online Transfer", price.getFeature1());
    }

    @Test
    void getFeature2() {
        Resource json = aemContext.currentResource("/content/price");
        Price price = json.adaptTo(Price.class);
        assertEquals("Unlimited Styles for interface", price.getFeature2());
    }

    @Test
    void getFeature3() {
        Resource json = aemContext.currentResource("/content/price");
        Price price = json.adaptTo(Price.class);
        assertEquals("Reliable Customer Service", price.getFeature3());
    }
}