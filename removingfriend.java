class removingfriend implements command 
{
user User;
public removingfriend (user User)
{
this.User=User;
}
public void execute() 
{
this.User.removefriend();
}
}
