package stream_api;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamApi {

	public static void main(String[] args) {
		
//		List<String> list = List.of("Joker","Moker","Voker","Mohit");
//		
//		List<String> res =list.stream()
//				.filter(str -> str.startsWith("M"))
//				.map(str -> str+"t")
//				.collect(Collectors.toList());
//		
//		System.out.println(res);
		
//		List<Integer> list=List.of(1,2,3,4,5);
//		
//		int res = list.stream()
//							.reduce(1,(a,b)->a*b);
//		
//		int n=6;
//		
//		int factorial =IntStream.rangeClosed(1, n)
//                .reduce(1, Math::multiplyExact);
//
//		int sum=java.util.stream.IntStream.rangeClosed(1,n)
//				.reduce(0,Integer::sum);
//		
//		System.out.println(sum);
		
		List<Integer> evens=List.of(1,2,3,4,5);
		
		List<Integer> res=evens.stream().filter(n->n%2==0).toList();
		
		System.out.println(res);
		
	}

}
