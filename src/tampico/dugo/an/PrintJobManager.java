/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tampico.dugo.an;

/**
 *
 * @author Саня
 */
public class PrintJobManager {

    private PrintJobClass[] jobs;
    private int jobCount;

    public PrintJobManager() {

        jobs = new PrintJobClass[100];
        jobCount = 0;

    }
    
    public void addJob(PrintJobClass job) {

    if (jobCount < jobs.length) {

        jobs[jobCount] = job;

        jobCount++;

    }

}
    public PrintJobClass getJob(int position) {

    if (position >= 0 && position < jobCount) {

        return jobs[position];

    }

    return null;

}
    
    public int getJobCount() {

    return jobCount;

}
    
public PrintJobClass searchJob(int id) {

    for (int i = 0; i < jobCount; i++) {

        if (jobs[i].getId() == id) {

            return jobs[i];

        }
    }

    return null;
}
    
    
}