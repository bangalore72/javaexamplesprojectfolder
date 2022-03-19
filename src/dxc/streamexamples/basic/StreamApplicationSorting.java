package dxc.streamexamples.basic;

 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplicationSorting {

    public static void main(String[] args) {

        List<String> list = 
        			Arrays.asList( "Z", "A", "1", "B", "Y", "4", "a", "c" , "a");

        /* 
		List<String> sortedList = list.stream()
			.sorted(Comparator.naturalOrder())
			.collect(Collectors.toList());
			
        List<String> sortedList = list.stream()
			.sorted((o1,o2)-> o1.compareTo(o2))
			.collect(Collectors.toList());
		*/

        List<String> sortedList = list.stream().sorted().distinct().
        			collect(Collectors.toList());
		
		
        System.out.println(" Sequential --start--");
		
        sortedList.forEach(System.out::println);
        
        
        System.out.println(" Sequential --end parallel start--");
    	

        List<String> sortedList1 = list.stream().parallel()
        			.sorted().collect(Collectors.toList());
		
        
        sortedList1.forEach(System.out::println);
        
        

    }
}