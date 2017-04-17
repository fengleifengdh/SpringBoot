package flf.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	
	@Value("${my.ssss}")
	private String ssss;
	
    private final Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/")
    public String helloJsp1() throws Exception{
//           throw new Exception("");
    	return ssss+":ss";
    }
}
