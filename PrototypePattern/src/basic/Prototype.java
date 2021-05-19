package basic;

public abstract class Prototype {
	public int x;
	public int y;
	
	public Prototype() {
	}
	
	public Prototype(Prototype target) {
		if(target != null) {
			this.x = target.x;
            this.y = target.y;
		}
	}
	public abstract Prototype clone();
	 
	@Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Prototype)) return false;
        Prototype shape2 = (Prototype) object2;
        return shape2.x == x && shape2.y == y;
    }

}
