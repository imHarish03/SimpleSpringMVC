package lab.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lab.spring.mvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	private String showForm(Model model) {

		// create student object
		Student student = new Student();

		// add student object to the model
		model.addAttribute("student", student);

		return "student-form";
	}

	@RequestMapping("/processForm")
	private String processForm(@ModelAttribute("student") Student theStudent) {

		// Log the input data
		System.out.println(theStudent.getFirstName());

		return "student-confirmation";
	}
}
