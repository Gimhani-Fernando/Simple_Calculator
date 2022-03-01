public class Calculator {
    protected int number1,number2,ans=0;
    
	public void getData(int number1,int number2){
       	this.number1=number1;
       	this.number2=number2;
    }
	
	public void add(){
		this.ans=this.number1+this.number2;
        System.out.println("Answer is "+this.ans);
    }
    
	public void subtract(){
		this.ans=this.number1-this.number2;
       	System.out.println("Answer is "+this.ans);
    }
    
	public void multiply(){
    	this.ans=this.number1*this.number2;
       	System.out.println("Answer is "+this.ans);
	}
    
	public void divide(){
       	this.ans=this.number1/this.number2;
       	System.out.println("Answer is "+this.ans);	
    }
    
}
