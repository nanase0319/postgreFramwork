  组成持久层的组件为 datasource 数据库引擎即jdbc实现为org.postgresql.Driver
 连接池 为 alibaba 的Druid
 orm 框架是 mybaits-plus 
 
1.选择数据库根据实际业务需求来选取

2.Druid是连接池，使用它自然是为了连接数据库的效率和资源有效利用

3.mybatis-plus 是基于mybatis 的再封装，由第三方而非mybatis官方所为，里面提供了遍历的插件和api以供使用


# 更新
1. 测试类新增常用java时间与数据库时间类型对应，结果
- this Date is:Mon Nov 09 10:56:52 CST 2020
- using LocalDate is:2020-11-09
- using LocalDateTime is:2020-11-09T10:56:52.686
- using Calendar is:Mon Nov 09 10:56:52 CST 2020

一般来说，cst类型可以转换SimpleFormat类转换成数据库想要的类型，
所以要根据数据库的类型来选取，比如说数据库date类型是yy-MM-dd，而java中是 yy-MM-dd HH:mm:ss ，需要注意根据业务需求对时间转化，
同样的 数据库datetime类型是 yy-MM-dd HH:mm:ss，而java中是yy-MM-dd 也是同理，在作比较（小于情况）是通常在将java 转换成yy-MM-dd 23:59:59。