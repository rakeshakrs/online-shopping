package taskmanager.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import taskmanager.model.Task;

public interface TaskRepository extends CrudRepository<Task,Integer>{
	
	public List<Task> findTasksByParend_id(int parent_id);
	
	public List<Task> findTasksByTask_name(String task_name);
	
	public List<Task> findTasksByStart_date(LocalDate start_date);
	
	public List<Task> findTasksByEnd_date(LocalDate end_date);

}
