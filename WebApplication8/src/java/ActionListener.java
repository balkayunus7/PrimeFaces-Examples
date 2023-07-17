import javax.faces.bean.ManagedBean;  
import javax.faces.bean.ViewScoped;  
@ManagedBean  
@ViewScoped  
public class ActionListener {  
int counter;  
public int getCounter() {  
return counter;  
}  
public void setCounter(int counter) {  
this.counter = counter;  
}  
public void increment(){  
counter+=2;  
}  
}  