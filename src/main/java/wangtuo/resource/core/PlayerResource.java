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
import wangtuo.domain.core.Player;
import wangtuo.resource.exception.RequestBodyInvalidException;
import wangtuo.resource.exception.ResultNotFoundException;
import wangtuo.resource.util.ResponseBody;
import wangtuo.service.core.PlayerService;

@RestController
@RequestMapping("/player")
@Api
public class PlayerResource {
	
	@Autowired
	private PlayerService service;

	public PlayerService getService() {
		return service;
	}

	public void setService(PlayerService service) {
		this.service = service;
	}
	
	@GetMapping("/{id}")
	public ResponseBody<Player> findOne(@PathVariable String id){
		Player result = service.findOne(id);
		if(null == result) {
			throw new ResultNotFoundException();
		}
		return new ResponseBody<>(result);
	}
	
	@GetMapping
	public ResponseBody<List<Player>> findAll(){
		List<Player> list = service.findAll();
		if(null == list || list.isEmpty()) {
			throw new ResultNotFoundException();
		}
		return new ResponseBody<>(list);
	}
	
	@PostMapping
	public ResponseBody<Player> save(@Valid @RequestBody Player player,BindingResult bindingResult){
		checkBindingResult(bindingResult);
		Player result = service.save(player);
		if(null == result) {
			throw new ResultNotFoundException();
		}
		return new ResponseBody<>(result);
	}
	
	@PutMapping
	public ResponseBody<Player> update(@Valid @RequestBody Player player,BindingResult bindingResult){
		checkBindingResult(bindingResult);
		Player result = service.update(player);
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
