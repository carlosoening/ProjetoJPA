package dao;

import java.util.List;

import vo.Cidade;
import vo.Estado;

public class CidadeDao extends GenericDao<Cidade>{
	public static void main(String[] args) {
		CidadeDao dao = new CidadeDao();
		Cidade cidade = new Cidade();
		
		//cidade.setId(17);
		cidade.setNome("Orleans");
		cidade.setPopulacao(1);
		cidade.setDimensao(98795.1);
		cidade.setEstado(new Estado(4));
		//dao.save(cidade);
		//dao.update(cidade);
		
		//dao.remove(new Cidade(15));
		
		List<Cidade> lista = dao.findAll(Cidade.class);
		if (!lista.isEmpty()) {	
			for (Cidade c : lista) {
				System.out.println(c.getId());
				System.out.println(c.getNome());
				System.out.println(c.getEstado().getNome());
				System.out.println("--------------------------");
			}
		}
		lista = dao.findByDesc(Cidade.class, "nome", "Orle");
		if (!lista.isEmpty()) {
			for (Cidade c : lista) {
				System.out.println(c.getId());
				System.out.println(c.getNome());
				System.out.println(c.getEstado().getNome());
				System.out.println("--------------------------");
			}
		}
		
		cidade = dao.findById(Cidade.class, 17);
		if(cidade != null) {
			System.out.println(cidade.getNome());
			System.out.println(cidade.getEstado().getNome());
			System.out.println(cidade.getPopulacao());
			System.out.println("--------------------");
		}
	}
}
