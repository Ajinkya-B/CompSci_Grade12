import javax.swing.*;  

public class Greetings{
	
     Greetings(){ 
        try{
            JFrame f = new JFrame("About Me");  
            JTextArea area = new JTextArea("Name: Ajinkya Bhosale \nSchool: North Park SS \nFavourite Music: Hip Hop(Rap) \nFavourite TV Show: Friends \nFavourite Color: Black");  
            f.setBounds(10, 10, 300, 300);
            area.setBounds(10, 10, 265, 245);  
            f.add(area);  
            f.setSize(300,300);  
            f.setLayout(null);  
            f.setVisible(true); 
        }catch(Exception e){
            System.out.println("There was an error!");	
	}
    }
    

    public static void main(String[] args) {
	
        new Greetings();
    
    }
}  
