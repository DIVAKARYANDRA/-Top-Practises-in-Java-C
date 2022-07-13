/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#define n 10
int arr[n];
int front = -1;
int rear = -1;
int count;

void enqueue(int a)
{
    if(front==-1 && rear==-1)
    front=rear=0;
    else if((rear+1)%n==front)
    printf("Queue is full");
    else
    rear=(rear+1)%n;
    arr[rear]=a;
}
void dequeue()
{
    if(front==-1 && rear==-1)
    printf("Queue is empty");
    else if(front==rear)
    front =rear=-1;
    else
    front=(front+1)%n;
   
}
void display()
{
    count = ((rear + n - front)%n)+1;
    for(int i=0;i<count;i++)
    {
    printf("%d",arr[(front+i)%n]);
    printf("\n");
    }
}
int main()
{
    enqueue(15);
    enqueue(10);
    enqueue(20);
    display();
    dequeue();
    dequeue();
    display();
}