
package research.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Kenny Tai Huynh 
 * */
@SpringBootApplication
@ComponentScan({"research.spring"})
public class TestServiceApplication {

	protected final Log logger = LogFactory.getLog(getClass());
	
    public static void main(String[] args) {
        SpringApplication.run(TestServiceApplication.class, args);
    }
   
}
