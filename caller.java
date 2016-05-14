public class caller 
{
command Command;
public caller(command c){
this.Command=c;
}     
public void execute(){
this.Command.execute();
}
}
