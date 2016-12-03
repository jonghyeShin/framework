package kr.ac.hansung.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Credit_division;
import kr.ac.hansung.model.Credit_year_semester;
import kr.ac.hansung.model.Offer;
import kr.ac.hansung.service.OffersService;

@Controller
public class OffersController {

	private OffersService offersService;

	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/credit_year")
	public String show_credit_year(Model model) {

		List<Credit_year_semester> cyss = new ArrayList<Credit_year_semester>();

		for (int i = 2014; i <= 2016; i++) {
			for (int j = 1; j <= 2; j++) {
				List<Offer> subjects = offersService.get_subject_year_semester(i, j);

				int credit_sum = 0;
				for (int k = 0; k < subjects.size(); k++) {
					credit_sum += subjects.get(k).getCredit();
				}
				cyss.add(new Credit_year_semester(i, j, credit_sum,subjects));
			}
		}
		model.addAttribute("credit_year", cyss);

		return "credit_year";
	}

	@RequestMapping("/create_subject")
	public String createOffers(Model model) {
		return "create_subject";
	}

	@RequestMapping("/credit_division")
	public String show_division_credit(Model model) {

		List<Credit_division> cds = new ArrayList<Credit_division>();
		String[] division = { "핵교A", "핵교B", "전기", "전지", "전선", "교필", "일교", "자율", "총점"};
		int[] credit_sum = {0,0,0,0,0,0,0,0,0};
		for (int i = 2014; i <= 2016; i++) {
			for (int j = 1; j <= 2; j++) {
				List<Offer> subjects = offersService.get_subject_year_semester(i, j);
				for (int k = 0; k < subjects.size(); k++) {
					for (int x = 0; x < division.length; x++) {
						if(subjects.get(k).getDivision().equals(division[x])){
							credit_sum[x] += subjects.get(k).getCredit();
						}
					}
				}
			}
		}
		
		for(int i=0;i<credit_sum.length-1;i++){
			credit_sum[credit_sum.length-1] += credit_sum[i];
		}
		
		for(int i=0;i<division.length;i++){
			cds.add(new Credit_division(division[i], credit_sum[i]));
		}
		model.addAttribute("credit_division", cds);

		return "credit_division";
	}
	
	@RequestMapping("/docreate")
	public String docreate(Model model,Offer offer) {
		
		offersService.insert(offer);
		
		return "subjectcreated";
	}
	
	
	@RequestMapping("/show_subject_2014_1")
	public String showsubject20141(Model model) {
		
		List<Offer> subjects = offersService.get_subject_year_semester(2014, 1);
		model.addAttribute("show_subject_ys", subjects);
		
		return "show_subject_2014_1";
	}
	
	@RequestMapping("/show_subject_2014_2")
	public String showsubject20142(Model model) {
		
		List<Offer> subjects = offersService.get_subject_year_semester(2014, 2);
		model.addAttribute("show_subject_ys", subjects);
		
		return "show_subject_2014_2";
	}
	
	@RequestMapping("/show_subject_2015_1")
	public String showsubject20151(Model model) {
		
		List<Offer> subjects = offersService.get_subject_year_semester(2015, 1);
		model.addAttribute("show_subject_ys", subjects);
		
		return "show_subject_2015_1";
	}
	
	@RequestMapping("/show_subject_2015_2")
	public String showsubject20152(Model model) {
		
		List<Offer> subjects = offersService.get_subject_year_semester(2015, 2);
		model.addAttribute("show_subject_ys", subjects);
		
		return "show_subject_2015_2";
	}
	
	@RequestMapping("/show_subject_2016_1")
	public String showsubject20161(Model model) {
		
		List<Offer> subjects = offersService.get_subject_year_semester(2016, 1);
		model.addAttribute("show_subject_ys", subjects);
		
		return "show_subject_2016_1";
	}
	
	@RequestMapping("/show_subject_2016_2")
	public String showsubject20162(Model model) {
		
		List<Offer> subjects = offersService.get_subject_year_semester(2016, 2);
		model.addAttribute("show_subject_ys", subjects);
		
		return "show_subject_2016_2";
	}
	
	
	
	@RequestMapping("/created_subject")
	public String show_created_subject(Model model) {
		
		List<Offer> created_subject = offersService.get_subject_year_semester(2017, 1);
		model.addAttribute("created_subject", created_subject);
		
		return "created_subject";
	}
}
