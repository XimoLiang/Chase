import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Test01
{

	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add("aaa");
		list.add(new Date());
		list.add(1234);
		System.out.println("size: "+list.size());

		System.out.println(list);
//		list.forEach(System.out::println);
	}
}
