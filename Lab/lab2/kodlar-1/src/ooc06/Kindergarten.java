package ooc06;

public class Kindergarten {
	private Child[] children;
	private int childCount;
	public static final int maxChild = 50;
	
	public Kindergarten( ) {
		children = new Child[maxChild];
		childCount = 0;
	}
	public Child findChild( String name ) {
		for( int i=0; i<childCount; i++ )
			if( children[i].getName().compareToIgnoreCase(name) == 0 )
				return children[i];
		return null;
	}
	public boolean addChild( Child aChild ) {
		if( childCount == maxChild || aChild == null || 
				findChild(aChild.getName()) != null )
			return false;
		children[childCount]=aChild;
		childCount++;
		return true;
	}
	public Child findOldestChild( ) {
		Child oldest = children[0];
		for( int i=1; i<childCount; i++ )
			if( children[i].getAgeInMonths() > oldest.getAgeInMonths() )
				oldest = children[i];
		return oldest;
	}

}
