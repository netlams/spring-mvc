/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dau;

import com.dau.HelloController;
import org.springframework.web.servlet.ModelAndView;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Lam
 */

public class HelloControllerTests extends TestCase{
    
    @Test
    public void testHandleRequestView() throws Exception {
        HelloController ctlr = new HelloController();
        ModelAndView mav = ctlr.handleRequest(null, null);
        assertEquals("hello.jsp", mav.getViewName());    
    }
}
