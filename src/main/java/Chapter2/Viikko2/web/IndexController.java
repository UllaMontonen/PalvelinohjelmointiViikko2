package Chapter2.Viikko2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Chapter2.Viikko2.domain.Friend;

@Controller
public class IndexController {

	@GetMapping("index")
	public String ShowFriends(Model model) {
		ArrayList<Friend> friends = new ArrayList<>();
		
		friends.add(new Friend ("John", "West"));
		
		model.addAttribute("friendList", friends);
		
		return "friends";
	}
	
	@PostMapping("index")
	public String friendSubmit(@ModelAttribute Friend fname, Model model ) {
		model.addAttribute("friend", fname);
		return "result";
	}
	
	
}
