// stackMiddle.java

class stack
{
    int top=-1;
    int arr[];
    int size;
    stack(int size){
        this.size=size;
        arr= new int[size];
    }



    void push(int element)
    {
        if(top==size)
        {
            System.out.println("Stack is Full");
        }
        else
        {
            arr[++top]=element;
        }
    }

    int  pop(){
        int x = -1;
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
             x = arr[top];
            top--;
        }
        return x;
    }

    int peek(){
        int x = -1;
        if(top==-1)
        {
                System.out.print("Stack is empty");
                
        }

        else
        {
             x = arr[top];
       }

        return x;
    }

    void display(){
        if(top==-1)
        {
            System.out.println("Stack is empty");

        }
        else
        {    System.out.print("[");
            for(int i=0; i<=top; i++)
            {
                System.out.print(arr[i]+", ");
            }
            System.out.print("]");
        }
    }

    


    void pushMiddle (int data)
    { 
        stack s2= new stack(size);
        int temptop=top;
        int mid = (top+1)/2;
         for(int i =0; i<mid; i++)
        {
            s2.push(pop());
           
        }
        
        push(data);
        
        for(int i=0; i<mid; i++)
        {
            push(s2.pop());
        
        }

    }

    int PopMiddle()
    {    
        stack s2= new stack(size);
        int temptop=top;
        int mid = (top+1)/2;
        
        

        for(int i =0; i<mid; i++)
        {
            s2.push(pop());
           
        }
        
        int temp = pop();

        

        for(int i=0; i<mid; i++)
        {
            push(s2.pop());
        
        }

        return  temp;

    }  

    int max ()
    {
        stack st2= new stack(size);
        //stack st3= new stack (size);

        int key = arr[top];

        for(int i=0; i<size; i++)
        {   
          if(top==-1)
          {

          }
          else{
             if(key <arr[top])
            {
                key = arr[top];
                st2.push(pop());
            }
            else
            {
                st2.push(pop());
            }

          }

        }
        
        return key;

    }     

}



    
    



public class stackMiddle
{





    public static void main(String args[])
    {
        stack st = new stack(10);
         st.push(80);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(30);
        st.push(60);
        st.display();
        //System.out.println(st.max());
        System.out.println(); 
        st.pushMiddle(1000);
          st.display();
        //    System.out.println(st.peek());
        
        //System.out.println(st.PopMiddle());
        //st.display();

    }
}