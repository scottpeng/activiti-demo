# activiti-demo

1. 本案例采用Activiti6 + spring4  

2. 导入Eclipse工具中需要添加bpmn的编辑器插件
     导入地址为： http://activiti.org/designer/update/
     
3. activiti 表结构简单介绍（Activiti6 有28张表）<Br/>
   act_ge_ 通用数据表，ge是general的缩写<Br/>
   act_hi_ 历史数据表，hi是history的缩写，对应HistoryService接口<Br/>
   act_id_ 身份数据表，id是identity的缩写，对应IdentityService接口<Br/>
   act_re_ 流程存储表，re是repository的缩写，对应RepositoryService接口，存储流程部署和流程定义等静态数据<Br/>
   act_ru_ 运行时数据表，ru是runtime的缩写，对应RuntimeService接口和TaskService接口，存储流程实例和用户任务等动态数据<Br/>
   
 4.demo配置流程图  
   https://github.com/scottpeng/activiti-demo/blob/master/src/main/resources/diagrams/demo/activitiSample.png

   
