package Presentation2;
import java.util.*;
import java.io.*;
import java.lang.reflect.Method;

import DAO.*;
import DAO2.*;
import Metier.*;


public class Presentation2 {
	public static void main(String[] args) throws Exception 
	{		
    	Scanner Sc  = new Scanner(new File("AppConfig.txt"));
    	String DaoClassName = Sc.nextLine();
    
    	//chargement de class DaoImplimentation dans la memoire 
     	Class CDAO = Class.forName(DaoClassName);
     	DaoInterface dao = (DaoInterface)CDAO.newInstance();
    
     	
     	// pour metier 
     	String MetierClassName = Sc.nextLine();
     	Class CMetier = Class.forName(MetierClassName);
     	MetierInterface metier = (MetierInterface)CMetier.newInstance();
     	
     	//injection de depenses
     	
     	Method mt = CMetier.getMethod("setDao",new Class[]{DaoInterface.class});
     	mt.invoke(metier, dao);
     	
     	metier.calculer();
	}
}
