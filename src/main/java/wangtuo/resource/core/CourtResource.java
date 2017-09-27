package wangtuo.resource.core;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import wangtuo.domain.core.Court;
import wangtuo.resource.exception.RequestBodyInvalidException;
import wangtuo.resource.exception.ResultNotFoundException;
import wangtuo.resource.util.ResponseBody;
import wangtuo.service.core.CourtService;

@RestController
@RequestMapping("/court")
@Api
public class CourtResource {
	
	@Autowired
	private CourtService service;

	public CourtService getService() {
		return service;
	}

	public void setService(CourtService service) {
		this.service = service;
	}
	
	@GetMapping("/{id}")
	public ResponseBody<Court> findOne(@PathVariable String id){
		Court result = service.findOne(id);
		if(null == result) {
			throw new ResultNotFoundException();
		}
		return new ResponseBody<>(result);
	}
	
	@GetMapping
	public ResponseBody<List<Court>> findAll(){
		List<Court> list = service.findAll();
		if(null == list || list.isEmpty()) {
			throw new ResultNotFoundException();
		}
		return new ResponseBody<>(list);
	}
	
	@PostMapping
	public ResponseBody<Court> save(@Valid @RequestBody Court court,BindingResult bindingResult){
		checkBindingResult(bindingResult);
		Court result = service.save(court);
		if(null == result) {
			throw new ResultNotFoundException();
		}
		return new ResponseBody<>(result);
	}
	
	@PutMapping
	public ResponseBody<Court> update(@Valid @RequestBody Court court,BindingResult bindingResult){
		checkBindingResult(bindingResult);
		Court result = service.update(court);
		if(null == result) {
			throw new ResultNotFoundException();
		}
		return new ResponseBody<>(result);
	}
	
	@DeleteMapping("/{id}")
	public ResponseBody<Void> delete(@PathVariable String id){
		service.delete(id);
		return new ResponseBody<Void>(null);
	}
	
	public void checkBindingResult(BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			StringBuffer sb = new StringBuffer("request body invalid.");
			bindingResult.getAllErrors().forEach(e -> sb.append(e.getDefaultMessage()));
			throw new RequestBodyInvalidException(sb.toString());
		}
	}
}
