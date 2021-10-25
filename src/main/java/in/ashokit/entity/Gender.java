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
@Table(name="GENDERS")
public class Gender {

	@Id
	@Column(name="GENDER_ID")
	private Integer genderId;
	
	@Column(name="GENDER_NAME")
	private String genderName;
}
