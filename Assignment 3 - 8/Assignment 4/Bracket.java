import java.util.*;
class Stack{
    char arr[];
    int size;
    int top;
    Stack(int size){
        this.size = size;
        this.arr = new char[size];
        this.top=-1;
        
    }
    public void push(char data){
        if(isFull()){
            System.out.println("stack is full");
        }
        else{
            arr[++top] = data;
        }
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("stack is isEmpty");
            return '1';
        }
            char data = arr[top--];
            return data;
    }
 
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else
        return false;
    }
    public boolean isFull(){
        if(top == (size-1)){
            return true;
        }
        return false;
    }
}
public class Bracket
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter brackets:");
		String str= scan.nextLine();

        boolean answer = true;
        
        Stack s = new Stack(str.length());
        
        for(int i = 0 ; i < str.length() ; i++ ){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else if( ch == ')' || ch == '}' || ch == ']'){
               char ch1= 'A';//only initilization purpose 'A'
                if(!s.isEmpty()){
                     ch1= s.pop();
                }
                else{
                    answer=false;    
                }
                
                if(ch=='(' && ch1 != ')'){
                    answer = false;
                    break;
                }
                else if(ch=='{' && ch1 != '}'){
                    answer = false;
                    break;
                }
                else if(ch=='[' && ch1 != ']'){
                    answer = false;
                    break;
                }
            }
        }
        if(s.isEmpty() && answer){
            System.out.println("expression is balanced");
        }
        else{
            System.out.println("expression is unbalanced ");
        }
        
	}
}
