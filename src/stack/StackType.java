/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;



public class StackType {
    
    private int top ;
    public String items[] = new String[10];
    

    public StackType(){
        top = -1 ;
        
        
    }
    
    public void makeEmpty(){
        for(int i = 0 ; i <= top ; i++)
            items[i] = "" ;
        top = -1 ;
        
    }
    
    public boolean isEmpty(){
        return (top == -1);
        
    }
    
    public boolean isFull(){
        return (top == 9) ;
    }
    
    public void push(String newItem){
        top++;
        items[top] = newItem ;
        
    }
    
    public void pop(){
        items[top] = "";
        if (top != -1)
        top--;
        
    }
    
    public String top(){
        
        return items[top];
    }
    
}
