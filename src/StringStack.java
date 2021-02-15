import java.util.Scanner;
public class StringStack 
{
    String ar[];
    int top;
    StringStack()
    {
        ar = new String[5];
        top = -1;
    }
void push() //insert
{
    if (top == 4)
    {
        System.out.println("stack is full");
    }
    else
    {
        System.out.println("enter data");
        Scanner sc2 = new Scanner(System.in);
        String data = sc2.nextLine();
        
        top = top+1;
        ar[top]=data;
        System.out.println("data inserted ...");
    }
}
void pop() //delete
{
    if(top == -1)
    {
        System.out.println("stack is empty"); 
    }
    else
    {
         System.out.println("element deleted");
         top = top -1;
    }
}
void traverse() //view
{
   if(top == -1)
   {
       System.out.println("Stack is empty");
   }
   else
   {
       for(int i = top;i>=0;i--)
       {
           System.out.println(ar[i]);
       }
   }
//System.out.println("view is working");
}
void search()
{
    if(top == -1)
   {
       System.out.println("Stack is empty");
   }
   else
   {    
        System.out.println("enter name to be serached");
        Scanner sc3 = new Scanner(System.in);
        String str  = sc3.nextLine();
        int c = 0;
        for (int i = 0; i < ar.length; i++) 
        {
            if(ar[i].equalsIgnoreCase(str))
            {
               c++;
               break;
            }
        }
        if(c > 0)
        {
            System.out.println("Name found");
        }
        else
        {
            System.out.println("Not found");
        }
    
    }
}
public static void main (String args[])
{
    StringStack obj = new StringStack();
    while(true)
    {
        System.out.println("\npress 1 for push");
        System.out.println("press 2 for pop");
        System.out.println("press 3 for traverse");
        System.out.println("press 4 for search");
        System.out.println("press 5 for exit\n");
        
        System.out.println("enter your choice");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        
        switch(ch)
        {
            case 1:
                obj.push();
                break;
            case 2:
                obj.pop();
                break;
            case 3:
                obj.traverse();
                break;
            case 4:
                obj.search();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Wrong choice");
                
        }
    }
}
}

