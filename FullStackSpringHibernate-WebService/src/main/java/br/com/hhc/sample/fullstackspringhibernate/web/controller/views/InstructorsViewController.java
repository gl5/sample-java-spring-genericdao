package br.com.hhc.sample.fullstackspringhibernate.web.controller.views;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.hhc.sample.fullstackspringhibernate.core.service.InstructorsService;
import br.com.hhc.sample.fullstackspringhibernate.web.controller.BaseController;

@Controller
@RequestMapping(value = "/view/instructors")
public class InstructorsViewController extends BaseController{
	
	@Autowired
	private InstructorsService instructorsServiceProxy;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public final  String renderHome(ModelAndView model) {
		model.addObject("structorsList", instructorsServiceProxy.getAll() );
		return "instructors/home";
	}
}
