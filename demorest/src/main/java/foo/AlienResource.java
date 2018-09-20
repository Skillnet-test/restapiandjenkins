package foo;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/aliens")
public class AlienResource {
	
	AlienRepository repo;
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens(){		
		
		repo=new AlienRepository();	
		
		return repo.getAliens();
		
	}
	
	@GET
	@Path("alien/{points}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien getAlien(@PathParam("points")int points){		
		
		repo=new AlienRepository();	
		
		return repo.getAlien(points);
		
	}
	
	
	
	
	@POST
	@Path("alien")
	public Alien createAlien(Alien a1){
		repo=new AlienRepository();
		
		repo.createAlien(a1);
		return a1;
		
	}
	
	
	

}
