package testdao;

import models.works.SaveService;
import models.works.Status;
import models.works.Work;
import models.works.WorkServiceManager;

public class Ex02 {
    public static void main(String[] args) {
       /*
        WorkDao workDao = new WorkDao();
        SaveService saveService = new SaveService(workDao);
        Work work = new Work();
        work.setStatus(Status.PROGRESS);
        work.setSubject("책의 제목....");
        work.setContent("책의 내용........");

        saveService.save(work);
        */
        SaveService saveService = WorkServiceManager.getInstance().saveService();
        Work work = new Work();
        work.setStatus(Status.PROGRESS);
        work.setSubject("책의 제목....");
        work.setContent("책의 내용........");

        saveService.save(work);

    }
}
