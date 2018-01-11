package unidade3.crud;

public interface IDAO<T> {
	
	public void create(T entidade);
	public void read(T entidade);
	public void update(T entidade);
	public void delete(T entidade);
	
	// 'entidade' representa uma tabela em nbanco de dados

}
