package demo1.zzx_demo1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 测试
 * @author zhouzexian
 *
 */
@RestController
public class UserReditRestController {
	@RequestMapping(value="/usercredit/{id}")
	public Integer getCreditLevel(@PathVariable String id) {
		return 3;
	}
}
