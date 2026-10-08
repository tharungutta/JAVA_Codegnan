package CollectionsFramework;

import java.util.HashSet;

public class SetDemo3 {
   public static void main(String[] args) {
	  HashSet<SetDemo2>  set = new HashSet<>();
	  
	  set.add(new SetDemo2(101,"Pen"));
	  set.add(new SetDemo2(102,"Pencil"));
	  set.add(new SetDemo2(103,"PenPencil"));
	  set.add(new SetDemo2(104,"PenEraser"));
	  set.add(new SetDemo2(105,"Pen"));
	  
	  System.out.println(set);
	  
	  for(SetDemo2 demo: set) {
		  System.out.println(demo);
	  }
}
}
