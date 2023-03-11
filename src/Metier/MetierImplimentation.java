package Metier;
import DAO.*;
import DAO2.*;

public class MetierImplimentation implements MetierInterface{
	
	private DaoInterface dao;
	
	public void setDao(DaoInterface D){
		dao = D ; 
	}
	
	public void calculer (){
		System.out.print("la version de la couche DAO est ; "+ dao.getValue());
	}

}
