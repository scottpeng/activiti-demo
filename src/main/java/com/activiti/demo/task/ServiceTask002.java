/**
 * @see    任务二
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


public class ServiceTask002 implements JavaDelegate {
   
	private Logger log = LoggerFactory.getLogger(ServiceTask002.class);
	
	public void execute(DelegateExecution exec) {
		exec.setVariable("result", "true");
		exec.setVariable("flag", "02");
		//exec.setVariable("result", "false");
		// 业务逻辑处理
		log.info("==========="+this.getClass().getName());
	}

}
