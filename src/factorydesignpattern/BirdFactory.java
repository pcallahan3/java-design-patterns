package factorydesignpattern;

public class BirdFactory {
	
	 //getBirdType method to get object of type of bird 
	   public Bird getBirdType(String birdType){
	  
	      if(birdType.equalsIgnoreCase("Parrot")){
	         return new Parrot();
	         
	      } else if(birdType.equalsIgnoreCase("Eagle")){
	         return new Eagle();
	         
	      } else if(birdType.equalsIgnoreCase("Duck")){
	         return new Duck();
	      }
	      
	      return null;
	   }
	}


