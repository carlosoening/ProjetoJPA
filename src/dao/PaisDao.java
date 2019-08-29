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
		dao.save(p);
		//dao.remove(new Pais(8));
		List<Pais> p2 = dao.findAll(Pais.class);
		
		for (Pais pa : p2) {
			System.out.println(pa.getId());
			System.out.println(pa.getNome());
			List<Estado> estados = pa.getEstados();
			String nomes = "";
			for (Estado e : estados) {
				nomes += e.getNome()+", ";
			}
			System.out.println(nomes);
		}
	}
}
