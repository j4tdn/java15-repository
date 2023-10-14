package bkit.java15.controller;

import static bkit.java15.common.Application.CUSTOMER_FORM;
import static bkit.java15.common.Application.CUSTOMER_INDEX;
import static bkit.java15.common.Application.REDIRECT_CUSTOMER_INDEX;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bkit.java15.common.Pageable;
import bkit.java15.common.Sortable;
import bkit.java15.persistence.Customer;
import bkit.java15.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	private static final int pageSize = Pageable.AMOUNT_OF_ITEMS_PER_PAGE;
	
	@Autowired
	private CustomerService customerService;

	@GetMapping
	public String list(Model model) {
		return listByPage(1, "first-name", "asc", null, model);
	}
	
	@GetMapping("/search")
	public String listBySearch(@RequestParam("text") String text, Model model) {
		return listByPage(1, "first-name", "asc", text, model);
	}
	
	@GetMapping("/page/{pageNum}")
	public String listByPage(@PathVariable("pageNum") int pageNum,
			@RequestParam(name = "sort-field") String sortField,
			@RequestParam(name = "sort-dir") String sortDir,
			String text,
			Model model) {
		int totalItems = customerService.countTotalItems(text);
		
		System.out.println(">>> totalItems " + totalItems);
		
		int totalPages = (int)Math.ceil((float)totalItems/pageSize);
		int currentPage = pageNum < 1 ? 1 
								: pageNum > totalPages ? totalPages
							    : pageNum;
		
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pageSize", pageSize);
		
		model.addAttribute("currentSortField", sortField);
		model.addAttribute("currentSortDir", sortDir);
		model.addAttribute("reversedOrder", "asc".equals(sortDir) ? "desc" : "asc");
		
		model.addAttribute("customers", customerService.getAll(Pageable.of(currentPage, pageSize), Sortable.of(sortField, sortDir), text));
		return CUSTOMER_INDEX;
	}
	
	

	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("customer", new Customer());
		return CUSTOMER_FORM;
	}
	
	@GetMapping("/update")
	public String update(@RequestParam("id") Integer id, Model model) {
		var customer = customerService.get(id);
		model.addAttribute("customer", customer);
		return CUSTOMER_FORM;
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("customer") Customer customer) {
		customerService.saveOrUpdate(customer);
		return REDIRECT_CUSTOMER_INDEX;
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") Integer id, Model model) {
		customerService.delete(id);
		return REDIRECT_CUSTOMER_INDEX;
	}
}
