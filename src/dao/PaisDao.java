package dao;

import vo.Pais;

public class PaisDao extends GenericDao<Pais> {
	public static void main(String[] args) {
		PaisDao dao = new PaisDao();
		Pais p = new Pais();
		p.setNome("Brasil");
		p.setPopulacao(987984498);
		p.setLinguaPrincipal("Português");
		p.setCodigoDeDiscagem("+55");
		p.setDimensao(9879879.00);
		p.setContinente("América");
		dao.save(p);
	}
}
