class TwoStack
{
     TwoStack(int size){
        this.size=size;
        arr= new int[size];
        this.mid=(size-1)/2;
        this.top2=mid;
    }
    int top1=-1;
   
    int arr[];
    int size;
   

    int mid;
    int top2;
    void pushFirst(int element)
    {
        if(top1==mid)
        {
            System.out.println(" First Stack  is Full");
        }
        else
        {
            arr[++top1]=element;
        }
    }

    int  popFirst(){
        int x = -1;
        if(top1==-1)
        {
            System.out.println("First Stack is empty");
        }
        else
        {
             x = arr[top1];
            top1--;
        }
        return x;
    }

    int peekFirst(){
        int x = -1;
        if(top1==-1)
        {
                System.out.print("first Stack is empty");
                
        }

        else
        {
             x = arr[top1];
       }

        return x;
    }

    void displayFirst(){
        if(top1==-1)
        {
            System.out.println("first Stack is empty");

        }
        else
        {    System.out.print("[");
            for(int i=0; i<=top1; i++)
            {
                System.out.print(arr[i]+", ");
            }
            System.out.print("]");
        }
    }
////Second Stack

     void pushSecond(int element)
    {
        if(top2==size-1)
        {
            System.out.println(" Second Stack  is Full");
        }
        else
        {
            arr[++top2]=element;
        }
    }

    int  popSecond(){
        int x1 = -1;
        if(top2==mid)
        {
            System.out.println("Second Stack is empty");
        }
        else
        {
             x1 = arr[top2];
            top2--;
        }
        return x1;
    }

    int peekSecond(){
        int x1 = -1;
        if(top2==-1)
        {
                System.out.print(" Second Stack is empty");
                
        }

        else
        {
             x1 = arr[top2];
       }

        return x1;
    }

    void displaySecond(){
        if(top2==mid)
        {
            System.out.println(" Second Stack is empty");

        }
        else
        {    System.out.print("[");
            for(int i=mid+1; i<=top2; i++)
            {
                System.out.print(arr[i]+", ");
            }
            System.out.print("]");
        }
    }

   






}





class q3{
    public static void main(String[] args) {
        
       TwoStack t = new TwoStack(20);

          t.pushFirst(10);
         t.pushSecond(20);
          t.pushFirst(30);
        t.pushSecond(40);
          t.pushFirst(50);
        t.pushSecond(60);
          t.pushFirst(70);
         t.pushSecond(80);
          t.pushFirst(90);
          t.pushSecond(100);
          t.displayFirst();
        t.displaySecond();
        System.out.println();
       // System.out.println("first pop:"+t.popFirst());
       // System.out.println("Second pop"+t.popSecond());
          t.pushFirst(10);
         t.pushSecond(20);
          t.pushFirst(30);
        t.pushSecond(40);
          t.pushFirst(50);
        t.pushSecond(60);
          t.pushFirst(70);
         t.pushSecond(80);
          t.pushFirst(90);
          t.pushSecond(100);
         t.displayFirst();
        t.displaySecond();
         t.pushFirst(10);
         t.pushFirst(20);
         t.pushFirst(333330);
          t.displayFirst();
          t.displaySecond();
    }
}
