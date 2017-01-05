package com.niit.kafonbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.kafonbackend.config.AppContextConfig;
import com.niit.kafonbackend.dao.RegisterDAO;
import com.niit.kafonbackend.model.Register;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppContextConfig.class);
    	 RegisterDAO registerDAO=(RegisterDAO)context.getBean("RegisterDAO");
         
         Register register=new Register();
         register.setFirstName("gowthaman");
         register.setLastName("palanisamy");
         register.setEmailId("gowthaman712@gmail.com");
        
         register.setPassword("google");
        
               
                
    }
        
        
}
