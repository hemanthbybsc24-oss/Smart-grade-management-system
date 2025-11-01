public class TDemo1{ 
 
public static void main(String args[])
{
  Thread t=Thread.currentThread();
  System.out.println("Current thread  "+ t);

  t.setName("Main Thread Demo");
  System.out.println("After renaming the Current thread  "+ t);


}
}
// // Create a thread Extending the Thread Class

// class TDemo extends Thread {
//  public void run()
// {
//   System.out.println("Thread running     "+getName());
// }

// public static void main(String args[])
// {
//   TDemo t1=new TDemo();
//   TDemo t2=new TDemo();
//   t1.start();
//   t2.start();
// }
// }

// // Create a thread Extending the Thread Class

// class TDemo extends Thread {
//  public void run()
// {
//   System.out.println("Thread running     "+getName());
// }

// public static void main(String args[])
// {
//   TDemo t1=new TDemo();
//   TDemo t2=new TDemo();
//   t1.start();  // create a New thread and Calling run()
//   t2.start();
// }
// }

// // Main thread: Java runs every program inside a main thread

// public class TDemo1{ 
 
// public static void main(String args[])
// {
//   Thread t=Thread.currentThread();
//   System.out.println("Current thread  "+ t);

// }
// }
// Main thread: Java runs every program inside a main thread

// class Tasks1 extends Thread{
//  private String task;
 
//   Tasks1(String task){
//   this.task=task;
// }
  
// public void run(){
//  System.out.println(task + "task is done by " + Thread.currentThread().getName());
// }

// public static void main(String args[])
// {
//   Tasks1 t1=new Tasks1("Type ");
//   Tasks1 t2=new Tasks1("Save ");
//   Tasks1 t3=new Tasks1("Execute ");
//   t1.start();
//   t2.start();
//   t3.start();
// }
// }

// create a thread which will print numbers from 10 to 20
// create another thread which will print the numbers from 100 to 120

// class FirstThread extends Thread{
// public void run(){
//  for (int i=10;i<=20;i++)
//   System.out.println("Number is  "+i);
// }
// }

// class SecondThread extends Thread{
// public void run(){
//  for (int i=100;i<=120;i++)
//   System.out.println("Number is  "+i);
// }
// }
// public class TDemo4{
// public static void main(String args[])
// {
//   FirstThread t1=new FirstThread();
//   SecondThread t2=new SecondThread();
//   t1.start();
//   t2.start();
// }  
// }

