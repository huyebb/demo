package edu.poly.shopp.controller.site;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.poly.shopp.domain.Product;
import edu.poly.shopp.service.ProductService;

@Controller
@RequestMapping("/chitiet")
public class ChiTietSanPham {
	@Autowired
	ProductService productService;
	
	@GetMapping("id/{productId}")
	public String  add (Model model,@PathVariable("productId") Long productId) {
		
		Optional<Product> opt = productService.findById(productId);
		
		
		
		return "";
	}

}
