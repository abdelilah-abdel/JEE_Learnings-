package Presentation;
import Metier.* ; 
import DAO.*;
import DAO2.*;
public class Presentation1 {

	public static void main(String[] args) {

		DaoInterface dao = new DaoImplimentation2(); 
		MetierImplimentation metier = new MetierImplimentation();
		
		metier.setDao(dao);
		metier.calculer();
	
		
	}

}
