import java.util.ArrayList;
import java.util.List;

public class Tasks {
    public List<String> listN(){
        List<String> list = new ArrayList<>();
        for(int i = 1; i < 15; i++){
            list.add("Any Task "+i);
        }
        return list;
    }
}