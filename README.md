# mybatis-dynamic-datarouce
####说明
1.动态数据源，实现读写分离。
2.基于springboot配置
3.mybatis plus
4.druid连接池
5.秒级启动

####特点
1.简单，代码少
2.亲测能运行哦

####常见问题
1.需要执行项目中的两个sql文件。
2.执行controller时可能出现异常。这个是正常现象，多点两次。原因是读库采用的是随机库，可能当时随机到的库没有相关表。
