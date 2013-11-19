package br.com.ninb.quartztest;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.calendar.HolidayCalendar;

import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.SimpleScheduleBuilder.*;


public class App 
{
	
    public static void main( String[] args )
    {
    	try{
    		
    		 init();   		
    		 
    	}catch(Exception ex){
    		
    		ex.printStackTrace();
    		
    	}finally{
    		
    		System.out.println("Execução completada");
    	}
    	
    }
    
    	private static void init(){
    		try{

    			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        		scheduler.start();
        		
        	   Date feriado = new Date(2010, 11, 16);
        		
        		
        		HolidayCalendar cal = new HolidayCalendar();
        		cal.addExcludedDate(feriado);
        		
        		scheduler.addCalendar("Feriados", cal, false, false);
        		
        		 JobDetail jobSendMail = newJob(JobSendMail.class)
        		 .withIdentity("jobSendMail", "group1")
        		 .build();

        		 
        		  
        		 SimpleTrigger trigger = newTrigger()
        		 .withIdentity("trigger1", "group1")
        		 .startNow()
        		 .modifiedByCalendar("Feriados")
        		 .withSchedule(simpleSchedule()
        		 .withIntervalInSeconds(10)
        		 .repeatForever()) 
        		 .build();
        	
        		 scheduler.scheduleJob(jobSendMail, trigger);

    			
    		}catch(Exception ex){
    			
    			System.err.println(ex.toString());
    		}
    	}
    
    
}
