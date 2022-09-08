package scheduler.job;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.quartz.CronScheduleBuilder;
import org.quartz.InterruptableJob;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.UnableToInterruptJobException;
import org.quartz.impl.StdSchedulerFactory;

public class TestClass {

	public static void main(String[] args) throws ParseException {

		scheduledServiceMethod(); // Working fine
//		quartzSchedulerMethod();
	}

	/**
	 * Execute the job based on 'SchduledExecutorService' method.
	 * 
	 * @return
	 * @throws ParseException 
	 */
	private static void scheduledServiceMethod() throws ParseException {
		/*String jobdate= "07-09-2020 02:48:40";
        Date d= new SimpleDateFormat("MM-dd-yyyy hh:mm:ss").parse(jobdate);*/
        
		ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
		executorService.scheduleAtFixedRate(sampleScheduleMethod(), 0, 5, TimeUnit.SECONDS);
	}

	private static Runnable sampleScheduleMethod() {
		System.out.println("Siva thread reponse...");
		return new Runnable() {

			@Override
			public void run() {
				anotherMethodCall();
			}
		};
	}

	protected static void anotherMethodCall() {
		System.out.println("Another method executed... ");
		
	}

	
	/**
	 * Execute the cron based job based on 'Quartz_Scheduler' library.
	 * 
	 * @return
	 */
	private static void quartzSchedulerMethod() {
		try {

			JobDetail job = JobBuilder.newJob(HelloJob.class).build();
			// Schedule to run at 5 AM every day
			Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("*/10 * * * * ?")).build();

			/*Trigger trigger = TriggerBuilder.newTrigger()
					.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever())
					.build();*/

			// Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
			Scheduler scheduler = new StdSchedulerFactory().getScheduler();
			
			System.out.println("Default scheduler activated... ");
			scheduler.scheduleJob(job, trigger);
			System.out.println("ScheduleJob activated... ");
			scheduler.start();
			System.out.println("Scheduler start... ");
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}

}
