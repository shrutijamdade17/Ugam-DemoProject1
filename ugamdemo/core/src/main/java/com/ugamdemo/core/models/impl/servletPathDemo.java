package com.ugamdemo.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import java.io.IOException;

@Component(service = Servlet.class)
@SlingServletPaths(
        value = {"/bin/demoServlet"}
)
public class servletPathDemo extends SlingAllMethodsServlet {

    @Override
    protected void doGet(final SlingHttpServletRequest request, final SlingHttpServletResponse response) throws IOException {
        //String val1 = request.getParameter("val1");
        //String val2 = request.getParameter("val2");
        int value1 = Integer.parseInt(request.getParameter("val1"));
        int value2 = Integer.parseInt(request.getParameter("val2"));
        int sum = value1+value2;
        response.getWriter().println(sum);
    }
}
