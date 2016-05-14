class unlike_friend implements command 
{
user User;
public unlike_friend (user User)
{
this.User=User;
}
public void execute() 
{
this.User.likeremove();
}
}
