package KappaCRM.Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import KappaCRM.Model.CModelEntity;
import KappaCRM.Model.CModelIncident;
import KappaCRM.Utility.CUtilityStorage;

public class CRepositoryIncident {
	
	public void insert(CModelIncident incident) throws SQLException {
		
		
		Connection conn;
		
		conn = CUtilityStorage.getBasicConnectionPool().getConnection();
		PreparedStatement state = conn.prepareStatement("INSERT INTO `incident`(`libelle`, `description`,"
				+ " `date_ajout`, `date_modif`, `date_fin`, `lieu`, `statut`, `fk_id_entite_superviseur`,"
				+ " `fk_id_mission`, `fk_id_entite_declarant`) VALUES"
				+ "(?,?,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,null,?,?,null,null,null)");
		System.out.print("pute");
		
		state.setString(1,incident.getLibelle());
		state.setString(2,incident.getDescription());		
		state.setString(3, incident.getLieu());
		state.setString(4,incident.getStatut());
		//state.setLong(5, incident.getFkIdEntiteSuperviseur());
		//state.setLong(6, incident.getFkIdEntiteDeclarant());
		
		
		state.execute();
		System.out.print("putain");
		CUtilityStorage.getBasicConnectionPool().releaseConnection(conn);
	
	}

}
