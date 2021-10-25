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
@Table(name = "TIMINGS")
public class Timings {
	
	@Id
	@Column(name="TIMING_ID")
	private Integer timingId;
	
	@Column(name="TIMING_NAME")
	private String timingName;

}
