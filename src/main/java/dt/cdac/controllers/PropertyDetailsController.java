package dt.cdac.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;





import dt.cdac.model.PropertyDetail;
import dt.cdac.services.PropertyDetailService;


@Controller
public class PropertyDetailsController {

	@Autowired
	private PropertyDetailService propertyDetailService;
	
	@RequestMapping("/listProperty")
	public String showPropertyDetails(Model model){
		/*ModelAndView m = new  ModelAndView("listproperties");
		m.addObject("details", propertyDetailService.getPropertyDetail());*/
		List<PropertyDetail> propertyList = propertyDetailService.getPropertyDetail();
		System.out.println(propertyList);
		model.addAttribute("propertyList", propertyList);
		return "listproperties";		
	}
}
