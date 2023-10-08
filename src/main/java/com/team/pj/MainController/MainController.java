package com.team.pj.MainController;

import com.team.pj.book.model.BookService;
import com.team.pj.book.model.BookVO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    private final BookService bookService;

    @RequestMapping("/main")
    public String Main(Model model) {
        logger.info("main 페이지");

        List<BookVO> list = bookService.selectBook();
        logger.info("책검색: {}", list);

        model.addAttribute("list", list);
        
        return "main/index";
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