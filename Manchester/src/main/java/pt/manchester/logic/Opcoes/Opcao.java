package pt.manchester.logic.Opcoes;

public abstract class Opcao {
	
	public enum OpcaoType {
        otCheckBox, otRadioButton, otTextBox
    }
		
	private String caption;
	private OpcaoType type;
	private String descricao;
	
	public Opcao(String caption, OpcaoType type, String descricao) {
		this.caption = caption;
		this.type = type;
		this.descricao = descricao;
	}
	
}
