package foo;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	
	List<Alien> list;
	
	public AlienRepository(){
		
		list=new ArrayList<Alien>();
		Alien alien=new Alien();
		alien.setName("saptarshi");
		alien.setPoints(60);
		
		Alien alien1=new Alien();
		alien1.setName("debarshi");
		alien1.setPoints(90);
		
		list.add(alien);
		list.add(alien1);
		
		
	}
	
	public List<Alien> getAliens(){
	
		return list;
	}
	
	
	public  Alien getAlien(int points){
		
		Alien a=null;
		for(int i=0; i< list.size(); i++){
			
			a=list.get(i);
			if(a.getPoints()==points){
				return a;
			}
			
		}
		
		
		return null;
		
		
		
	}
	
	
	public Alien createAlien(Alien a1){
		
		list.add(a1);
		return a1;
		
	}
	
	
	
	

}
