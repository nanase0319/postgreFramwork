"# postgreFramwork" 
 组成持久层的组件为 datasource 数据库引擎即jdbc实现为org.postgresql.Driver
 连接池 为 alibaba 的Druid
 orm 框架是 mybaits-plus 
 
1.选择数据库根据实际业务需求来选取

2.Druid是连接池，使用它自然是为了连接数据库的效率和资源有效利用

3.mybatis-plus 是基于mybatis 的再封装，由第三方而非mybatis官方所为，里面提供了遍历的插件和api以供使用
