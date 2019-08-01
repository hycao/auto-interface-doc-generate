
auto-interface-doc-generate 
=========================

![Spring Boot 2.3](https://img.shields.io/badge/Spring%20Boot-2.3-brightgreen.svg)
![Mysql 5.6](https://img.shields.io/badge/Mysql-5.6-blue.svg)
![JDK 1.8](https://img.shields.io/badge/JDK-1.8-brightgreen.svg)
![Maven](https://img.shields.io/badge/Maven-3.5.0-yellowgreen.svg)
![license](https://img.shields.io/badge/license-MPL--2.0-blue.svg)
 
自动化接口文档生成工具，通过模板，以及可视化参数输入，自动生成eoLinker接口文档。


[English](README_EN.md) &nbsp;| &nbsp;  [Github地址](https://github.com/ityouknow/spring-boot-examples) 

---


# 系统整体设计方案

本项目需要完成的目标为：通过模板和参数输入自动生成接口文档

## 一、要先要从项目代码中提取到关键要素点，转化为json格式接口文档
接口文档中的关键要素点包括以下几点：

···············································
- 目录分级 例如：bms/数据字典管理
- 最终接口名称、接口路径和接口方式  
- 请求头部
- 请求参数
- 返回参数
- 成功结果
- 失败结果
### 1.1 目录分级 
目录分级 例如：bms/数据字典管理 

**可以通过手动设置目录分级**

### 1.2 最终接口名称、接口路径和接口方式  
可以通过获取类上的注释来得到 最终接口名称

可以通过注释 @PostMapping("create") 中获取接口路径和接口方式

### 1.3 请求头部

默认头部，可以支持选择
Content-Type:application/json;charset=UTF-8

### 1.4 请求参数

通过函数入参-> 入参类 -> 所有参数名称、类型和注释

附加：可以自动生成 Postman 测试接口文档的.postman_collection.json文件

### 1.5 返回参数
返回参数可以通过返回参数，反向构建，通过字段注释来获取注释

~~返回参数可以通过postman测试输出导入~~

### 1.6 成功结果（可选）
从postman 导入成功测试结果 

~~或者通过1.5获取所有返回参数获取？？？（集成Postman？？？）~~

### 1.7 失败结果（同1.6）

## 二、把json格式的接口文档，导入到eoLinker中。
调研eoLinker导入格式，构建格式


## 三、后端设计

### 3.1 数据库设计
此次数据库的设计需要的比较少，主要功能是保存之前的历史文件和项目处理中的暂存数据 

这里可以采用的方式有两种，一种是：通过数据库区存储相应的东西，
另一种是：可以生成文件直接存储在本地，不过通过web直接进行文件存储不是很适合，
还不如用session 或者是cache来进行数据的存储。
