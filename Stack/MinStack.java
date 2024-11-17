package Stack;
import java.util.*;
public class MinStack{
    Stack<Integer> main;
    Stack<Integer> min;
    public MinStack(){
        main = new Stack<>();
        min = new Stack<>();
    } 
    public void push(int x){
       main.push(x);
       if(min.isEmpty() || x <= min.peek()){
          min.push(x);
       }
    }
    public void pop(){
        if(!main.isEmpty()){
           int top = main.pop();
           if(top == min.peek()){
            min.pop();
           }
        }
    }
    public int top(){
        return main.peek();
    }
    public int getMin(){
        return min.peek();
    }

    public static void main(String[] args) {
       MinStack ans = new MinStack();
       ans.push(5);
       ans.push(2);
       ans.push(7);
       ans.push(1);
       ans.push(3);
       System.out.println("The current minimum : " + ans.getMin());
       ans.pop();
       System.out.println("Top Element : " + ans.top());
    }
}

