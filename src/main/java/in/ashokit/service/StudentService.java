package in.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Courses;
import in.ashokit.entity.Gender;
import in.ashokit.entity.Timings;
import in.ashokit.repository.CoursesRepository;
import in.ashokit.repository.GenderRepository;
import in.ashokit.repository.TimingsRepository;

@Service
public class StudentService {

	@Autowired
	private GenderRepository genderRepo;
	
	@Autowired
	private CoursesRepository courseRepo;
	
	@Autowired
	private TimingsRepository timingRepo;
	
	public List<String> getGenders(){
		List<Gender> findAll = genderRepo.findAll();
		
		List<String> genders = new ArrayList<>();
		findAll.forEach(gender ->{
			genders.add(gender.getGenderName());
		});
		return genders;
	}
	
	public List<String> getCourses(){
		List<Courses> findAll = courseRepo.findAll();
		
		List<String> courses = new ArrayList<>();
		findAll.forEach(course ->{
			courses.add(course.getCourseName());
		});
		return courses;
	}
	
	public List<String> getTimings(){
		List<Timings> findAll = timingRepo.findAll();
		
		List<String> timings = new ArrayList<>();
		findAll.forEach(timing -> {
			timings.add(timing.getTimingName());
		});
		
		return timings;
	}
}
