package scheduler.job;

import org.quartz.InterruptableJob;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.UnableToInterruptJobException;

public class GetDatabaseJob implements InterruptableJob {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Siva thread reponse...");
	}

	@Override
	public void interrupt() throws UnableToInterruptJobException {
		System.out.println("Siva interrupted method throw InterrupJobException... ");
	}

}
