## spring.boot dubbbo mybatis通用mapper项目

----------


使用技术:

* 后台
	* Spring Boot 2.x 
	* Maven构建项目
	* Dubbo RPC框架
	* Apollo统一配置中心
	* druid数据库连接池
	* swagger-bootstrap-ui生成 RESTful Apis文档
 

## 本地开发运行部署
- 安装git后执行克隆命令 
- 安装各中间件并启动：ZooKeeper、dubbo
- 修改各配置文件相应依赖IP配置(默认本地127.0.0.1)
- 使用ide导入源码，第一次导入后等待下载jar包
- 注意在有 `application.yml` 的模块中修改你的数据库连接配置
- 先在父项目中执行`mvn install`，以后对子项目的修改可以单独在子模块执行
- 项目需运行除 `live-parent` `live-common` 以外其它所有几个服务，都可以使用spring boot的启动方式启动项目


