package au.gov.vic.ecodev.mrt.dao;

public interface TemplateConfigDao {

	String getTemplateClasses(final String templateName);
	
	String getOwnerEmails(final String templateName);
}
