package serv22.helloThyme.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import serv22.helloThyme.domain.Friend;

@Controller
public class FriendController {
	
	ArrayList<Friend> friends = new ArrayList<>();

	@GetMapping("index")
	
	public String showFriends(@ModelAttribute Friend friend, Model model) {
		model.addAttribute("friend", new Friend());
		
		
		friends.add(friend);
		
		model.addAttribute("friends", friends);

		return "friend";
	}
	
	
}
