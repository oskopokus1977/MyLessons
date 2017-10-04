package classWork.Synhronize;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MySet extends HashSet{
    static Set<String>set;

    public MySet(){
      set = Collections.synchronizedSet(new HashSet<>());
    }
}
