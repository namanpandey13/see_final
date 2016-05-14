class addingfriend implements command 
{
user User;
public addingfriend(user User)
{
this.User=User;
}
public void execute()
{
this.User.addfriend();
}
}

