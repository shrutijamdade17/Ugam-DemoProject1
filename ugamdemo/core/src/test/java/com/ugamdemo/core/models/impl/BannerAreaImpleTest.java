package com.ugamdemo.core.models.impl;

import com.ugamdemo.core.models.BannerArea;
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
class BannerAreaImpleTest {

    private final AemContext aemContext = new AemContext();
    private BannerArea bannerArea;

    @BeforeEach
    void setUp() {
        Resource json = aemContext.load().json("/bannerarea.json","/content");
    }

    @Test
    void getTitle() {
        Resource json = aemContext.currentResource("/content/banner");
        BannerArea bannerArea = json.adaptTo(BannerArea.class);
        assertEquals("This is me",bannerArea.getTitle());
    }
    @Test
    void getName() {
        Resource json = aemContext.currentResource("/content/banner");
        BannerArea bannerArea = json.adaptTo(BannerArea.class);
        assertEquals("Philip Gilbert",bannerArea.getName());
    }

    @Test
    void getInfo() {
        Resource json = aemContext.currentResource("/content/banner");
        BannerArea bannerArea = json.adaptTo(BannerArea.class);
        assertEquals("You will begin.",bannerArea.getInfo());
    }

    @Test
    void getButtontxt() {
        Resource json = aemContext.currentResource("/content/banner");
        BannerArea bannerArea = json.adaptTo(BannerArea.class);
        assertEquals("discover now",bannerArea.getButtontxt());
    }

    @Test
    void getImg() {
        Resource json = aemContext.currentResource("/content/banner");
        BannerArea bannerArea = json.adaptTo(BannerArea.class);
        assertEquals("/content/dam/ugamdemo/hero-img.png",bannerArea.getImg());
    }

    @Test
    void getPath() {
        Resource json = aemContext.currentResource("/content/banner");
        BannerArea bannerArea = json.adaptTo(BannerArea.class);
        assertEquals("/content/ugamdemo/us/en/about",bannerArea.getPath());
    }
}