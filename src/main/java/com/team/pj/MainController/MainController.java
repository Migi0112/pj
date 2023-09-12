package com.team.pj.MainController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/main")
    public String Main() {
        logger.info("main 페이지");
        
        return "main";
    }

    @RequestMapping("topics-detail")
    public String topics_detail() {
        logger.info("topics-detail 페이지");

        return "topics-detail";
    }

    @RequestMapping("topics-listing")
    public String topics_listing() {
        logger.info("topics-listing 페이지");

        return "topics-listing";
    }
}