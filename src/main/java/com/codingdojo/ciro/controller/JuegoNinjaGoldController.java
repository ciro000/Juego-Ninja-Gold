package com.codingdojo.ciro.controller;

import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class JuegoNinjaGoldController {
	
	Date date = new Date();
	
	@GetMapping("/gold")
	public String goldGame(HttpSession sesion) {
		Integer gold = (Integer)sesion.getAttribute("gold");
		String text = (String)sesion.getAttribute("text");
		
		if(text == null) {
			sesion.setAttribute("text", "");
		}
		
		if(gold == null) {
			sesion.setAttribute("gold", 0);
		}
		
		else {
			sesion.setAttribute("gold", gold);
		}
		
		
		return "index.jsp";
	}
	
	@PostMapping("/farm")
	public String goToFarm(HttpSession sesion) {
		Integer gold = (Integer)sesion.getAttribute("gold");
		String text = (String)sesion.getAttribute("text");
		
		Random rn = new Random();
		int newGold = rn.nextInt(10+1)+10;
		
		gold+=newGold;
		
		String mensajeActividad = " You went to the farm, you got " + newGold + " " + "of gold" + " " + "you now have a total of: " + gold + " " + "(" + date + ")";
		
		text+=mensajeActividad;
		
		sesion.setAttribute("gold", gold);
		sesion.setAttribute("text", text);
		
		return "redirect:/gold";
	}
	
	@PostMapping("/cave")
	public String goToCave(HttpSession sesion) {
		Integer gold = (Integer)sesion.getAttribute("gold");
		String text = (String)sesion.getAttribute("text");
		
		Random rn = new Random();
		int newGold = rn.nextInt(5+1)+5;
		
		gold+=newGold;
		
		String mensajeActividad = " You went to the cave, you got " + newGold + " " + "of gold" + " " + "you now have a total of: " + gold  + " " + "(" + date + ")";
		
		text+=mensajeActividad;
		
		sesion.setAttribute("gold", gold);
		sesion.setAttribute("text", text);
		
		return "redirect:/gold";
	}
	
	@PostMapping("/house")
	public String goToHouse(HttpSession sesion) {
		Integer gold = (Integer)sesion.getAttribute("gold");
		String text = (String)sesion.getAttribute("text");
		
		Random rn = new Random();
		int newGold = rn.nextInt(3+1)+2;
		
		gold+=newGold;
		
		String mensajeActividad = " You went to your house, you got " + newGold + " " + "of gold" + " " + "you now have a total of: " + gold  + " " + "(" + date + ")";
		
		text+=mensajeActividad;
		
		sesion.setAttribute("gold", gold);
		sesion.setAttribute("text", text);
		
		return "redirect:/gold";
	}
	
	@PostMapping("/casino")
	public String goToCasino(HttpSession sesion) {
		Integer gold = (Integer)sesion.getAttribute("gold");
		String text = (String)sesion.getAttribute("text");
		
		Random rn = new Random();
		int newGold = rn.nextInt(50+50)-50;
		
		gold+=newGold;
		
		if(newGold<0) {
			
			String mensajeActividad = " You went to the casino and lost " + newGold + " " + "of gold" + " " + "you now have a total of: " + gold  + " " + "(" + date + ")";
			text+=mensajeActividad;
		}
		
		else {
			
			String mensajeActividad = " You went to the casino and won " + newGold + " " + "of gold" + " " + "you now have a total of: " + gold  + " " + "(" + date + ")";
			text+=mensajeActividad;	
		}
		
		sesion.setAttribute("gold", gold);
		sesion.setAttribute("text", text);
		
		return "redirect:/gold";
	}
	
	
	@PostMapping("/spa")
	public String goToSpa(HttpSession sesion) {
		Integer gold = (Integer)sesion.getAttribute("gold");
		String text = (String)sesion.getAttribute("text");
		
		
		Random rn = new Random();
		int newGold = rn.nextInt(15+1)+5;
		
		gold-=newGold;
	
		String mensajeActividad = " You went to the Spa, you spent " + newGold + " " + "of gold" + " " + "you now have a total of: " + gold  + " " + "(" + date + ")";
		
		text+=mensajeActividad;
		
		sesion.setAttribute("gold", gold);
		sesion.setAttribute("text", text);
		
		return "redirect:/gold";
	}
	
	@GetMapping("/reset")
	public String resetGame(HttpSession sesion) {
		sesion.invalidate();
		
		return "redirect:/gold";
	}
	
	

}
