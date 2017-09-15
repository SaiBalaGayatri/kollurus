import java.util.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	LinkedList<Student> ll=new LinkedList<Student>();
	HashMap<Student,Integer> h=new HashMap<Student,Integer>();
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		
	}

	@Override
	public Student[] getStudents() {
		return students;
		// Add your implementation here
	}

	public void setStudents(Map<? extends Student, ? extends Integer> students) {
		// Add your implementation here
		h.putAll(students);
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		h.get(index);
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		h.put(student,index);
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		ll.addFirst(student);
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		ll.addLast(student);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		h.put(student,index);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		h.remove(index);
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		h.clear();
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		h.remove(index);
	}

	@Override
	public void removeFromElement(Student student) 
	{
		int key=0;
	    for(Map.Entry e:h.entrySet())
	    {
	    	if(student.equals(e.getValue()))
	    	{
	    		key=(int) e.getKey();
	    		break;
	    	}
	    }
	    h.remove(key);
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		Integer st=h.get(index);
	    h.clear();
	    h.put(null, st);
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		Integer st=h.get(student);
		h.clear();
		h.put(null, st);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Map<Student,Integer> map=new TreeMap<Student,Integer>(h);
		Set s=map.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry m1=(Map.Entry)i.next();
			System.out.print(m1.getKey()+": ");
			System.out.println(m1.getValue());
			
		}
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
	for(Map.Entry<Student,Integer> e:h.entrySet())
	{
		Student key=e.getKey();
		Integer values=e.getValue();
		System.out.println(h);
	}
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		for(Map.Entry<Student,Integer> e:h.entrySet())
		{
			Student key=e.getKey();
			Integer values=e.getValue();
			System.out.println(h);
		}
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// TODO Auto-generated method stub
		
	}
}
