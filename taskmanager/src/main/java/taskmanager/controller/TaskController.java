package taskmanager.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import taskmanager.model.Task;
import taskmanager.service.TaskService;

@RestController
public class TaskController {
	@Autowired
	private TaskService taskService;

	@RequestMapping("/tasks")
	public List<Task> getallTasks()
	{
		return taskService.getallTasks();
	}
	
	
	@RequestMapping("/tasks/{id}")
	public Optional<Task> getTask(@PathVariable int id)
	{
		return taskService.getTask(id);
	}
	
	@RequestMapping("/tasks/{parent_id}")
	public List<Task> getTasksByParentId(@PathVariable int parent_id)
	{
		return taskService.getTasksByParentId(parent_id);
	}
	
	@RequestMapping("/tasks/{task_name}")
	public List<Task> getTasksByTaskName(@PathVariable String task_name)
	{
		return taskService.getTasksByTaskName(task_name);
	}
	
	@RequestMapping("/tasks/{start_date}")
	public List<Task> getTasksByStartDate(@PathVariable LocalDate start_date)
	{
		return taskService.getTasksByStartDate(start_date);
	}
	
	@RequestMapping("/tasks/{end_date}")
	public List<Task> getTasksByEndDate(@PathVariable LocalDate end_date)
	{
		return taskService.getTasksByEndDate(end_date);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/tasks")
	public void addTask(@RequestBody Task task ){
		
		 taskService.addTask(task);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/tasks/{id}")
	public void updateTask(@RequestBody Task task,@PathVariable String id ){
		
		 taskService.updateTask(id,task);
	}
	
	
	
	
	
	
	
	
	
}
