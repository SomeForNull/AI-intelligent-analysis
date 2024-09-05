# AI分析图表生成

### 项目介绍

基于 React + Spring Boot + MQ + AIGC 的智能数据分析平台。

区别于传统 BI，用户只需要导入原始数据集、并输入分析诉求，就能自动生成可视化图表及分析结论，实现数据分析的降本增效。

AIGC：AI 生成内容

### 项目设计

**核心实现**：通过给AI模型设置prompt，和用户输入，生成理想的chart代码。

![](https://github-1310970062.cos.ap-shanghai.myqcloud.com/github_picture/ai-intelligent/4.png)

- - 技术选型

    #### 前端

    - React 18
    - Ant Design Pro 5.x 脚手架
    - Umi 4 前端框架
    - Ant Design 组件库
    - Echarts 可视化库
    - OpenAPI 前端代码生成

    #### 后端

    - Java Spring Boot（万用后端模板）
    - MySQL 数据库
    - MyBatis-Plus 及 MyBatis X 自动生成
    - Redis + Redisson 限流
    - RabbitMQ 消息队列
    - 鱼聪明 AI SDK（AI 能力）
    - JDK 线程池及异步化
    - Easy Excel 表格数据处理
    - Swagger + Knife4j 接口文档生成
    - Hutool、Apache Common Utils 等工具库

### 展示

#### 同步分析

![](https://github-1310970062.cos.ap-shanghai.myqcloud.com/github_picture/ai-intelligent/1.png)

#### 异步分析

![](https://github-1310970062.cos.ap-shanghai.myqcloud.com/github_picture/ai-intelligent/2.png)

#### 查看图表

![](https://github-1310970062.cos.ap-shanghai.myqcloud.com/github_picture/ai-intelligent/3.png)



