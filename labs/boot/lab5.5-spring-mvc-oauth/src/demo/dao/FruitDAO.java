package demo.dao;

import java.util.List;

import demo.model.Fruit;

public interface FruitDAO {
	    
	public List<Fruit> getAll();
	
	public Fruit findById(int id);
    
    public Fruit findByName(String name);

    public void create(Fruit fruit);

    public void update(Fruit fruit);
    
    public void delete(int id);
    
    public boolean exists(Fruit fruit) ;	

}
