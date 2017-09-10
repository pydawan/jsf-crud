package br.org.jsf.crud;

/**
 * <p>Define as ações padrão dos formulários do sistema.</p>
 * @author thiago-amm
 * @version v1.0.0 10/09/2017
 * @since v1.0.0
 */
public enum FormAction {
   
   ADD("Adicionar"),
   EDIT("Editar"),
   REMOVE("Remover"),
   LIST("Listar"),
   FETCH("Buscar"),
   CHECK("Consultar"),
   SEARCH("Pesquisar"),
   CLEAR("Limpar"),
   SAVE("Salvar"),
   CLOSE("Fechar"),
   CANCEL("Cancelar"),
   ENTER("Entrar"),
   UNDEFINED("Indeterminada"),
   NEW("Novo"),
   ACTIVATE("Ativar"),
   INACTIVATE("Inativar"),
   EXPORT("Exportar"),
   PRINT("Imprimir");
   
   private final String value;
   
   private FormAction(final String value) {
      this.value = value;
   }
   
   public String getValue() {
      return value;
   }
   
   @Override
   public String toString() {
      return value;
   }
   
}
