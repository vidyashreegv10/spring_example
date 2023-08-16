package springexample;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/helloworld")
	
	public class HelloWorldController {

		@RequestMapping("/message")

	 

		public ModelAndView hello() {
			String message = "Hello from spring mvc application";
			ModelAndView mv = new ModelAndView("message");
			mv.addObject("msg",message);
			return mv;
		}
	}


