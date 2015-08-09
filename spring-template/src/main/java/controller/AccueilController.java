/**
 * 
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import core.Adresse;
import core.User;

/**
 * @author Marcellin
 *
 */
@Controller
@RequestMapping("/accueil.htm")
public class AccueilController {
	private static final String FORM_VIEW = "accueil";
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView accueil () {
		User user = getStaticUser();
		ModelAndView model = new ModelAndView(FORM_VIEW); 
		model.addObject("user", user);
		return model;
	}
	
	private User getStaticUser () {
		Adresse adresse = new Adresse(43, "Rue Camille Desmoulins", "2ème Etage", 94230, "Cachan", null);
		return new User("DUPOND", "Jean", 32, "dupond.jean@gmail.com", "mypassword", adresse);
	}

}
