package com.example.demo.controller;



	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.SessionAttributes;
	import com.example.demo.model.Product;

	import com.example.demo.repository.ProductRepository;

	@Controller
	@SessionAttributes({ "pid", "pname", "pprice", "pqty" }) // session.setAttribute("id",id)
	public class ProductController {

		@Autowired // EmployeeRepository employeeRepository = new EmployeeRepository()
		private ProductRepository productRepository;

		@GetMapping("showProductForm")
		public String showProductForm() {
			System.out.println("Inside showProductForm");
			return "productform";
		}

		@PostMapping("submitProDetails")
		public String submitProDetails(@RequestParam("id") String id, @RequestParam("uname") String uname,
				@RequestParam("price") String price, @RequestParam("quantity") String quantity,
				@ModelAttribute Product p1) {
			System.out.println("Inside submitProDetails");
			productRepository.save(p1);
			return "message";
		}

		@GetMapping("showProductSearchForm")
		public String showProductSearchForm() {
			System.out.println("Inside showProductSearchForm");
			return "productsearch";
		}

		@PostMapping("showProductSearch")
		public String showProductSearch(@RequestParam("pid") String pid, @ModelAttribute Product pro, Model model) {
			System.out.println("Inside showProductSearch");

			Optional<Product> proOpt = productRepository.findById(Integer.parseInt(pid));
			Product pro1 = proOpt.get();
			System.out.println(pro1.getUname() + pro1.getPrice() + pro1.getQuantity());

			String pname = pro1.getUname();
			int pprice = pro1.getPrice();
			int pqty = pro1.getQuantity();

			model.addAttribute("pid", pid);
			model.addAttribute("pname", pname);
			model.addAttribute("pprice", pprice);
			model.addAttribute("pqty", pqty);
			return "productdisplay";
		}

	}
	


