package spring_mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



	
@Controller
	

public class controller_mvc {
	
@Autowired private serviceimp deservice;
	
 @RequestMapping(value="/NewFile", method=RequestMethod.GET)
	  public String getc(){
           return "NewFile";
	        }
 @RequestMapping(value="/NewFile",method=RequestMethod.POST)
 public String details(@RequestParam String name,@RequestParam int	mark)
   {
          System.out.println(name);
          pojo_mvc p=new pojo_mvc();
          p.setName(name);
          p.setSalary(mark);
          deservice.add(p);
          return "NewFile";
          }
 @RequestMapping(value="/view",method=RequestMethod.GET)
 
 public ModelAndView view()
 {
	 List<pojo_mvc>li=deservice.view();
	 ModelAndView mv=new ModelAndView();
	 mv.addObject("list",li);
	 return mv;
		 
 }
 @RequestMapping(value="/edit", method=RequestMethod.GET)
 public ModelAndView edit (@RequestParam int id){
        List li= deservice.edit(id);
      //  pojo_mvc p=deservice.getDetails(id);
       return new ModelAndView("edit","list",li);
        //m.addObject("list",li);
      
 }
 /*public String getdetails()
  * {
	 return "edit";
	 }*/
 
 @RequestMapping(value="/edit",method=RequestMethod.POST)
 public String getUpdate(@RequestParam int id,@RequestParam String
 name,@RequestParam int salary)
 {
 pojo_mvc p=new pojo_mvc();
 p.setId(id);
 p.setName(name);
 p.setSalary(salary);

 deservice.update(p);
 return "redirect:view";
 }
 /*public String getUpdate()
 {
 return "edit";
 } */
 
 @RequestMapping(value="/delete",method=RequestMethod.GET)
 
 public String delete(@RequestParam int id){
	 deservice.delete(id);
	 return "redirect:view";
 }
 
}