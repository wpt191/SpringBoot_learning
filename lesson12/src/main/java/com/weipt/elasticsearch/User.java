package com.weipt.elasticsearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.List;

/**
 * @program: SpringBoot_learning
 * @description: 构建实体类
 * @author: weipt
 * @create: 2020-03-15 21:02
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "userindex",type = "user")
public class User implements Serializable {

    @Id
    private Long id;
    private String first_name;
    private String last_name;
    private int age;
    private String about;
    private List<String> interests;

}
