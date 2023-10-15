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

	@Autowired
	private CustomerService customerService;

	// click customer menu
	@GetMapping
	public String index(Model model) {
		return listByPage(1, "first-name", "asc", model); // default page = 1
	}
	
	// click [sort], [page] number
	@GetMapping("/page/{pageNum}")
	public String listByPage(@PathVariable("pageNum") int pageNum, 
			@RequestParam("sort-field") String sortField,
			@RequestParam("sort-dir") String sortDir,
			Model model) {
		int totalItems = customerService.countTotalAmountOfCustomers();
		int itemsPerPage = Pageable.CONFIGURED_ITEMS_PER_PAGE;
		int totalPages = (int)Math.ceil((float)totalItems/itemsPerPage);
		
		int currentPage = pageNum < 1 ? 1
							: pageNum > totalPages ? totalPages
							: pageNum;
		
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("itemsPerPage", itemsPerPage);
		
		model.addAttribute("currentSortField", sortField);
		model.addAttribute("currentSortDir", sortDir);
		
		model.addAttribute("customers", customerService.getAll(
				Pageable.of(currentPage, itemsPerPage), Sortable.of(sortField, sortDir)) );
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
		boolean isAdd = customer.getId() == null;
		customerService.saveOrUpdate(customer);
		// redirect:/customer?message='add-success'
		// redirect:/customer?message='update-success'
		String infoMessage = isAdd ? "Add customer " + customer.getId() + " successful"
				                   : "Update customer " + customer.getId() + " successful";
		return REDIRECT_CUSTOMER_INDEX + "?message=" + infoMessage;
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") Integer id, Model model) {
		customerService.delete(id);
		// redirect:/customer?message='delete-success'
		String infoMessage = "Delete customer " + id + " successful";
		return REDIRECT_CUSTOMER_INDEX + "?message=" + infoMessage;
	}
}
