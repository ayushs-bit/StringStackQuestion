import java.util.Scanner;

class QuestionStack
{
    int top;
    String[] arr;
    public QuestionStack()
    {
        top=-1;
        arr=new String[5];
    }
    
    public void push(String elem) 
    {
        if (top>=arr.length-1) 
        {
            System.out.println("Stack is full");
        } 
        else 
        {
            top++;
            arr[top] = elem;

        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Deleted "+arr[top]);
            arr[top]=null;
            top--;
        }
    }
    public void traverse()
    {
        for (int i = top; i >=0 ; i--) 
        {
            System.out.println(arr[i]);
        }
    }
    public boolean search(String str)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i].equals(str))
            {
                return true;
            }
        }
        return false;
    }
}
class Main
{
    private static final short PUSH=1;
    private static final short POP=2;
    public static final short Traverse=3;
    public static final short Search=4;

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        QuestionStack obj=new QuestionStack();
        boolean run=true;
        while(run){
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for search");
            System.out.println("Press 5 for exit");
            System.out.println("Enter your choice");
            
            int a=sc.nextInt();
            
            switch (a)
            {
                case PUSH:
                    System.out.println("Enter the element");
                    sc.nextLine();
                    obj.push(sc.nextLine());
                    break;
                case POP:
                    obj.pop();
                    break;
                case Traverse:
                    obj.traverse();
                    break;
                case Search:
                    sc.nextLine();
                    System.out.println("Enter the search the elment");

                    boolean res=obj.search(sc.nextLine());
                    if(res){
                        System.out.println("Found");
                    }
                    else{
                        System.out.println("Not found");
                    }
                    break;
                default:
                    System.out.println("Wrong choice");

    }
}}}