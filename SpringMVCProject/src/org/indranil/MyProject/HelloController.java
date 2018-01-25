package org.indranil.MyProject;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.indranil.MyProject.Model.MyProjectStartup;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		Map<String, String> m = new HashMap<String, String>();
		m.put("msg","Hello " + name);
		
		MyProjectStartup myProjectStartup= new MyProjectStartup();
		
		myProjectStartup.main(name);
		
		ModelAndView modelandview = new ModelAndView("Success",m);
		return modelandview;
	}
	

}
