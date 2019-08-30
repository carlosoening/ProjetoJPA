package dao;

import java.util.List;

import vo.Estado;
import vo.Pais;

public class PaisDao extends GenericDao<Pais> {
	public static void main(String[] args) {
		PaisDao dao = new PaisDao();
		Pais p = new Pais();
		p.setNome("Japão");
		p.setPopulacao(97479844);
		p.setLinguaPrincipal("Japonês");
		p.setCodigoDeDiscagem("+81");
		p.setDimensao(987982.00);
		p.setContinente("Ásia");
		//dao.save(p);
		//dao.remove(new Pais(8));
		List<Pais> listaPais = dao.findAll(Pais.class);
		
		for (Pais pa : listaPais) {
			System.out.println(pa.getId());
			System.out.println(pa.getNome());
			List<Estado> estados = pa.getEstados();
			String nomes = "";
			for (Estado e : estados) {
				nomes += e.getNome()+", ";
			}
			System.out.println(nomes);
			System.out.println("-------------------------");
		}
		Pais p2 = new Pais();
		p2.setId(1);
		p2.setNome("Brasil");
		p2.setPopulacao(12000255);
		p2.setLinguaPrincipal("Português");
		p2.setCodigoDeDiscagem("+55");
		p2.setDimensao(1989519.82);
		p2.setContinente("América do Sul");
		//dao.update(p2);
		
		p = dao.findById(Pais.class, 7);
		if (p != null) {
			System.out.println(p.getNome());
			System.out.println(p.getContinente());
			System.out.println("------------------");
		}
		
		listaPais = dao.findByDesc(Pais.class, "nome", "Jap");
		if (!listaPais.isEmpty()) {
			for (Pais pp : listaPais) {
				System.out.println(pp.getId());
				System.out.println(pp.getNome());
				System.out.println(pp.getCodigoDeDiscagem());
				System.out.println(pp.getContinente());
			}
		}	
	}
}
