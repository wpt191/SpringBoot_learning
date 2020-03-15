#SpringBoot整合Mybatis
---
##框架介绍
- 没有mybatis的情况下，我们操作数据库的时候，需要手动
实现dao接口，并书写操作方法（比如调用jdbc进行操作）

- 当我们使用mybatis框架的时候，dao的实现类不用我们去关心
只需要将dao接口绑定在mapper文件的namespace，sqlid与接口
方法保持一致即可

- 其实还有一种方式，就是我们还是实现dao，然后在daoimpl中
调用指定的sqlid

##框架链路
1、 界面通过action或者http+post访问，  
2、 controller接收到数据（@param）  
3、 controller--->service  
4、 service--->dao  
5、 dao--->mapper  
6、 mapper--->mybatis--->mysql

###注意：数据库增删改，需要根据实际业务，决定是否添加事务
