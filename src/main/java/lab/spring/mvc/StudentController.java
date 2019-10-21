package lab.spring.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	private String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "student-form";
		}
		// Log the input data
		System.out.println(theStudent.getFirstName());

		return "student-confirmation";
	}
}
