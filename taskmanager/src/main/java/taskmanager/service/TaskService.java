package taskmanager.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import taskmanager.dao.TaskRepository;
import taskmanager.model.Task;

@Service
public class TaskService{
	
	
	@Autowired
	private TaskRepository taskRepo;
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	private List<Task> tasks=new ArrayList(Arrays.asList
//			(new Task(1,2,"FirstTask","01/01/2018","01/02/2019",0,8)));
	
//	@Autowired
//	private Task task;
	
	public List<Task> getallTasks()
	{
		ArrayList<Task> tasks=new ArrayList<Task>();
		taskRepo.findAll().forEach(tasks::add);
		return tasks;
	}
	
	public Optional<Task> getTask(int id){
	//	int task_id=Integer.parseInt(id);
//		for(Task task:tasks){
//			
//		if(task.getId()==task_id){
//			return task;
//		}
//		
//		}
//		return null;
		return taskRepo.findById(id);
	}

	public void addTask(Task task) {
		
	//	tasks.add(task);
		taskRepo.save(task);
	}

	public void updateTask(String id,Task task) {
		//int task_id=Integer.parseInt(id);
//		for(int i=0;i<tasks.size();i++)
//		{
//			Task t=tasks.get(i);
//			if(t.getId()==task_id){
//				
//				tasks.set(i, task);
//				
//			}
//		}
		taskRepo.save(task);
	}

	public List<Task> getTasksByParentId(int parent_id) {
		// TODO Auto-generated method stub
		return taskRepo.findTasksByParend_id(parent_id);
	}

	public List<Task> getTasksByTaskName(String task_name) {
		
		return taskRepo.findTasksByTask_name(task_name);
	}

	public List<Task> getTasksByStartDate(LocalDate start_date) {
		// TODO Auto-generated method stub
		return taskRepo.findTasksByStart_date(start_date);
	}

	public List<Task> getTasksByEndDate(LocalDate end_date) {
		// TODO Auto-generated method stub
		return taskRepo.findTasksByEnd_date(end_date);
	}

}
