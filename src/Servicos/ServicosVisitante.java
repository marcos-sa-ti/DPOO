package Servicos;

import DAO.FuncDAO;
import classes.Visitante;

public class ServicosVisitante {
    
    public static void cadastrarVisitante (Visitante visitante ) throws Exception{
    
        FuncDAO dao = new FuncDAO();
        dao.cadastrarVisitante(visitante);
    
    }
    
    
}
