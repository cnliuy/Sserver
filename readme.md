## eureka微服务（服务提供方）

* 类似这样的 "eureka微服务" 都将注册到"eureka服务中心"，供"消费者"调用。 
  "eureka微服务" 本项目
  "eureka服务中心" https://github.com/cnliuy/Sscenter  
  
>  当微服务遇到切换地址等情况，"消费者"可以通过 "eureka服务中心" 获取到"服务"改变的消息。  
  
* 启动顺序：  
       第二个启动。端口 8002   
  
* 原理：  
              
> eureka微服务---(注册)---> eureka服务中心 <---(调用)---eureka微服务的使用者  
> (eureka server)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(eureka center)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; (eureka consumer)  
  
  
  
https://github.com/cnliuy/Sserver.git  

参考：
