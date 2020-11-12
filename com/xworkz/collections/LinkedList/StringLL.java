package com.xworkz.collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StringLL {

	public static void main(String[] args) {
		
		LinkedList<String> iplTeams = new LinkedList<String>();
		System.out.println("Different Adding Methods");
		System.out.println("Using add method : " + iplTeams.add("MI"));//using add method
		System.out.println("Using addmethod with index : " ); iplTeams.add(1, "DC");//using add with index method
		System.out.println(iplTeams);
		System.out.println("Using addfirst method : " );iplTeams.addFirst("SRH");//using addfirst method
		System.out.println(iplTeams);
		System.out.println("Using addlast method : " );
		iplTeams.addLast("RCB");//using addlast method
		System.out.println("Using offer method : ");
		iplTeams.offer("CSK");//using offer method
		System.out.println(iplTeams);
		System.out.println("Using offerFirst method : ");
		iplTeams.offerFirst("KXIP");//using offerfirst method
		System.out.println(iplTeams);
		System.out.println("Using offerlast method : ");
		iplTeams.offerLast("RR");//using offerlast method
		System.out.println(iplTeams);
		System.out.println("Using push method : ");
		iplTeams.push("KKR");
		System.out.println(iplTeams);
		System.out.println("Using addall method : ");
		iplTeams.addAll(iplTeams);//using addall method
		System.out.println(iplTeams);
		System.out.println("-----------------------------------------------");
		System.out.println("Using Iterator");
		Iterator<String> str = iplTeams.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Using List Iterator");
		ListIterator<String> listr = iplTeams.listIterator();
		 
	    System.out.println("Forward List Iterator");
	    while(listr.hasNext()){
	       System.out.println(listr.next());
	    }
	    System.out.println("Backward List Iterator");
	    while(listr.hasPrevious()){
	       System.out.println(listr.previous());
	    }
		System.out.println("-----------------------------------------------");
		System.out.println("Using different Retrival Methods");
		System.out.println("Using peak method : " + iplTeams.peek());//using peek method
		System.out.println("Using peekFirst method : " + iplTeams.peekFirst());//using peekfirst method
		System.out.println("Using peeklast method : "  + iplTeams.peekLast());//using peeklast method
		System.out.println("Using element method : " +iplTeams.element());//using element method
		System.out.println("Using getmethod with index : " +iplTeams.get(2));//using get method
		System.out.println("Using getFirst method : " + iplTeams.getFirst());//using getFirst method
		System.out.println("Using getlast method : " + iplTeams.getLast());//using getLast method
		System.out.println("-----------------------------------------------");
		System.out.println("Using different Removal Methods");
		System.out.println("Using poll method : " + iplTeams.poll());
		System.out.println("Using pollfirst method : " + iplTeams.pollFirst());
		System.out.println("Using polllast method : " + iplTeams.pollLast());
		System.out.println("Using remove method : " + iplTeams.remove());
		System.out.println("Using remove method with index : " +iplTeams.remove(6));
		System.out.println("Using remove object method : " + iplTeams.remove("KKR"));
		System.out.println("Using removefirst method : " + iplTeams.removeFirst());
		System.out.println("Using removefirstoccurrence method : " + iplTeams.removeFirstOccurrence("SRH"));
		System.out.println("Using removelast method : " + iplTeams.removeLast());
		System.out.println("Using removelastoccurrence method : " + iplTeams.removeLastOccurrence("DC"));
		System.out.println("Using pop method : " + iplTeams.pop());
		System.out.println(iplTeams);
		
		
		
	}

}

/* Output : 
 Different Adding Methods
Using add method : true
Using addmethod with index : 
[MI, DC]
Using addfirst method : 
[SRH, MI, DC]
Using addlast method : 
Using offer method : 
[SRH, MI, DC, RCB, CSK]
Using offerFirst method : 
[KXIP, SRH, MI, DC, RCB, CSK]
Using offerlast method : 
[KXIP, SRH, MI, DC, RCB, CSK, RR]
Using push method : 
[KKR, KXIP, SRH, MI, DC, RCB, CSK, RR]
Using addall method : 
[KKR, KXIP, SRH, MI, DC, RCB, CSK, RR, KKR, KXIP, SRH, MI, DC, RCB, CSK, RR]
-----------------------------------------------
Using Iterator
KKR
KXIP
SRH
MI
DC
RCB
CSK
RR
KKR
KXIP
SRH
MI
DC
RCB
CSK
RR
-----------------------------------------------
Using List Iterator
Forward List Iterator
KKR
KXIP
SRH
MI
DC
RCB
CSK
RR
KKR
KXIP
SRH
MI
DC
RCB
CSK
RR
Backward List Iterator
RR
CSK
RCB
DC
MI
SRH
KXIP
KKR
RR
CSK
RCB
DC
MI
SRH
KXIP
KKR
-----------------------------------------------
Using different Retrival Methods
Using peak method : KKR
Using peekFirst method : KKR
Using peeklast method : RR
Using element method : KKR
Using getmethod with index : SRH
Using getFirst method : KKR
Using getlast method : RR
-----------------------------------------------
Using different Removal Methods
Using poll method : KKR
Using pollfirst method : KXIP
Using polllast method : RR
Using remove method : SRH
Using remove method with index : KXIP
Using remove object method : true
Using removefirst method : MI
Using removefirstoccurrence method : true
Using removelast method : CSK
Using removelastoccurrence method : true
Using pop method : DC
[RCB, CSK, RR, MI, RCB]

 */


