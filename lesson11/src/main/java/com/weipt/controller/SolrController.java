package com.weipt.controller;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;

/**
 * @program: SpringBoot_learning
 * @description: 从solr中查询数据
 * @author: weipt
 * @create: 2020-03-15 20:56
 **/
@Controller
public class SolrController {

    @Autowired
    private SolrClient solrClient;

    public void testSolr() throws IOException, SolrServerException {
        SolrDocument doc = solrClient.getById("123456");
        doc.toString();
    }
}
