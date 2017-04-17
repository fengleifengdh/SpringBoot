package flf.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import flf.util.BusinessException;


@Controller
public class JspController {
	
    private final Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	
    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String,Object> map){
           System.out.println("HelloController.helloJsp().hello=");
           return "helloJsp";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
    	ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }
//    @RequestMapping("/wrongPage")
//    public String helloJsp1(Map<String,Object> map) throws BusinessException{
//           System.out.println("HelloController.helloJsp().hello=");
//           throw new BusinessException("");
//    }
}
