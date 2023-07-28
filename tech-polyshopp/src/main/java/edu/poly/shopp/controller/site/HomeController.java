package edu.poly.shopp.controller.site;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.poly.shopp.domain.Product;
import edu.poly.shopp.service.ProductService;

@Controller
@RequestMapping("home")
public class HomeController {
	@Autowired
	ProductService productService;
	
	@RequestMapping("")
	public String home(Model model) {
		List<Product> list = productService.findAll();
		model.addAttribute("products",list);
		return "site/home/page-home";
		
		
	}

}
