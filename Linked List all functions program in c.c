/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <stdlib.h>
struct node{
    struct node *link;
    int info;
};
struct node* create_list(struct node* start);
struct node* addatbeg(struct node* start,int data);
struct node* addatend(struct node* start,int data);
void display(struct node* start);
void count(struct node* start);
void search(struct node* start, int item);
struct node* del(struct node* start,int data);
struct node* addafter(struct node* start,int data,int item);
struct node* addbefore(struct node* start,int data,int item);

int main()
{
    struct node* start = NULL;
    int choice,data,item;
    while(1)
    {
    printf("\n1.create_list\n");
    printf("2.Display\n");
    printf("3.Count\n");
    printf("4.Search\n");
    printf("5.addbefore\n");
    printf("6.addafter\n");
    printf("7.delete\n");
    printf("Enter your choice : ");
    scanf("%d",&choice);
    switch(choice)
    {
        case 1 :
        start = create_list(start);
        break;
        case 2 :
        display(start);
        break;
        case 3 :
        count(start);
        break;
        case 4:
        printf("Enter the element to be search: ");
        scanf("%d",&data);
        search(start,data);
        break;
        case 5:
        printf("Enter the element to be inserted:");
        scanf("%d",&data);
        printf("Enter the element after which to insert:");
        scanf("%d",&item);
        start=addafter(start,data,item);
        break;
        case 6:
        printf("Enter the element to be inserted:");
        scanf("%d",&data);
        printf("Enter the element before which to insert:");
        scanf("%d",&item);
        start=addbefore(start,data,item);
        break;
        case 7:
        printf("Enter the elment to be deleted: ");
        scanf("%d",&data);
        start=del(start,data);
        break;
        case 8 :
        exit(1);
        default:
        printf("Wrong choice");
    }
    }
}
struct node* create_list(struct node* start)
{
    int n,i,data;
    printf("Enter the number of nodes: ");
    scanf("%d",&n);
    start = NULL;
    if(n==0)
    return start;
    printf("Enter the element to be inserted:");
    scanf("%d",&data);
    start = addatbeg(start,data);
    for(i=2;i<=n;i++)
    {
        printf("Enter the element to be inserted");
        scanf("%d",&data);
        start = addatend(start,data);
    }
    return start;
}
struct node* addatbeg(struct node* start,int data){
    struct node * tmp;
    tmp = (struct node *)malloc(sizeof(struct node));
    tmp->info=data;
    tmp->link=start;
    start = tmp;
    return start;
}
struct node* addatend(struct node* start,int data)
{
    struct node *p, *tmp;
    tmp = (struct node *)malloc(sizeof(struct node));
    tmp->info=data;
    p=start;
    while(p->link!=NULL)
    p=p->link;
    p->link=tmp;
    tmp->link=NULL;
    return start;
}
void display(struct node* start)
{
    struct node* p;
    if(start==NULL)
    {
        printf("List is Empty");
        return;
    }
    p=start;
    printf("List : \n");
    while(p!=NULL)
    {
        printf("%d ",p->info);
        p=p->link;
    }
    printf("\n\n");
}
void count(struct node* start){
        struct node* p;
        int c=0;
    p=start;
    while(p!=NULL)
    {
        c++;
        p=p->link;
    }
    printf("Number ofelements are: %d",c);
}
void search(struct node* start, int item)
{
    struct node* p;
    p=start;
    int pos=1;
    while(p!=NULL)
    {
        if(p->info==item)
        {
            printf("Item %d found at position %d",item,pos);
            return;
        }
        p=p->link;
        pos++;
    }
    printf("Item %d is not found in list",item);
}
struct node* del(struct node* start,int data){
    struct node *tmp,*p;
    if(start==NULL)
    {
        printf("List is Empty\n");
        return start;
    }
    //Deletion of first node;
    if(start->info==data)
    {
        tmp=start;
        start=start->link;
        free(tmp);
        return start;
    }
    //Deletion in between or at the end;
    p=start;
    while(p->link!=NULL)
    {
        if(p->link->info==data)
        {
            tmp=p->link;
            p->link=tmp->link;
            free(tmp);
            return start;
        }
        p=p->link;
    }
            printf("Element %d is not found",data);
            return start;
}
struct node* addafter(struct node* start,int data,int item)
{
    struct node * tmp,*p;
    p=start;
    while(p!=NULL)
    {
        if(p->info==item)
        {
            tmp = (struct node *)malloc(sizeof(struct node));
            tmp->info=data;
            tmp->link=p->link;
            p->link=tmp;
            return start;
        }
        p=p->link;
    }
    printf("%d is not present in the list",item);
    return start;
}
struct node* addbefore(struct node* start,int data,int item)
{
    struct node *tmp,*p;
    if(start==NULL)
    {
        printf("List is Empty\n");
        return start;
    }
    //if data to be inserted before first node
    if(item==start->info)
    {
         tmp = (struct node *)malloc(sizeof(struct node));
            tmp->info=data;
            tmp->link=start;
    }
    while(p->link!=NULL)
    {
        if(p->link->info==item)
        {
             tmp = (struct node *)malloc(sizeof(struct node));
            tmp->info=data;
            tmp->link=p->link;
            p->link=tmp;
            return start;
        }
        p=p->link;
    }
   printf("%d is not present in the list",item);
    return start;
}
