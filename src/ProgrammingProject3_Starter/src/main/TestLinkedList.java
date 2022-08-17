package ProgrammingProject3_Starter.src.main;


public class TestLinkedList<T> {

	public static void main(String[] args) {
		GenericLinkedList<String> s = new GenericLinkedList<String>();
		GenericLinkedList<Integer> i = new GenericLinkedList<Integer>();
		GenericLinkedList<Double> d = new GenericLinkedList<Double>();
		
		GenericNode<Integer> iNode = new GenericNode<Integer>();
		iNode.setData(1);
		i.addNode(iNode);
		iNode=new GenericNode();
		iNode.setData(2);
		i.addNode(iNode);
		
		GenericNode<String> sNode = new GenericNode<String>();
		sNode.setData("Type 1");
		s.addNode(sNode);
		sNode = new GenericNode();
		sNode.setData("Type 2");
		s.addNode(sNode);
		
		GenericNode<Double> dNode = new GenericNode<Double>();
		dNode.setData(1.2);
		d.addNode(dNode);
		dNode=new GenericNode();
		dNode.setData(1.4);
		d.addNode(dNode);
		
		GenericNode tNode = s.getList();
		do
		{
			System.out.println(tNode.getData());
			tNode=tNode.getNextNode();
		} while (tNode != null);
		GenericNode t2Node=i.getList();
		do {
			System.out.println(t2Node.getData());
			t2Node=t2Node.getNextNode();
		} while (t2Node!=null);
		GenericNode t3Node=d.getList();
		do {
			System.out.println(t3Node.getData());
			t3Node=t3Node.getNextNode();
		} while (t3Node!=null);
	}//end main

}//end class
