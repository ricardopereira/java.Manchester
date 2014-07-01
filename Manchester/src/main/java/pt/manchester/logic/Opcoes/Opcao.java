package pt.manchester.logic.Opcoes;

public abstract class Opcao {
	
	public enum OpcaoType {
        otCheckBox, otRadioButton, otTextBox
    }
		
	private String caption;
	public String getCaption() {
		return caption;
	}

	private OpcaoType type;
	public OpcaoType getType() {
		return type;
	}

	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}

	public Opcao(String caption, OpcaoType type, String descricao) {
		this.caption = caption;
		this.type = type;
		this.descricao = descricao;
	}
	
}
