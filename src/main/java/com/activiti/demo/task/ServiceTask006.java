/**
 * @see    任务六
 * @author pengqianqing
 * @date   2018-09-22
 * 
 * 
 */
package com.activiti.demo.task;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ServiceTask006 implements JavaDelegate {
   
	private Logger log = LoggerFactory.getLogger(ServiceTask006.class);
	
	public void execute(DelegateExecution exec) {
		// 业务逻辑处理
		log.info(this.getClass().getName());
	}

}
