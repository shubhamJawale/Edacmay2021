//arraylist examples
import java.util.*;
import java.lang.*;
class ass1
{

	public static void main(String[] args) {
		/*List<String> list = new ArrayList<String>();

		//1.
		list.add(0, "PATIL");
		list.add(0, "PATILatfirstINdex");
		list.add("Nalawade");
		list.add("Pardeshi");
		list.add("Sharmaji");
		list.add("Jawale");
		list.add("Chavan");
		System.out.println(list);
		//2.

		//System.out.println(list.get(2));
		//3.
		list.set(0,"Shubham");



		System.out.println(list);

		//4. 
		list.remove(0);
		System.out.println(list);
		System.out.println(list.indexOf("PATIL"));
		System.out.println(list.contains("PATIL"));
		//5.
		Collections.sort(list);
		System.out.println(list);
		list.add(0, "PATILatfirstINdex");
		System.out.println(list);

		//remove at

		list.remove(0);
		System.out.println(list);
		//6.
		Collections.reverse(list);
		System.out.println(list);

		//System.out.println(Collections.binarySearch(5));

		////linked list*/

	/*	LinkedList<String> list1 = new LinkedList<String>();
		//adding elemets
		list1.add("Chavan");
		list1.add("Patil");
		list1.add("Nalawade");
		list1.add("Sharmaji");
		list1.add("Pardeshi");
		list1.add("Jawale");
		list1.addLast("Shubham");

		//System.out.println(list1);

		ListIterator itr = list1.listIterator();

		// while(itr.hasNext())
		// {	
		// 	String s1="Sharmaji";
		// 	String s = (String)itr.next();
		// 	if((s1.equals(s)))
		// 	{
		// 		continue;
		// 		//break;
			
		// 	}
		// 	System.out.println(s);
	
		// }

		///3.
		 // while(itr.hasNext()){
		 // 	itr.next();
			// }
			// while (itr.hasPrevious())
			// {
			// 	String s = (String)itr.previous();
			// 	System.out.println(s);
			// }

		//4.
		// list1.add(0, "PATILAt0thINdex");
		// System.out.println(list1);

		list1.addFirst("Yede");
		list1.addLast("Sagle");

		System.out.println(list1);

		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());

		System.out.println(list1.removeFirst());
		System.out.println(list1.removeLast());	
		System.out.println(list1);	

		Collections.swap(list1, 0 ,6);
		System.out.println(list1);
//meging two list

		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Chavan");
		list2.add("Patil");
		list2.add("Nalawade");
		list2.add("Sharmaji");
		list2.add("Pardeshi");
		list2.add("Jawale");
		list2.addLast("Shubham");

		list1.addAll(list2);
		System.out.println(list1);

		System.out.println(list1.contains("Jawale"));

		String[] arr = list1.toArray(new String[0]);

		// String arr1[] =Arrays.copyOf( list1.toArray(), list1.size(), String[].class);
		for(String x : arr)
		{
			System.out.println(x);

		}
		System.out.println(list1);
		System.out.println(list2);

		//LinkedList list3 = new LinkedList();
		//System.out.println(list1.compareTo(list2));
		System.out.println(list1.equals(list2));
		// for(String search : list1)
		// {
		// 	list3.add(list2.contains(search)?"yes":"no");
			
		// }
		//System.out.println(list3);

		System.out.println(list1.isEmpty()); 
		System.out.println(list1);
		list1.set(3,"load");//replace the element at 3rd index
		System.out.println(list1);*/

		/*HashSet<String> h1 = new HashSet<String>();

		h1.add("patil");
		h1.add("nalawade");
		h1.add("paradeshi");
		h1.add("chavan");
		h1.add("sharmaji");
		h1.add("jawale");
		System.out.println(h1);

			//1.
			System.out.println(h1.size());
			String[] arr = h1.toArray(new String[0]);
		
			for(String s : arr)
			{
				System.out.println(s);
			}
			//System.out.println(arr);

			TreeSet<String> t1 = new TreeSet<String>(h1);//insertion order not preserved but 
			System.out.println(t1);
			
			ArrayList l1 = new ArrayList(h1);//insertion sequence preserved
			System.out.println(l1);
			
			//remove all
			h1.clear();
			System.out.println(h1);*/
/*
			TreeSet<String> t1 = new TreeSet<String>();
			t1.add("patil");
			t1.add("nalawade");
			t1.add("paradeshi");
			t1.add("chavan");
			t1.add("sharmaji");
			t1.add("jawale");
			System.out.println(t1);
			Iterator itr = t1.iterator();

			while(itr.hasNext())
			{
				String s = (String)itr.next();
				System.out.println(s);
			}

			TreeSet<String> t2 = new TreeSet<String>(t1);
			System.out.println(t2);

			TreeSet<String> t3 = new TreeSet<String>(new descending());
			t3.add("patil");
			t3.add("nalawade");
			t3.add("paradeshi");
			t3.add("chavan");
			t3.add("sharmaji");
			t3.add("jawale");
			System.out.println(t3);
			Iterator itr1 = t3.iterator();
			// for(int i=0; i<3; i++)
			// {
			// 	if(itr1.hasNext())
			// 	{
			// 		String s = (String)itr1.next();
			// 		System.out.println();
			// 	}
			// }
			TreeSet<Integer> t3 = new TreeSet<Integer>();
			t3.add(1);
			t3.add(2);
			t3.add(3);
			t3.add(15);
			t3.add(16);
			t3.add(10);
			System.out.println(t3);
			Iterator itr11 = t3.iterator();

			while(itr11.hasNext())
			{
				Integer n = (Integer)itr11.next();
				
				if(n<7)
				{
					System.out.println(n);
				}
			}
 */

			HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
			hm1.put(1,"Shubham");
			hm1.put(2,"Chavan");
			hm1.put(3,"Patil");
			hm1.put(4,"Pardeshi");
			hm1.put(5,"Nalawade");
			hm1.put(6,"Fulare");

			System.out.println(hm1);
			System.out.println(hm1.size());
			HashMap<Integer, String> hm2 = new HashMap<Integer, String>(hm1);
				System.out.println(hm2);
				hm1.clear();
				System.out.println(hm1);

			System.out.println(hm2.containsKey(6));
			System.out.println(hm2.containsValue("Chavan"));
			Set s = hm2.entrySet();


			Iterator itr2 = s.iterator();
			while(itr2.hasNext())
			{
				Map.Entry m1= (Map.Entry) itr2.next(); 

				//System.out.println(m1.getKey() +" "+ m1.getValue());
				if(m1.getKey().equals(4))
				{
					m1.setValue("SHARMAJI");
				}
				System.out.println(m1.getKey() +" "+ m1.getValue());
			}


 }	
}



class descending implements Comparator
{
	public int compare(Object obj1, Object obj2)

	{
		String s1 = (String) obj1;
		String s2 = (String) obj2;

		
		return s2.compareTo(s1);
	}
}