# mybatis-dynamic-datarouce
1.动态数据源，实现读写分离。
2.基于springboot配置
3.mybatis plus
4.druid连接池
5.秒级启动

需要执行项目中的两个sql文件。
执行controller时可能出现异常，多点两次。读库，采用的是随机库，可能当时随机到的库没有相关表。
