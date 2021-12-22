import java.util.Scanner;

public class RollDice11 {
	public static void main(String[]args){
        
		Scanner scan=new Scanner(System.in);
		int n;
		int [] X= new int[56]; 
		
		int sum=0;
        System.out.println("Enter n for n times dice roll");
        n=scan.nextInt();
        
	       
	       
	       for(int i=1; i<=n; i++){
	           
	       int dice1=(int)(Math.random()*6+1);
	       int dice2=(int)(Math.random()*6+1);
	       int dice3=(int)(Math.random()*6+1);
	       int dice4=(int)(Math.random()*6+1);
	       int dice5=(int)(Math.random()*6+1);
	       int dice6=(int)(Math.random()*6+1);
	       int dice7=(int)(Math.random()*6+1);
	       int dice8=(int)(Math.random()*6+1);
	       int dice9=(int)(Math.random()*6+1);
	       int dice10=(int)(Math.random()*6+1);
	       
	     //  System.out.println( "Dice1= "+ dice1 + "\n" + "Dice2= " +dice2 + " \n"  +"Dice3= "+ dice3 + " \n" + "Dice4= " +dice4 + " \n" + "Dice5= "
	     //                         + dice5 + "\n" +"Dice6= " + dice6 + " \n" +"Dice7= " + dice7 + "\n"+"Dice8= "+ 
	     //                    dice8 + "\n" + "Dice9= "+ dice9 + "\n" + "Dice10= "+dice10 );
	      
	       sum=dice1+dice2+dice3+dice4+dice5+dice6+dice7+dice8+dice9+dice10;
	       
	       for(int j=11;j<=66;j++) {
	    	   if(sum==j) {
		    	   X[j-11]+=1;
		       }
		       
	       }
	       }
	       
	     
	       
	      
	       
	       for(int i=0;i<=55;i++) {
	    	   System.out.print(i+11+" : ");
	    	  for(int j=0;j<X[i];j++) {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println("");
	       }
	scan.close();    
	}
}
