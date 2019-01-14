package taskmanager.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//import java.sql.Date;
@Entity
@Data
@AllArgsConstructor
public class Task {

	@Id @GeneratedValue
	private int id;
	@Getter @Setter
	private int parent_id;
	@Getter @Setter
	private String task_name;
	@JsonFormat(pattern="MM/dd/yyy") @Getter @Setter
	private LocalDate start_date;
	@JsonFormat(pattern="MM/dd/yyy") @Getter @Setter
	private LocalDate end_date;
	@Getter @Setter
	private int priorityFrom; 
	@Getter @Setter
	private int priorityTo;
	@Getter @Setter
	private boolean isCompleted;
	
	public Task() {
	
	}
	
	
//	public Task(int id, int parent_id, String task_name, LocalDate start_date, LocalDate end_date, int priorityFrom,
//			int priorityTo) {
//		super();
//		this.id = id;
//		this.parent_id = parent_id;
//		this.task_name = task_name;
//		this.start_date = start_date;
//		this.end_date = end_date;
//		this.priorityFrom = priorityFrom;
//		this.priorityTo = priorityTo;
//	}
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public int getParent_id() {
//		return parent_id;
//	}
//	public void setParent_id(int parent_id) {
//		this.parent_id = parent_id;
//	}
//	public String getTask_name() {
//		return task_name;
//	}
//	public void setTask_name(String task_name) {
//		this.task_name = task_name;
//	}
//	public LocalDate getStart_date() {
//		return start_date;
//	}
//	public void setStart_date(LocalDate start_date) {
//		this.start_date = start_date;
//	}
//	public LocalDate getEnd_date() {
//		return end_date;
//	}
//	public void setEnd_date(LocalDate end_date) {
//		this.end_date = end_date;
//	}
//	public int getPriorityFrom() {
//		return priorityFrom;
//	}
//	public void setPriorityFrom(int priorityFrom) {
//		this.priorityFrom = priorityFrom;
//	}
//	public int getPriorityTo() {
//		return priorityTo;
//	}
//	public void setPriorityTo(int priorityTo) {
//		this.priorityTo = priorityTo;
//	}
	
	
	
}
