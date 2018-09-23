package com.activiti.demo;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationConfig.xml")
public class ActivitiDemoTest {
	
	//private Logger log = LoggerFactory.getLogger(ServiceTaskDemoTest.class);
	
	@Autowired
    private ProcessEngine processEngine;
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private RuntimeService historyService;
    @Autowired
    private TaskService managementService;
	
	

	/**
	 * TODO 测试排他网关（请注意：排他网关会一次判断条件是否满足，满足则选择一个路径执行，
	 *                   假若需要用到条件：则需要对排他网关所有路径和为全集条件）
	 * @author pengqianqing
	 * @date   2018-09-23
	 */
    
    @Test
	public void startProcess(){
		Deployment deployment = repositoryService
				 .createDeployment()
				 .name("activiti Demo")
				 .addClasspathResource("diagrams/demo/activitiSample.bpmn")
				 .addClasspathResource("diagrams/demo/activitiSample.png")
				 .deploy();
		
		System.out.println("部署Id：" + deployment.getId());
		System.out.println("部署名字" + deployment.getName());
		Map<String, Object> variables = new HashMap<String, Object>();
        variables.put("result", "true");
        variables.put("type", 326);
        // 启动工作流
        runtimeService.startProcessInstanceByKey("activitiSample",variables);
    }
}
