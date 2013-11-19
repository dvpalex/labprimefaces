package br.com.ninb.quartztest;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class JobSendMail implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {

		System.out.println("Inicio:" + context.getTrigger().getStartTime());
		
		System.out.println("Enviando Email, next :" + context.getFireTime());
		
		System.out.println("Final:" + context.getTrigger().getEndTime());
		
	}

}
