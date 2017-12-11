# training-grails-orm
training-grails-orm

spring boot with grails orm (GORM)


### GORM(Grails ORM)

<pre>
可以直接使用spring boot与其整合
优点：
1、基本不用编写SQL。写的越多，后续需要维护的代码就越多.
增加一个字段，VO DTO Entity都要相应增加，GORM彻底跟这些无聊的事情说再见。
2、使用简单，功能强大。该中间件由于使用Groovy语言开发的，充分利用了Groovy动态语言的特性。
3、敏捷开发，让开发人员重点关注到软件的设计和具体业务上，而不是写很多代码，基础的增删改查巴拉巴拉。。。
工程师应该更好设计，而不是写一些无聊的重复代码。
当然在具体业务稳定后，性能达不到指标要求可以使用Java Mybatis重写（实际过程中99.99%没有这样的场景的）。
解放生产力，我支持GORM

缺点：
1、使用Groovy语言开发，在性能上不及原生的JVM语言Java。
2、底层Hibernate实现（关系型数据库用的是hibernate），要求开发人员对JPA有一定的认识。


思考后的实践：
在具体使用过程中，可以把GORM做单表映射，底层就是hibernate的参考实现。
在一对多，多对一，多对多关联使用上，如果操作不当，性能很差。
各种复杂的查询可以配合mybatis，GORM + mybatis是一个不错的整合，
性能来看，其实语言的性能并不是瓶颈，希望在新的项目中可以参考使用。

为什么使用Spring Boot 而不是直接的Grails呢？
1、Grails框架很多人不太熟悉，我之前在一个小项目进行实践过，以目前来看Grails并不是现在项目的最佳框架。
2、Spring Boot整个体系更新较快，社区支持的也很好。
我们在项目中已经由普通项目迁移到了Spring Cloud, Spring Boot整个体系上。
在使用过程中表现还是很不错的。

Spring Boot GORM示例参考代码：（推荐使用Intellij IDEA2017+, 对Groovy支持更好）
https://github.com/Percy0601/training-grails-orm

</pre>

#### 与MyBatis相互配合使用

#### Java 与 Groovy相互注入Spring Bean配置

#### 如何简单使用
1. 查看数据：localhost:8080/people
2. 增加数据：localhost:8080/people/add?firstName=abc&lastName=bcd




