package dao;

import vo.Estado;

public class EstadoDao extends GenericDao<Estado> {
	public static void main(String[] args) {
		EstadoDao dao = new EstadoDao();
		Estado e = new Estado();
		e.setNome("aaa");
		dao.save(e);
	}
}
