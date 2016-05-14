class like_friend implements command 
{
user User;
public like_friend (user User)
{
this.User=User;
}
public void execute() 
{
this.User.likeadd();
}
}
