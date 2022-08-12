package daikichiControllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController ("daikichi")
public class daikichicontroller {
 @RequestMapping("/daikichi")
 public String welcome(){
   return "Welcome!";
 }
 // you can be explicit about the request as well
 @RequestMapping("/daikichi/today")
 public String today(){
   return "Today you will find luck in all your endeavors!";
 }
 @RequestMapping("/daikichi/tomorrow")
 public String tomorrow(){
   return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
 }
 
	@RequestMapping("/daikichi/travel/{place}")
	public String showPlace(@PathVariable("place") String place) {
			return "Congratulations! You will soon travel to " + place;
	}
	
	@RequestMapping("/daikichi/lotto/{num}")
	public String showText(@PathVariable("num") String num) {
		int intNum = Integer.parseInt(num);
		if(intNum % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
 
 
 
 
 
 
}