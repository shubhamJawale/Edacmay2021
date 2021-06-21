import java.util.*;
class Stacks
{
    int top=-1;
    int arr[];
    int size;
         Stacks(int size){
        arr = new int[size];
        this.size=size;
    }

    Boolean isEmpty(){
        Boolean temp = false;
        if(top==-1)
        {
            temp = true;
        }
        return temp;
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
    int pop(){
        int  x = 0;
        if(isEmpty())
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
    void display(){
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else{
                 for(int i=0; i<=top; i++)
                     {
                        System.out.println(arr[i]+" ");
                     }
            }
    }

   int peek() {
     if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
    return top;
   }


    Stacks Reverse()
    {
       Stacks st2 = new Stacks(size);

        for(int i = 0; i<size; i++)
        {
            st2.push(pop());
        }

        return st2;
    }
     void displaychar(){
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else{
            for(int i=0; i<=top; i++)
             {
                System.out.print((char)(arr[i])+" ");
            }
        }
    }


}
class srevers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        char arr1[] = key.toCharArray();


        Stacks st = new Stacks(key.length());
        for(int i =0; i<key.length();i++)
        {
                st.push((int)arr1[i]);
        }
        st.displaychar();
        st = st.Reverse();
        System.out.println();
        st.displaychar();

        
    }
}

