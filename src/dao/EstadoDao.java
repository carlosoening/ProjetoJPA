package dao;

import java.util.List;

import vo.Estado;
import vo.Pais;

public class EstadoDao extends GenericDao<Estado> {
	public static void main(String[] args) {
		EstadoDao dao = new EstadoDao();
		Estado e = new Estado();
		e.setNome("Kanto");
		e.setUf("KA");
		e.setPopulacao(144449);
		e.setPais(new Pais(12));
		//Estado e = dao.findById(Estado.class, 2);
		//dao.save(e);
		//dao.remove(new Estado(11));
		
		Estado e2 = new Estado();
		e2.setId(10);
		e2.setNome("Ohio");
		e2.setUf("OO");
		//dao.update(e2)
		
		List<Estado> lista = dao.findAll(Estado.class);
		for (Estado ee : lista) {
			System.out.println(ee.getId());
			System.out.println(ee.getNome());
			System.out.println(ee.getUf());
			System.out.println(ee.getPais().getNome());
			System.out.println("-------------------------------");
		}
	}
}
