package com.weipt.controller;

import com.weipt.elasticsearch.User;
import org.elasticsearch.index.query.ExistsQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @program: SpringBoot_learning
 * @description: 测试
 * @author: weipt
 * @create: 2020-03-15 21:08
 **/
@Controller
public class ElasticController {

    @Autowired
    private ElasticsearchTemplate template;

    public void testEla(){
        QueryBuilder queryBuilder = QueryBuilders.existsQuery("first_name");
        SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(queryBuilder).build();
        List<User> users = template.queryForList(searchQuery, User.class);
        System.out.println(users);
    }
}
