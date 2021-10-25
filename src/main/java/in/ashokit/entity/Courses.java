package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="COURSES")
public class Courses {

	@Id
	@Column(name="COURSE_ID")
	private Integer courseId;
	
	@Column(name = "COURSE_NAME")
	private String courseName;
	
}
