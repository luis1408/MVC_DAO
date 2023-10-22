package dao;

import java.util.ArrayList;
import model.UsuarioModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class UsuarioDao implements GenericDao<UsuarioModel> {

    @Override
    public void incluir(UsuarioModel usuario) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(usuario);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(UsuarioModel usuario) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(usuario);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<UsuarioModel> consultar(String filtro) {
        String sql = "FROM " + UsuarioModel.class.getName() + filtro;
        ArrayList<UsuarioModel> lista = null;

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction t = session.beginTransaction();
            lista = (ArrayList<UsuarioModel>) session.createQuery(sql).list();
            t.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return lista;
    }

    @Override
    public void excluir(UsuarioModel usuario) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(usuario);
        t.commit();
        session.close();
    }

    @Override
    public UsuarioModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (UsuarioModel) session.load(UsuarioModel.class, id);
    }
}
