package edu.poly.shopp.controller.site;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.poly.shopp.domain.CartItem;
import edu.poly.shopp.domain.Product;
import edu.poly.shopp.service.ProductService;
import edu.poly.shopp.service.ShoppingCartService;


@Controller
@RequestMapping("shopping")
public class ShoppingCartController {
	
	
	@Autowired
	ProductService productService;
	@Autowired
	ShoppingCartService cartService;
	@GetMapping("cart")
	public String cart(Model model) {
		model.addAttribute("CART_ITEMS", cartService.getCartItems());
		model.addAttribute("TOTAL", cartService.getAmont());
		return "site/shoping/giohang";
		
	}
	@GetMapping("add/{productId}")
	public String addCart(ModelMap model, @PathVariable("productId") Long productId) {
		
		Optional<Product> opt = productService.findById(productId); // san pham
           //System.out.println("San Pham ------" +opt.get());
		   if(opt !=null) {
			   CartItem item = new CartItem(); // gior
			   BeanUtils.copyProperties(opt.get(), item);
			   item.setQuantity(1);
			   cartService.add(item);
			  
			   
		   }
		   return "redirect:/shopping/cart";
	}
	@GetMapping("delete/{productId}")
	   public String remove (@PathVariable("productId") Long productId ) {
			cartService.remove(productId);
			   return "redirect:/shopping/cart";
			
		}
	
	@PostMapping("update")
	   public String update (@RequestParam("productId") Long productId,@RequestParam("quantity") Integer quantity) {
	    
		cartService.update(productId, quantity);
		   return "redirect:/shopping/cart";
			
		}

	
	

}
