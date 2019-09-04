package cn.pipilu.tensquare.split.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tensquare-split/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @RequestMapping("/createIndex")
    public void createIndex(){
        articleService.createIndex();
    }

}
