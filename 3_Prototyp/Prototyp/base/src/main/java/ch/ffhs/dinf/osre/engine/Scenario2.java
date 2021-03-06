package ch.ffhs.dinf.osre.engine;

public interface Scenario2 {

	final static String AUTHOR = "PDF - Autor";
	final static String FILENAME = "SZENARIO 2 TEST";
	final static String SUBJECT = "Subject of Scenario 2";
	final static String KEYWORDS = "szenario2, pdf-test, loadtest";

	static enum FontType {
		H1, H2, H3, bold, italic, bold_italic, small, normal;

	}

	/**
	 * Set creator of File
	 */
	void setAuthor();

	/**
	 * Defines HELVETICA Size 12 and Normal
	 * 
	 * @throws Exception
	 */
	void setFont(FontType t) throws Exception;

	/**
	 * Prints out every Chapter one by one
	 * 
	 * @throws Exception
	 */
	void createChapters() throws Exception;

	/**
	 * Set Subject Information of the PDF
	 */
	void setSubject();

	/**
	 * Set Keywords that fit PDF
	 */
	void setKeywords();

	/**
	 * Creates a Title
	 */
	void setTitle();

}
